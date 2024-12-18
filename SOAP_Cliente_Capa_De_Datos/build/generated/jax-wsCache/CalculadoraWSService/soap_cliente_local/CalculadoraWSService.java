
package soap_cliente_local;

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
@WebServiceClient(name = "CalculadoraWSService", targetNamespace = "http://Servidor/", wsdlLocation = "http://192.168.101.11:8080/ServiciosWeb_SOAP_Calculadora1/CalculadoraWSService?WSDL")
public class CalculadoraWSService
    extends Service
{

    private final static URL CALCULADORAWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCULADORAWSSERVICE_EXCEPTION;
    private final static QName CALCULADORAWSSERVICE_QNAME = new QName("http://Servidor/", "CalculadoraWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.101.11:8080/ServiciosWeb_SOAP_Calculadora1/CalculadoraWSService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULADORAWSSERVICE_WSDL_LOCATION = url;
        CALCULADORAWSSERVICE_EXCEPTION = e;
    }

    public CalculadoraWSService() {
        super(__getWsdlLocation(), CALCULADORAWSSERVICE_QNAME);
    }

    public CalculadoraWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULADORAWSSERVICE_QNAME, features);
    }

    public CalculadoraWSService(URL wsdlLocation) {
        super(wsdlLocation, CALCULADORAWSSERVICE_QNAME);
    }

    public CalculadoraWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULADORAWSSERVICE_QNAME, features);
    }

    public CalculadoraWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculadoraWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculadoraWS
     */
    @WebEndpoint(name = "CalculadoraWSPort")
    public CalculadoraWS getCalculadoraWSPort() {
        return super.getPort(new QName("http://Servidor/", "CalculadoraWSPort"), CalculadoraWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculadoraWS
     */
    @WebEndpoint(name = "CalculadoraWSPort")
    public CalculadoraWS getCalculadoraWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servidor/", "CalculadoraWSPort"), CalculadoraWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULADORAWSSERVICE_EXCEPTION!= null) {
            throw CALCULADORAWSSERVICE_EXCEPTION;
        }
        return CALCULADORAWSSERVICE_WSDL_LOCATION;
    }

}
