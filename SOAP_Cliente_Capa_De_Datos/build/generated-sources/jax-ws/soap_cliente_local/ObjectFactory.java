
package soap_cliente_local;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap_cliente_local package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Dividir_QNAME = new QName("http://Servidor/", "dividir");
    private final static QName _DividirResponse_QNAME = new QName("http://Servidor/", "dividirResponse");
    private final static QName _GetContadorPeticiones_QNAME = new QName("http://Servidor/", "getContadorPeticiones");
    private final static QName _GetContadorPeticionesResponse_QNAME = new QName("http://Servidor/", "getContadorPeticionesResponse");
    private final static QName _Multiplicar_QNAME = new QName("http://Servidor/", "multiplicar");
    private final static QName _MultiplicarResponse_QNAME = new QName("http://Servidor/", "multiplicarResponse");
    private final static QName _Restar_QNAME = new QName("http://Servidor/", "restar");
    private final static QName _RestarResponse_QNAME = new QName("http://Servidor/", "restarResponse");
    private final static QName _Sumar_QNAME = new QName("http://Servidor/", "sumar");
    private final static QName _SumarResponse_QNAME = new QName("http://Servidor/", "sumarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap_cliente_local
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dividir }
     * 
     */
    public Dividir createDividir() {
        return new Dividir();
    }

    /**
     * Create an instance of {@link DividirResponse }
     * 
     */
    public DividirResponse createDividirResponse() {
        return new DividirResponse();
    }

    /**
     * Create an instance of {@link GetContadorPeticiones }
     * 
     */
    public GetContadorPeticiones createGetContadorPeticiones() {
        return new GetContadorPeticiones();
    }

    /**
     * Create an instance of {@link GetContadorPeticionesResponse }
     * 
     */
    public GetContadorPeticionesResponse createGetContadorPeticionesResponse() {
        return new GetContadorPeticionesResponse();
    }

    /**
     * Create an instance of {@link Multiplicar }
     * 
     */
    public Multiplicar createMultiplicar() {
        return new Multiplicar();
    }

    /**
     * Create an instance of {@link MultiplicarResponse }
     * 
     */
    public MultiplicarResponse createMultiplicarResponse() {
        return new MultiplicarResponse();
    }

    /**
     * Create an instance of {@link Restar }
     * 
     */
    public Restar createRestar() {
        return new Restar();
    }

    /**
     * Create an instance of {@link RestarResponse }
     * 
     */
    public RestarResponse createRestarResponse() {
        return new RestarResponse();
    }

    /**
     * Create an instance of {@link Sumar }
     * 
     */
    public Sumar createSumar() {
        return new Sumar();
    }

    /**
     * Create an instance of {@link SumarResponse }
     * 
     */
    public SumarResponse createSumarResponse() {
        return new SumarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dividir }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Dividir }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servidor/", name = "dividir")
    public JAXBElement<Dividir> createDividir(Dividir value) {
        return new JAXBElement<Dividir>(_Dividir_QNAME, Dividir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DividirResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DividirResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servidor/", name = "dividirResponse")
    public JAXBElement<DividirResponse> createDividirResponse(DividirResponse value) {
        return new JAXBElement<DividirResponse>(_DividirResponse_QNAME, DividirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContadorPeticiones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContadorPeticiones }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servidor/", name = "getContadorPeticiones")
    public JAXBElement<GetContadorPeticiones> createGetContadorPeticiones(GetContadorPeticiones value) {
        return new JAXBElement<GetContadorPeticiones>(_GetContadorPeticiones_QNAME, GetContadorPeticiones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContadorPeticionesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContadorPeticionesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servidor/", name = "getContadorPeticionesResponse")
    public JAXBElement<GetContadorPeticionesResponse> createGetContadorPeticionesResponse(GetContadorPeticionesResponse value) {
        return new JAXBElement<GetContadorPeticionesResponse>(_GetContadorPeticionesResponse_QNAME, GetContadorPeticionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Multiplicar }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servidor/", name = "multiplicar")
    public JAXBElement<Multiplicar> createMultiplicar(Multiplicar value) {
        return new JAXBElement<Multiplicar>(_Multiplicar_QNAME, Multiplicar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplicarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servidor/", name = "multiplicarResponse")
    public JAXBElement<MultiplicarResponse> createMultiplicarResponse(MultiplicarResponse value) {
        return new JAXBElement<MultiplicarResponse>(_MultiplicarResponse_QNAME, MultiplicarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Restar }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servidor/", name = "restar")
    public JAXBElement<Restar> createRestar(Restar value) {
        return new JAXBElement<Restar>(_Restar_QNAME, Restar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RestarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servidor/", name = "restarResponse")
    public JAXBElement<RestarResponse> createRestarResponse(RestarResponse value) {
        return new JAXBElement<RestarResponse>(_RestarResponse_QNAME, RestarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sumar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sumar }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servidor/", name = "sumar")
    public JAXBElement<Sumar> createSumar(Sumar value) {
        return new JAXBElement<Sumar>(_Sumar_QNAME, Sumar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SumarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servidor/", name = "sumarResponse")
    public JAXBElement<SumarResponse> createSumarResponse(SumarResponse value) {
        return new JAXBElement<SumarResponse>(_SumarResponse_QNAME, SumarResponse.class, null, value);
    }

}
