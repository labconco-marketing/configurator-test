
package com.infor.pcm;

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
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProductConfiguratorService", targetNamespace = "http://tempuri.org/", wsdlLocation = "https://configurator.inforcloudsuite.com/api/v3/ProductConfigurator.svc?wsdl")
public class ProductConfiguratorService
    extends Service
{

    private final static URL PRODUCTCONFIGURATORSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTCONFIGURATORSERVICE_EXCEPTION;
    private final static QName PRODUCTCONFIGURATORSERVICE_QNAME = new QName("http://tempuri.org/", "ProductConfiguratorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://configurator.inforcloudsuite.com/api/v3/ProductConfigurator.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTCONFIGURATORSERVICE_WSDL_LOCATION = url;
        PRODUCTCONFIGURATORSERVICE_EXCEPTION = e;
    }

    public ProductConfiguratorService() {
        super(__getWsdlLocation(), PRODUCTCONFIGURATORSERVICE_QNAME);
    }

    public ProductConfiguratorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTCONFIGURATORSERVICE_QNAME, features);
    }

    public ProductConfiguratorService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTCONFIGURATORSERVICE_QNAME);
    }

    public ProductConfiguratorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTCONFIGURATORSERVICE_QNAME, features);
    }

    public ProductConfiguratorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductConfiguratorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductConfiguratorServiceProxy
     */
    @WebEndpoint(name = "CustomBinding_ProductConfiguratorServiceProxy")
    public ProductConfiguratorServiceProxy getCustomBindingProductConfiguratorServiceProxy() {
        return super.getPort(new QName("http://tempuri.org/", "CustomBinding_ProductConfiguratorServiceProxy"), ProductConfiguratorServiceProxy.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductConfiguratorServiceProxy
     */
    @WebEndpoint(name = "CustomBinding_ProductConfiguratorServiceProxy")
    public ProductConfiguratorServiceProxy getCustomBindingProductConfiguratorServiceProxy(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "CustomBinding_ProductConfiguratorServiceProxy"), ProductConfiguratorServiceProxy.class, features);
    }

    /**
     * 
     * @return
     *     returns ProductConfiguratorServiceProxy
     */
    @WebEndpoint(name = "BasicHttpsBinding_ProductConfiguratorServiceProxy")
    public ProductConfiguratorServiceProxy getBasicHttpsBindingProductConfiguratorServiceProxy() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpsBinding_ProductConfiguratorServiceProxy"), ProductConfiguratorServiceProxy.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductConfiguratorServiceProxy
     */
    @WebEndpoint(name = "BasicHttpsBinding_ProductConfiguratorServiceProxy")
    public ProductConfiguratorServiceProxy getBasicHttpsBindingProductConfiguratorServiceProxy(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpsBinding_ProductConfiguratorServiceProxy"), ProductConfiguratorServiceProxy.class, features);
    }

    /**
     * 
     * @return
     *     returns ProductConfiguratorServiceProxy
     */
    @WebEndpoint(name = "WSHttpBinding_ProductConfiguratorServiceProxy")
    public ProductConfiguratorServiceProxy getWSHttpBindingProductConfiguratorServiceProxy() {
        return super.getPort(new QName("http://tempuri.org/", "WSHttpBinding_ProductConfiguratorServiceProxy"), ProductConfiguratorServiceProxy.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductConfiguratorServiceProxy
     */
    @WebEndpoint(name = "WSHttpBinding_ProductConfiguratorServiceProxy")
    public ProductConfiguratorServiceProxy getWSHttpBindingProductConfiguratorServiceProxy(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "WSHttpBinding_ProductConfiguratorServiceProxy"), ProductConfiguratorServiceProxy.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTCONFIGURATORSERVICE_EXCEPTION!= null) {
            throw PRODUCTCONFIGURATORSERVICE_EXCEPTION;
        }
        return PRODUCTCONFIGURATORSERVICE_WSDL_LOCATION;
    }

}