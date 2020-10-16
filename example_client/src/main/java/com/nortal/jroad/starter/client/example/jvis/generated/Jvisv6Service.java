
package com.nortal.jroad.starter.client.example.jvis.generated;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "jvisv6Service", targetNamespace = "http://jvisv6.x-road.eu/producer", wsdlLocation = "../../../../../../../wsdl/jvis.wsdl")
public class Jvisv6Service
    extends Service
{

    private final static URL JVISV6SERVICE_WSDL_LOCATION;
    private final static WebServiceException JVISV6SERVICE_EXCEPTION;
    private final static QName JVISV6SERVICE_QNAME = new QName("http://jvisv6.x-road.eu/producer", "jvisv6Service");

    static {
        JVISV6SERVICE_WSDL_LOCATION = com.nortal.jroad.starter.client.example.jvis.generated.Jvisv6Service.class.getResource("../../../../../../../wsdl/jvis.wsdl");
        WebServiceException e = null;
        if (JVISV6SERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '../../../../../../../wsdl/jvis.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        JVISV6SERVICE_EXCEPTION = e;
    }

    public Jvisv6Service() {
        super(__getWsdlLocation(), JVISV6SERVICE_QNAME);
    }

    public Jvisv6Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), JVISV6SERVICE_QNAME, features);
    }

    public Jvisv6Service(URL wsdlLocation) {
        super(wsdlLocation, JVISV6SERVICE_QNAME);
    }

    public Jvisv6Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, JVISV6SERVICE_QNAME, features);
    }

    public Jvisv6Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Jvisv6Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Jvisv6PortType
     */
    @WebEndpoint(name = "jvisv6ServicePort")
    public Jvisv6PortType getJvisv6ServicePort() {
        return super.getPort(new QName("http://jvisv6.x-road.eu/producer", "jvisv6ServicePort"), Jvisv6PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Jvisv6PortType
     */
    @WebEndpoint(name = "jvisv6ServicePort")
    public Jvisv6PortType getJvisv6ServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jvisv6.x-road.eu/producer", "jvisv6ServicePort"), Jvisv6PortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (JVISV6SERVICE_EXCEPTION!= null) {
            throw JVISV6SERVICE_EXCEPTION;
        }
        return JVISV6SERVICE_WSDL_LOCATION;
    }

}
