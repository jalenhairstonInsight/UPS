
package com.ups.wsdl.xoltws.rate.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RateService", targetNamespace = "http://www.ups.com/WSDL/XOLTWS/Rate/v1.1", wsdlLocation = "file:/C:/git/POV/UPS/wsdl%20from%20UPS/RateWS.wsdl")
public class RateService
    extends Service
{

    private final static URL RATESERVICE_WSDL_LOCATION;
    private final static WebServiceException RATESERVICE_EXCEPTION;
    private final static QName RATESERVICE_QNAME = new QName("http://www.ups.com/WSDL/XOLTWS/Rate/v1.1", "RateService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/git/POV/UPS/wsdl%20from%20UPS/RateWS.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RATESERVICE_WSDL_LOCATION = url;
        RATESERVICE_EXCEPTION = e;
    }

    public RateService() {
        super(__getWsdlLocation(), RATESERVICE_QNAME);
    }

    public RateService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RATESERVICE_QNAME, features);
    }

    public RateService(URL wsdlLocation) {
        super(wsdlLocation, RATESERVICE_QNAME);
    }

    public RateService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RATESERVICE_QNAME, features);
    }

    public RateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RateService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RatePortType
     */
    @WebEndpoint(name = "RatePort")
    public RatePortType getRatePort() {
        return super.getPort(new QName("http://www.ups.com/WSDL/XOLTWS/Rate/v1.1", "RatePort"), RatePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RatePortType
     */
    @WebEndpoint(name = "RatePort")
    public RatePortType getRatePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ups.com/WSDL/XOLTWS/Rate/v1.1", "RatePort"), RatePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RATESERVICE_EXCEPTION!= null) {
            throw RATESERVICE_EXCEPTION;
        }
        return RATESERVICE_WSDL_LOCATION;
    }

}
