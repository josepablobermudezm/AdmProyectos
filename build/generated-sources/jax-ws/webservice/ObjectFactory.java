
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _GetProyectoPorIDResponse_QNAME = new QName("http://webService/", "getProyectoPorIDResponse");
    private final static QName _GetAdministradorResponse_QNAME = new QName("http://webService/", "getAdministradorResponse");
    private final static QName _GetAdministradorById_QNAME = new QName("http://webService/", "getAdministradorById");
    private final static QName _GetAdministradorByIdResponse_QNAME = new QName("http://webService/", "getAdministradorByIdResponse");
    private final static QName _EliminarAdministradorResponse_QNAME = new QName("http://webService/", "eliminarAdministradorResponse");
    private final static QName _GetAdministrador_QNAME = new QName("http://webService/", "getAdministrador");
    private final static QName _ProyectoDto_QNAME = new QName("http://webService/", "ProyectoDto");
    private final static QName _GetUsuario_QNAME = new QName("http://webService/", "getUsuario");
    private final static QName _AdministradorDto_QNAME = new QName("http://webService/", "AdministradorDto");
    private final static QName _EliminarAdministrador_QNAME = new QName("http://webService/", "eliminarAdministrador");
    private final static QName _GuardarAdministrador_QNAME = new QName("http://webService/", "guardarAdministrador");
    private final static QName _GuardarAdministradorResponse_QNAME = new QName("http://webService/", "guardarAdministradorResponse");
    private final static QName _GetProyectoPorID_QNAME = new QName("http://webService/", "getProyectoPorID");
    private final static QName _GetUsuarioResponse_QNAME = new QName("http://webService/", "getUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GuardarAdministrador }
     * 
     */
    public GuardarAdministrador createGuardarAdministrador() {
        return new GuardarAdministrador();
    }

    /**
     * Create an instance of {@link EliminarAdministrador }
     * 
     */
    public EliminarAdministrador createEliminarAdministrador() {
        return new EliminarAdministrador();
    }

    /**
     * Create an instance of {@link AdministradorDto }
     * 
     */
    public AdministradorDto createAdministradorDto() {
        return new AdministradorDto();
    }

    /**
     * Create an instance of {@link GetUsuarioResponse }
     * 
     */
    public GetUsuarioResponse createGetUsuarioResponse() {
        return new GetUsuarioResponse();
    }

    /**
     * Create an instance of {@link GetProyectoPorID }
     * 
     */
    public GetProyectoPorID createGetProyectoPorID() {
        return new GetProyectoPorID();
    }

    /**
     * Create an instance of {@link GuardarAdministradorResponse }
     * 
     */
    public GuardarAdministradorResponse createGuardarAdministradorResponse() {
        return new GuardarAdministradorResponse();
    }

    /**
     * Create an instance of {@link GetAdministradorById }
     * 
     */
    public GetAdministradorById createGetAdministradorById() {
        return new GetAdministradorById();
    }

    /**
     * Create an instance of {@link GetAdministradorByIdResponse }
     * 
     */
    public GetAdministradorByIdResponse createGetAdministradorByIdResponse() {
        return new GetAdministradorByIdResponse();
    }

    /**
     * Create an instance of {@link GetAdministradorResponse }
     * 
     */
    public GetAdministradorResponse createGetAdministradorResponse() {
        return new GetAdministradorResponse();
    }

    /**
     * Create an instance of {@link GetProyectoPorIDResponse }
     * 
     */
    public GetProyectoPorIDResponse createGetProyectoPorIDResponse() {
        return new GetProyectoPorIDResponse();
    }

    /**
     * Create an instance of {@link GetAdministrador }
     * 
     */
    public GetAdministrador createGetAdministrador() {
        return new GetAdministrador();
    }

    /**
     * Create an instance of {@link GetUsuario }
     * 
     */
    public GetUsuario createGetUsuario() {
        return new GetUsuario();
    }

    /**
     * Create an instance of {@link ProyectoDto }
     * 
     */
    public ProyectoDto createProyectoDto() {
        return new ProyectoDto();
    }

    /**
     * Create an instance of {@link EliminarAdministradorResponse }
     * 
     */
    public EliminarAdministradorResponse createEliminarAdministradorResponse() {
        return new EliminarAdministradorResponse();
    }

    /**
     * Create an instance of {@link Respuesta }
     * 
     */
    public Respuesta createRespuesta() {
        return new Respuesta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProyectoPorIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getProyectoPorIDResponse")
    public JAXBElement<GetProyectoPorIDResponse> createGetProyectoPorIDResponse(GetProyectoPorIDResponse value) {
        return new JAXBElement<GetProyectoPorIDResponse>(_GetProyectoPorIDResponse_QNAME, GetProyectoPorIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdministradorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getAdministradorResponse")
    public JAXBElement<GetAdministradorResponse> createGetAdministradorResponse(GetAdministradorResponse value) {
        return new JAXBElement<GetAdministradorResponse>(_GetAdministradorResponse_QNAME, GetAdministradorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdministradorById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getAdministradorById")
    public JAXBElement<GetAdministradorById> createGetAdministradorById(GetAdministradorById value) {
        return new JAXBElement<GetAdministradorById>(_GetAdministradorById_QNAME, GetAdministradorById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdministradorByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getAdministradorByIdResponse")
    public JAXBElement<GetAdministradorByIdResponse> createGetAdministradorByIdResponse(GetAdministradorByIdResponse value) {
        return new JAXBElement<GetAdministradorByIdResponse>(_GetAdministradorByIdResponse_QNAME, GetAdministradorByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAdministradorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "eliminarAdministradorResponse")
    public JAXBElement<EliminarAdministradorResponse> createEliminarAdministradorResponse(EliminarAdministradorResponse value) {
        return new JAXBElement<EliminarAdministradorResponse>(_EliminarAdministradorResponse_QNAME, EliminarAdministradorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdministrador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getAdministrador")
    public JAXBElement<GetAdministrador> createGetAdministrador(GetAdministrador value) {
        return new JAXBElement<GetAdministrador>(_GetAdministrador_QNAME, GetAdministrador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProyectoDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "ProyectoDto")
    public JAXBElement<ProyectoDto> createProyectoDto(ProyectoDto value) {
        return new JAXBElement<ProyectoDto>(_ProyectoDto_QNAME, ProyectoDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getUsuario")
    public JAXBElement<GetUsuario> createGetUsuario(GetUsuario value) {
        return new JAXBElement<GetUsuario>(_GetUsuario_QNAME, GetUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdministradorDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "AdministradorDto")
    public JAXBElement<AdministradorDto> createAdministradorDto(AdministradorDto value) {
        return new JAXBElement<AdministradorDto>(_AdministradorDto_QNAME, AdministradorDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAdministrador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "eliminarAdministrador")
    public JAXBElement<EliminarAdministrador> createEliminarAdministrador(EliminarAdministrador value) {
        return new JAXBElement<EliminarAdministrador>(_EliminarAdministrador_QNAME, EliminarAdministrador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarAdministrador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "guardarAdministrador")
    public JAXBElement<GuardarAdministrador> createGuardarAdministrador(GuardarAdministrador value) {
        return new JAXBElement<GuardarAdministrador>(_GuardarAdministrador_QNAME, GuardarAdministrador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarAdministradorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "guardarAdministradorResponse")
    public JAXBElement<GuardarAdministradorResponse> createGuardarAdministradorResponse(GuardarAdministradorResponse value) {
        return new JAXBElement<GuardarAdministradorResponse>(_GuardarAdministradorResponse_QNAME, GuardarAdministradorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProyectoPorID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getProyectoPorID")
    public JAXBElement<GetProyectoPorID> createGetProyectoPorID(GetProyectoPorID value) {
        return new JAXBElement<GetProyectoPorID>(_GetProyectoPorID_QNAME, GetProyectoPorID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getUsuarioResponse")
    public JAXBElement<GetUsuarioResponse> createGetUsuarioResponse(GetUsuarioResponse value) {
        return new JAXBElement<GetUsuarioResponse>(_GetUsuarioResponse_QNAME, GetUsuarioResponse.class, null, value);
    }

}
