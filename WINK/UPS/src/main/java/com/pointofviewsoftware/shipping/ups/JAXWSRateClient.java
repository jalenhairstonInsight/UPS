/* 
 ** 
 ** Filename: JAXBTrackClient.java 
 ** Authors: United Parcel Service of America
 ** 
 ** The use, disclosure, reproduction, modification, transfer, or transmittal 
 ** of this work for any purpose in any form or by any means without the 
 ** written permission of United Parcel Service is strictly prohibited. 
 ** 
 ** Confidential, Unpublished Property of United Parcel Service. 
 ** Use and Distribution Limited Solely to Authorized Personnel. 
 ** 
 ** Copyright 2009 United Parcel Service of America, Inc.  All Rights Reserved. 
 ** 
 */
package com.pointofviewsoftware.shipping.ups;

import com.ups.wsdl.xoltws.rate.v1.RateErrorMessage;
import com.ups.wsdl.xoltws.rate.v1.RatePortType;
import com.ups.wsdl.xoltws.rate.v1.RateService;
import com.ups.xmlschema.xoltws.common.v1.RequestType;
import com.ups.xmlschema.xoltws.rate.v1.*;
import com.ups.xmlschema.xoltws.upss.v1.UPSSecurity;

import javax.xml.ws.BindingProvider;
import java.util.List;

public class JAXWSRateClient {

    static RateService service;

    private static final String LICENSE_NUMBER = "DCE9C8BFC2454DDA";
    private static final String USER_NAME = "ChMokbel1";

    private static final String PASSWORD(){
    	 return "**password**";
    }

    //Prod "https://onlinetools.ups.com/webservices/Rate"
// Dev "https://wwwcie.ups.com/webservices/Rate"/>
    private static final String ENDPOINT_URL = "https://wwwcie.ups.com/webservices/Rate";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            service = new RateService();
            RatePortType ratePortType = service.getRatePort();

            BindingProvider bp = (BindingProvider) ratePortType;
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ENDPOINT_URL);

            RateResponse rateResponse = ratePortType.processRate(populateRateRequest(), populateUPSSecurity());

            String statusCode = rateResponse.getResponse().getResponseStatus().getCode();
            String description = rateResponse.getResponse().getResponseStatus().getDescription();
            System.err.println(statusCode + " " + description);
            for (RatedShipmentType r : rateResponse.getRatedShipment()) {
                System.err.println(r.getService().getCode() + " " + r.getTotalCharges().getMonetaryValue() + " " + r.getTotalCharges().getCurrencyCode());

            }
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
        }
    }

    private static RateRequest populateRateRequest() {
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
        shipper.setName("Wink Technologies Inc.");
        shipper.setShipperNumber("Y3Y202");
        AddressType shipperAddress = new AddressType();

        //String[] addressLines = { "Southam Rd", "Apt 3B" };
        //shipperAddress.setAddressLine(addressLines);
        List<String> addressLine = shipperAddress.getAddressLine();
        addressLine.add("255 hymus");
        // addressLine.add("Apt 3B");

        shipperAddress.setCity("Montreal");
        shipperAddress.setPostalCode("H8R 1G6");
        shipperAddress.setStateProvinceCode("QC");
        shipperAddress.setCountryCode("CA");
        shipper.setAddress(shipperAddress);
        shpmnt.setShipper(shipper);
        /**
         * ******Shipper*********************
         */

        /**
         * ************ShipFrom******************
         */
        ShipFromType shipFrom = new ShipFromType();
        shipFrom.setName("XYZ Associates");
        AddressType shipFromAddress = new AddressType();
        //shipFromAddress.setAddressLine(addressLines);
        List<String> shipFromAddressLine = shipFromAddress.getAddressLine();
        shipFromAddressLine.add("255 hymus");
        //shipFromAddressLine.add("Apt 3B");

        shipFromAddress.setCity("Montreal");
        shipFromAddress.setPostalCode("H8R 1G6");
        shipFromAddress.setStateProvinceCode("QC");
        shipFromAddress.setCountryCode("CA");
        shipFrom.setAddress(shipFromAddress);
        shpmnt.setShipFrom(shipFrom);
        /**
         * ***********ShipFrom*********************
         */

        /**
         * ************ShipTo******************
         */
        ShipToType shipTo = new ShipToType();
        shipTo.setName("PQR Associates");
        ShipToAddressType shipToAddress = new ShipToAddressType();
        //String[] shipToAddressLines = { "SomeUnknownStreet" };
        //shipToAddress.setAddressLine(shipToAddressLines);
        List<String> shipToAddresLine = shipToAddress.getAddressLine();
        shipToAddresLine.add("1041 bellevue");
        shipToAddress.setCity("Montreal");
        shipToAddress.setPostalCode("H9C 2Z4");
        shipToAddress.setStateProvinceCode("QC");
        shipToAddress.setCountryCode("CA");
        shipTo.setAddress(shipToAddress);
        shpmnt.setShipTo(shipTo);
        /**
         * ***********ShipTo*********************
         */

        /**
         * ********Service**********************
         */
        CodeDescriptionType service = new CodeDescriptionType();
        service.setCode("02");
        service.setDescription("Next Day Air");
        //shpmnt.setService(service);
        /**
         * ********Service**********************
         */

        /**
         * ******************Package*****************
         */
        PackageType pkg1 = new PackageType();
        CodeDescriptionType pkgingType = new CodeDescriptionType();
        pkgingType.setCode("01");
        pkgingType.setDescription("UPS Letter");
        pkg1.setPackagingType(pkgingType);
        PackageWeightType pkgWeight = new PackageWeightType();
        CodeDescriptionType UOMType = new CodeDescriptionType();
        UOMType.setCode("lbs");
        UOMType.setDescription("Pounds");
        pkgWeight.setUnitOfMeasurement(UOMType);
        pkgWeight.setWeight("30");
        pkg1.setPackageWeight(pkgWeight);
		//PackageType[] pkgArray = { pkg1 };

        //shpmnt.set_package(pkgArray);
        List<PackageType> pTypeList = shpmnt.getPackage();
        pTypeList.add(pkg1);
        /**
         * ******************Package*****************
         */
        rateRequest.setShipment(shpmnt);
        return rateRequest;
    }

    private static UPSSecurity populateUPSSecurity() {
        UPSSecurity upss = new UPSSecurity();
        UPSSecurity.ServiceAccessToken upsSvcToken = new UPSSecurity.ServiceAccessToken();
        upsSvcToken.setAccessLicenseNumber(LICENSE_NUMBER);
        upss.setServiceAccessToken(upsSvcToken);
        UPSSecurity.UsernameToken upsSecUsrnameToken = new UPSSecurity.UsernameToken();
        upsSecUsrnameToken.setUsername(USER_NAME);
        upsSecUsrnameToken.setPassword(PASSWORD());
        upss.setUsernameToken(upsSecUsrnameToken);
        return upss;
    }

}
