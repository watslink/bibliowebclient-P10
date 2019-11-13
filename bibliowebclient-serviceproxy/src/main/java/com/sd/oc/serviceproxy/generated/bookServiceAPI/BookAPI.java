
package com.sd.oc.serviceproxy.generated.bookServiceAPI;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BookAPI", targetNamespace = "http://API.oc.sd.com/", wsdlLocation = "http://localhost:8080/biblioservice_API_war/bookAPI?wsdl")
public class BookAPI
    extends Service
{

    private final static URL BOOKAPI_WSDL_LOCATION;
    private final static WebServiceException BOOKAPI_EXCEPTION;
    private final static QName BOOKAPI_QNAME = new QName("http://API.oc.sd.com/", "BookAPI");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/biblioservice_API_war/bookAPI?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKAPI_WSDL_LOCATION = url;
        BOOKAPI_EXCEPTION = e;
    }

    public BookAPI() {
        super(__getWsdlLocation(), BOOKAPI_QNAME);
    }

    public BookAPI(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKAPI_QNAME, features);
    }

    public BookAPI(URL wsdlLocation) {
        super(wsdlLocation, BOOKAPI_QNAME);
    }

    public BookAPI(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKAPI_QNAME, features);
    }

    public BookAPI(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookAPI(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BookServiceAPI
     */
    @WebEndpoint(name = "BookServiceAPIPort")
    public BookServiceAPI getBookServiceAPIPort() {
        return super.getPort(new QName("http://API.oc.sd.com/", "BookServiceAPIPort"), BookServiceAPI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookServiceAPI
     */
    @WebEndpoint(name = "BookServiceAPIPort")
    public BookServiceAPI getBookServiceAPIPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://API.oc.sd.com/", "BookServiceAPIPort"), BookServiceAPI.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKAPI_EXCEPTION!= null) {
            throw BOOKAPI_EXCEPTION;
        }
        return BOOKAPI_WSDL_LOCATION;
    }

}
