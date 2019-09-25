
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

    private final static QName _EliminarProyecto_QNAME = new QName("http://webService/", "eliminarProyecto");
    private final static QName _EliminarAdministradorResponse_QNAME = new QName("http://webService/", "eliminarAdministradorResponse");
    private final static QName _GetAdministrador_QNAME = new QName("http://webService/", "getAdministrador");
    private final static QName _GuardarActividad_QNAME = new QName("http://webService/", "guardarActividad");
    private final static QName _EliminarSeguimientoResponse_QNAME = new QName("http://webService/", "eliminarSeguimientoResponse");
    private final static QName _GetUsuarioResponse_QNAME = new QName("http://webService/", "getUsuarioResponse");
    private final static QName _GetAdministradorResponse_QNAME = new QName("http://webService/", "getAdministradorResponse");
    private final static QName _GuardarProyecto_QNAME = new QName("http://webService/", "guardarProyecto");
    private final static QName _GuardarActividadResponse_QNAME = new QName("http://webService/", "guardarActividadResponse");
    private final static QName _EliminarActividad_QNAME = new QName("http://webService/", "eliminarActividad");
    private final static QName _EliminarProyectoResponse_QNAME = new QName("http://webService/", "eliminarProyectoResponse");
    private final static QName _GetProyecto_QNAME = new QName("http://webService/", "getProyecto");
    private final static QName _GetProyectoResponse_QNAME = new QName("http://webService/", "getProyectoResponse");
    private final static QName _GuardarProyectoResponse_QNAME = new QName("http://webService/", "guardarProyectoResponse");
    private final static QName _GuardarSeguimiento_QNAME = new QName("http://webService/", "guardarSeguimiento");
    private final static QName _ProyectoDto_QNAME = new QName("http://webService/", "ProyectoDto");
    private final static QName _ActividadesDto_QNAME = new QName("http://webService/", "ActividadesDto");
    private final static QName _GetUsuario_QNAME = new QName("http://webService/", "getUsuario");
    private final static QName _GuardarSeguimientoResponse_QNAME = new QName("http://webService/", "guardarSeguimientoResponse");
    private final static QName _AdministradorDto_QNAME = new QName("http://webService/", "AdministradorDto");
    private final static QName _EliminarSeguimiento_QNAME = new QName("http://webService/", "eliminarSeguimiento");
    private final static QName _SeguimientoDto_QNAME = new QName("http://webService/", "SeguimientoDto");
    private final static QName _EliminarAdministrador_QNAME = new QName("http://webService/", "eliminarAdministrador");
    private final static QName _GuardarAdministrador_QNAME = new QName("http://webService/", "guardarAdministrador");
    private final static QName _EliminarActividadResponse_QNAME = new QName("http://webService/", "eliminarActividadResponse");
    private final static QName _GuardarAdministradorResponse_QNAME = new QName("http://webService/", "guardarAdministradorResponse");

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
     * Create an instance of {@link SeguimientoDto }
     * 
     */
    public SeguimientoDto createSeguimientoDto() {
        return new SeguimientoDto();
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
     * Create an instance of {@link EliminarSeguimiento }
     * 
     */
    public EliminarSeguimiento createEliminarSeguimiento() {
        return new EliminarSeguimiento();
    }

    /**
     * Create an instance of {@link EliminarActividadResponse }
     * 
     */
    public EliminarActividadResponse createEliminarActividadResponse() {
        return new EliminarActividadResponse();
    }

    /**
     * Create an instance of {@link GuardarAdministradorResponse }
     * 
     */
    public GuardarAdministradorResponse createGuardarAdministradorResponse() {
        return new GuardarAdministradorResponse();
    }

    /**
     * Create an instance of {@link GuardarActividadResponse }
     * 
     */
    public GuardarActividadResponse createGuardarActividadResponse() {
        return new GuardarActividadResponse();
    }

    /**
     * Create an instance of {@link EliminarActividad }
     * 
     */
    public EliminarActividad createEliminarActividad() {
        return new EliminarActividad();
    }

    /**
     * Create an instance of {@link EliminarProyectoResponse }
     * 
     */
    public EliminarProyectoResponse createEliminarProyectoResponse() {
        return new EliminarProyectoResponse();
    }

    /**
     * Create an instance of {@link GetAdministradorResponse }
     * 
     */
    public GetAdministradorResponse createGetAdministradorResponse() {
        return new GetAdministradorResponse();
    }

    /**
     * Create an instance of {@link GuardarProyecto }
     * 
     */
    public GuardarProyecto createGuardarProyecto() {
        return new GuardarProyecto();
    }

    /**
     * Create an instance of {@link GuardarSeguimiento }
     * 
     */
    public GuardarSeguimiento createGuardarSeguimiento() {
        return new GuardarSeguimiento();
    }

    /**
     * Create an instance of {@link ActividadesDto }
     * 
     */
    public ActividadesDto createActividadesDto() {
        return new ActividadesDto();
    }

    /**
     * Create an instance of {@link GetUsuario }
     * 
     */
    public GetUsuario createGetUsuario() {
        return new GetUsuario();
    }

    /**
     * Create an instance of {@link GuardarSeguimientoResponse }
     * 
     */
    public GuardarSeguimientoResponse createGuardarSeguimientoResponse() {
        return new GuardarSeguimientoResponse();
    }

    /**
     * Create an instance of {@link ProyectoDto }
     * 
     */
    public ProyectoDto createProyectoDto() {
        return new ProyectoDto();
    }

    /**
     * Create an instance of {@link GetProyecto }
     * 
     */
    public GetProyecto createGetProyecto() {
        return new GetProyecto();
    }

    /**
     * Create an instance of {@link GuardarProyectoResponse }
     * 
     */
    public GuardarProyectoResponse createGuardarProyectoResponse() {
        return new GuardarProyectoResponse();
    }

    /**
     * Create an instance of {@link GetProyectoResponse }
     * 
     */
    public GetProyectoResponse createGetProyectoResponse() {
        return new GetProyectoResponse();
    }

    /**
     * Create an instance of {@link GetUsuarioResponse }
     * 
     */
    public GetUsuarioResponse createGetUsuarioResponse() {
        return new GetUsuarioResponse();
    }

    /**
     * Create an instance of {@link EliminarProyecto }
     * 
     */
    public EliminarProyecto createEliminarProyecto() {
        return new EliminarProyecto();
    }

    /**
     * Create an instance of {@link GetAdministrador }
     * 
     */
    public GetAdministrador createGetAdministrador() {
        return new GetAdministrador();
    }

    /**
     * Create an instance of {@link GuardarActividad }
     * 
     */
    public GuardarActividad createGuardarActividad() {
        return new GuardarActividad();
    }

    /**
     * Create an instance of {@link EliminarSeguimientoResponse }
     * 
     */
    public EliminarSeguimientoResponse createEliminarSeguimientoResponse() {
        return new EliminarSeguimientoResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarProyecto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "eliminarProyecto")
    public JAXBElement<EliminarProyecto> createEliminarProyecto(EliminarProyecto value) {
        return new JAXBElement<EliminarProyecto>(_EliminarProyecto_QNAME, EliminarProyecto.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarActividad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "guardarActividad")
    public JAXBElement<GuardarActividad> createGuardarActividad(GuardarActividad value) {
        return new JAXBElement<GuardarActividad>(_GuardarActividad_QNAME, GuardarActividad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarSeguimientoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "eliminarSeguimientoResponse")
    public JAXBElement<EliminarSeguimientoResponse> createEliminarSeguimientoResponse(EliminarSeguimientoResponse value) {
        return new JAXBElement<EliminarSeguimientoResponse>(_EliminarSeguimientoResponse_QNAME, EliminarSeguimientoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getUsuarioResponse")
    public JAXBElement<GetUsuarioResponse> createGetUsuarioResponse(GetUsuarioResponse value) {
        return new JAXBElement<GetUsuarioResponse>(_GetUsuarioResponse_QNAME, GetUsuarioResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarProyecto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "guardarProyecto")
    public JAXBElement<GuardarProyecto> createGuardarProyecto(GuardarProyecto value) {
        return new JAXBElement<GuardarProyecto>(_GuardarProyecto_QNAME, GuardarProyecto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarActividadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "guardarActividadResponse")
    public JAXBElement<GuardarActividadResponse> createGuardarActividadResponse(GuardarActividadResponse value) {
        return new JAXBElement<GuardarActividadResponse>(_GuardarActividadResponse_QNAME, GuardarActividadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarActividad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "eliminarActividad")
    public JAXBElement<EliminarActividad> createEliminarActividad(EliminarActividad value) {
        return new JAXBElement<EliminarActividad>(_EliminarActividad_QNAME, EliminarActividad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarProyectoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "eliminarProyectoResponse")
    public JAXBElement<EliminarProyectoResponse> createEliminarProyectoResponse(EliminarProyectoResponse value) {
        return new JAXBElement<EliminarProyectoResponse>(_EliminarProyectoResponse_QNAME, EliminarProyectoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProyecto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getProyecto")
    public JAXBElement<GetProyecto> createGetProyecto(GetProyecto value) {
        return new JAXBElement<GetProyecto>(_GetProyecto_QNAME, GetProyecto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProyectoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getProyectoResponse")
    public JAXBElement<GetProyectoResponse> createGetProyectoResponse(GetProyectoResponse value) {
        return new JAXBElement<GetProyectoResponse>(_GetProyectoResponse_QNAME, GetProyectoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarProyectoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "guardarProyectoResponse")
    public JAXBElement<GuardarProyectoResponse> createGuardarProyectoResponse(GuardarProyectoResponse value) {
        return new JAXBElement<GuardarProyectoResponse>(_GuardarProyectoResponse_QNAME, GuardarProyectoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarSeguimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "guardarSeguimiento")
    public JAXBElement<GuardarSeguimiento> createGuardarSeguimiento(GuardarSeguimiento value) {
        return new JAXBElement<GuardarSeguimiento>(_GuardarSeguimiento_QNAME, GuardarSeguimiento.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ActividadesDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "ActividadesDto")
    public JAXBElement<ActividadesDto> createActividadesDto(ActividadesDto value) {
        return new JAXBElement<ActividadesDto>(_ActividadesDto_QNAME, ActividadesDto.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarSeguimientoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "guardarSeguimientoResponse")
    public JAXBElement<GuardarSeguimientoResponse> createGuardarSeguimientoResponse(GuardarSeguimientoResponse value) {
        return new JAXBElement<GuardarSeguimientoResponse>(_GuardarSeguimientoResponse_QNAME, GuardarSeguimientoResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarSeguimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "eliminarSeguimiento")
    public JAXBElement<EliminarSeguimiento> createEliminarSeguimiento(EliminarSeguimiento value) {
        return new JAXBElement<EliminarSeguimiento>(_EliminarSeguimiento_QNAME, EliminarSeguimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeguimientoDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "SeguimientoDto")
    public JAXBElement<SeguimientoDto> createSeguimientoDto(SeguimientoDto value) {
        return new JAXBElement<SeguimientoDto>(_SeguimientoDto_QNAME, SeguimientoDto.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarActividadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "eliminarActividadResponse")
    public JAXBElement<EliminarActividadResponse> createEliminarActividadResponse(EliminarActividadResponse value) {
        return new JAXBElement<EliminarActividadResponse>(_EliminarActividadResponse_QNAME, EliminarActividadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarAdministradorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "guardarAdministradorResponse")
    public JAXBElement<GuardarAdministradorResponse> createGuardarAdministradorResponse(GuardarAdministradorResponse value) {
        return new JAXBElement<GuardarAdministradorResponse>(_GuardarAdministradorResponse_QNAME, GuardarAdministradorResponse.class, null, value);
    }

}
