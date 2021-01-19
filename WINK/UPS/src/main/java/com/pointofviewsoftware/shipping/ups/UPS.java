/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pointofviewsoftware.shipping.ups;

import com.pointofviewsoftware.shipping.Package;
import com.pointofviewsoftware.shipping.*;
import com.ups.wsdl.xoltws.rate.v1.RateErrorMessage;
import com.ups.wsdl.xoltws.rate.v1.RatePortType;
import com.ups.wsdl.xoltws.rate.v1.RateService;
import com.ups.xmlschema.xoltws.common.v1.RequestType;
import com.ups.xmlschema.xoltws.rate.v1.*;
import com.ups.xmlschema.xoltws.upss.v1.UPSSecurity;

import javax.xml.ws.BindingProvider;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 */
public class UPS implements IWinkShipper {
    //Prod "https://onlinetools.ups.com/webservices/Rate"
    // Dev "https://wwwcie.ups.com/webservices/Rate"/>

    private RateService service;

    private String LICENSE_NUMBER;
    private String USER_NAME;
    private String PASSWORD;
    private String ENDPOINT_URL;

    private APICredentials credentials;

    @Override
    public List<Rate> getRate(APICredentials credentials, Address shipper, Address fromAddress, Address toAddress, List<Package> packageItems, Rate.CURRENCY currency) throws Exception {

        LICENSE_NUMBER = credentials.getKey();
        USER_NAME = credentials.getUsername();
        PASSWORD = credentials.getPassword();
        ENDPOINT_URL = credentials.getEndpoint_url();
this.credentials = credentials;
        try {
            service = new RateService();
            RatePortType ratePortType = service.getRatePort();

            BindingProvider bp = (BindingProvider) ratePortType;
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ENDPOINT_URL);

            RateResponse rateResponse = ratePortType.processRate(populateRateRequest(shipper, fromAddress, toAddress, packageItems), populateUPSSecurity());

            String statusCode = rateResponse.getResponse().getResponseStatus().getCode();
            String description = rateResponse.getResponse().getResponseStatus().getDescription();
            System.err.println(statusCode + " " + description);
            List<Rate> result = new ArrayList<Rate>(rateResponse.getRatedShipment().size());

            for (RatedShipmentType r : rateResponse.getRatedShipment()) {
                System.err.println(r.getService().getCode() + " " + r.getTotalCharges().getMonetaryValue() + " " + r.getTotalCharges().getCurrencyCode());
                Rate rate = new Rate();
                rate.setMethod((Address.isNull(r.getService().getCode()) + " " + Address.isNull(r.getService().getDescription())).trim());
                rate.setRate(Double.parseDouble(r.getTotalCharges().getMonetaryValue()));
                if (r.getTotalCharges().getCurrencyCode().equalsIgnoreCase("CAD")) {
                    rate.setCurrency(Rate.CURRENCY.CAD);
                } else if (r.getTotalCharges().getCurrencyCode().equalsIgnoreCase("USD")) {
                    rate.setCurrency(Rate.CURRENCY.USD);
                }
                result.add(rate);
            }

            return result;
        } catch (Exception e) {
            if (e instanceof RateErrorMessage) {
                RateErrorMessage rateErrMsg = ((RateErrorMessage) e);
                String statusCode = rateErrMsg.getFaultInfo().getErrorDetail().get(0).getPrimaryErrorCode().getCode();
                String description = rateErrMsg.getFaultInfo().getErrorDetail().get(0).getPrimaryErrorCode().getDescription();
                System.err.println(statusCode + " " + description);
            } else {
                String statusCode = e.getMessage();
                String description = e.toString();
                System.err.println(statusCode + " " + description);
            }
            e.printStackTrace();
            throw e;
        }

    }

    private RateRequest populateRateRequest(Address winkShipper, Address winkFromAddress, Address winkToAddress, List<Package> winkPackageItems) {
        RateRequest rateRequest = new RateRequest();
        RequestType request = new RequestType();
        //String[] requestOption = { "rate" };
        //request.setRequestOption(requestOption);
        List<String> requestOptionList = request.getRequestOption();
        requestOptionList.add("shop");
        rateRequest.setRequest(request);

        ShipmentType shpmnt = new ShipmentType();

        /**
         * *******Shipper********************
         */
        ShipperType shipper = new ShipperType();
        shipper.setName(winkShipper.getName());
        shipper.setShipperNumber(credentials.getAccountNumber());
        shipper.setAddress(getAddressType(winkShipper));
        shpmnt.setShipper(shipper);
        /**
         * ******Shipper*********************
         */

        /**
         * ************ShipFrom******************
         */
        ShipFromType shipFrom = new ShipFromType();
        shipFrom.setName(winkFromAddress.getName());
        shipFrom.setAddress(getAddressType(winkFromAddress));
        shpmnt.setShipFrom(shipFrom);
        /**
         * ***********ShipFrom*********************
         */

        /**
         * ************ShipTo******************
         */
        ShipToType shipTo = new ShipToType();
        shipTo.setName(winkToAddress.getName());
        shipTo.setAddress(getShipToAddressType(winkToAddress));
        shpmnt.setShipTo(shipTo);
        /**
         * ***********ShipTo*********************
         */

        /**
         * ********Service**********************
         */
        /**
         * CodeDescriptionType service = new CodeDescriptionType();
         * service.setCode("02"); service.setDescription("Next Day Air");
         * shpmnt.setService(service);
         */
        /**
         * ********Service**********************
         */
        /**
         * ******************Package*****************
         */
        //PackageType[] pkgArray = { pkg1 };
        //shpmnt.set_package(pkgArray);
        List<PackageType> pTypeList = shpmnt.getPackage();
        for (Package winkPackage : winkPackageItems) {
            pTypeList.add(getPackageType(winkPackage));
        }
        /**
         * ******************Package*****************
         */
        rateRequest.setShipment(shpmnt);
        return rateRequest;
    }

    private PackageType getPackageType(Package p) {
        PackageType pkg1 = new PackageType();
        CodeDescriptionType pkgingType = new CodeDescriptionType();
        /**
         * 00 = Unknown 01 = UPS Letter 02 = Package/customer supplied 03 = UPS
         * Tube 04 = UPS Pak 21 = Express Box 24 = 25KG Box 25 = 10KG Box 30 =
         * Pallet 2a = Small Express Box 2b = Medium Express Box 2c = Large
         * Express Box          *
         */
        pkgingType.setCode("02");
        pkgingType.setDescription("Package/customer supplied");
        pkg1.setPackagingType(pkgingType);
        PackageWeightType pkgWeight = new PackageWeightType();
        CodeDescriptionType UOMType = new CodeDescriptionType();
        UOMType.setCode("lbs");
        UOMType.setDescription("Pounds");
        pkgWeight.setUnitOfMeasurement(UOMType);
        pkgWeight.setWeight(String.valueOf(p.getWeight()));
        pkg1.setPackageWeight(pkgWeight);
        DimensionsType dimensionType = new DimensionsType();

        UOMType = new CodeDescriptionType();
        UOMType.setCode("in");
        UOMType.setDescription("Inches");
        dimensionType.setUnitOfMeasurement(UOMType);
        dimensionType.setHeight(String.valueOf(p.getHeight()));
        dimensionType.setWidth(String.valueOf(p.getWidth()));
        dimensionType.setLength(String.valueOf(p.getLength()));
        pkg1.setDimensions(dimensionType);

        return pkg1;
    }

    private AddressType getAddressType(Address a) {
        AddressType address = new AddressType();

        //String[] addressLines = { "Southam Rd", "Apt 3B" };
        //shipperAddress.setAddressLine(addressLines);
        List<String> addressLine = address.getAddressLine();
        addressLine.add(a.getAddressLine());
        // addressLine.add("Apt 3B");

        address.setCity(a.getCity());
        address.setPostalCode(a.getPostalZipCode());
        address.setStateProvinceCode(a.getStateProv());
        address.setCountryCode(a.getCountry());

        return address;
    }

    private ShipToAddressType getShipToAddressType(Address a) {
        ShipToAddressType address = new ShipToAddressType();

        //String[] addressLines = { "Southam Rd", "Apt 3B" };
        //shipperAddress.setAddressLine(addressLines);
        List<String> addressLine = address.getAddressLine();
        addressLine.add(a.getAddressLine());
        // addressLine.add("Apt 3B");

        address.setCity(a.getCity());
        address.setPostalCode(a.getPostalZipCode());
        address.setStateProvinceCode(a.getStateProv());
        address.setCountryCode(a.getCountry());

        return address;
    }

    private UPSSecurity populateUPSSecurity() {
        UPSSecurity upss = new UPSSecurity();
        UPSSecurity.ServiceAccessToken upsSvcToken = new UPSSecurity.ServiceAccessToken();
        upsSvcToken.setAccessLicenseNumber(LICENSE_NUMBER);
        upss.setServiceAccessToken(upsSvcToken);
        UPSSecurity.UsernameToken upsSecUsrnameToken = new UPSSecurity.UsernameToken();
        upsSecUsrnameToken.setUsername(USER_NAME);
        upsSecUsrnameToken.setPassword(PASSWORD);
        upss.setUsernameToken(upsSecUsrnameToken);
        return upss;
    }
}
