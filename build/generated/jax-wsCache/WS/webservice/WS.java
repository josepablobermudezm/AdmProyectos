
package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WS", targetNamespace = "http://webService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WS {


    /**
     * 
     * @param actividad
     * @return
     *     returns webservice.Respuesta
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "guardarActividad", targetNamespace = "http://webService/", className = "webservice.GuardarActividad")
    @ResponseWrapper(localName = "guardarActividadResponse", targetNamespace = "http://webService/", className = "webservice.GuardarActividadResponse")
    @Action(input = "http://webService/WS/guardarActividadRequest", output = "http://webService/WS/guardarActividadResponse")
    public Respuesta guardarActividad(
        @WebParam(name = "actividad", targetNamespace = "")
        ActividadesDto actividad);

    /**
     * 
     * @param id
     * @return
     *     returns webservice.Respuesta
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyecto", targetNamespace = "http://webService/", className = "webservice.GetProyecto")
    @ResponseWrapper(localName = "getProyectoResponse", targetNamespace = "http://webService/", className = "webservice.GetProyectoResponse")
    @Action(input = "http://webService/WS/getProyectoRequest", output = "http://webService/WS/getProyectoResponse")
    public Respuesta getProyecto(
        @WebParam(name = "ID", targetNamespace = "")
        Long id);

    /**
     * 
     * @param clave
     * @param usuario
     * @return
     *     returns webservice.Respuesta
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsuario", targetNamespace = "http://webService/", className = "webservice.GetUsuario")
    @ResponseWrapper(localName = "getUsuarioResponse", targetNamespace = "http://webService/", className = "webservice.GetUsuarioResponse")
    @Action(input = "http://webService/WS/getUsuarioRequest", output = "http://webService/WS/getUsuarioResponse")
    public Respuesta getUsuario(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "clave", targetNamespace = "")
        String clave);

    /**
     * 
     * @param administrador
     * @return
     *     returns webservice.Respuesta
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "guardarAdministrador", targetNamespace = "http://webService/", className = "webservice.GuardarAdministrador")
    @ResponseWrapper(localName = "guardarAdministradorResponse", targetNamespace = "http://webService/", className = "webservice.GuardarAdministradorResponse")
    @Action(input = "http://webService/WS/guardarAdministradorRequest", output = "http://webService/WS/guardarAdministradorResponse")
    public Respuesta guardarAdministrador(
        @WebParam(name = "Administrador", targetNamespace = "")
        AdministradorDto administrador);

    /**
     * 
     * @param id
     * @return
     *     returns webservice.Respuesta
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarAdministrador", targetNamespace = "http://webService/", className = "webservice.EliminarAdministrador")
    @ResponseWrapper(localName = "eliminarAdministradorResponse", targetNamespace = "http://webService/", className = "webservice.EliminarAdministradorResponse")
    @Action(input = "http://webService/WS/eliminarAdministradorRequest", output = "http://webService/WS/eliminarAdministradorResponse")
    public Respuesta eliminarAdministrador(
        @WebParam(name = "ID", targetNamespace = "")
        Long id);

    /**
     * 
     * @param seguimiento
     * @return
     *     returns webservice.Respuesta
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "guardarSeguimiento", targetNamespace = "http://webService/", className = "webservice.GuardarSeguimiento")
    @ResponseWrapper(localName = "guardarSeguimientoResponse", targetNamespace = "http://webService/", className = "webservice.GuardarSeguimientoResponse")
    @Action(input = "http://webService/WS/guardarSeguimientoRequest", output = "http://webService/WS/guardarSeguimientoResponse")
    public Respuesta guardarSeguimiento(
        @WebParam(name = "seguimiento", targetNamespace = "")
        SeguimientoDto seguimiento);

    /**
     * 
     * @param id
     * @return
     *     returns webservice.Respuesta
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarSeguimiento", targetNamespace = "http://webService/", className = "webservice.EliminarSeguimiento")
    @ResponseWrapper(localName = "eliminarSeguimientoResponse", targetNamespace = "http://webService/", className = "webservice.EliminarSeguimientoResponse")
    @Action(input = "http://webService/WS/eliminarSeguimientoRequest", output = "http://webService/WS/eliminarSeguimientoResponse")
    public Respuesta eliminarSeguimiento(
        @WebParam(name = "ID", targetNamespace = "")
        Long id);

    /**
     * 
     * @param id
     * @return
     *     returns webservice.Respuesta
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarActividad", targetNamespace = "http://webService/", className = "webservice.EliminarActividad")
    @ResponseWrapper(localName = "eliminarActividadResponse", targetNamespace = "http://webService/", className = "webservice.EliminarActividadResponse")
    @Action(input = "http://webService/WS/eliminarActividadRequest", output = "http://webService/WS/eliminarActividadResponse")
    public Respuesta eliminarActividad(
        @WebParam(name = "ID", targetNamespace = "")
        Long id);

    /**
     * 
     * @param id
     * @return
     *     returns webservice.Respuesta
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAdministrador", targetNamespace = "http://webService/", className = "webservice.GetAdministrador")
    @ResponseWrapper(localName = "getAdministradorResponse", targetNamespace = "http://webService/", className = "webservice.GetAdministradorResponse")
    @Action(input = "http://webService/WS/getAdministradorRequest", output = "http://webService/WS/getAdministradorResponse")
    public Respuesta getAdministrador(
        @WebParam(name = "ID", targetNamespace = "")
        Long id);

    /**
     * 
     * @param proyecto
     * @return
     *     returns webservice.Respuesta
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "guardarProyecto", targetNamespace = "http://webService/", className = "webservice.GuardarProyecto")
    @ResponseWrapper(localName = "guardarProyectoResponse", targetNamespace = "http://webService/", className = "webservice.GuardarProyectoResponse")
    @Action(input = "http://webService/WS/guardarProyectoRequest", output = "http://webService/WS/guardarProyectoResponse")
    public Respuesta guardarProyecto(
        @WebParam(name = "proyecto", targetNamespace = "")
        ProyectoDto proyecto);

    /**
     * 
     * @param id
     * @return
     *     returns webservice.Respuesta
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarProyecto", targetNamespace = "http://webService/", className = "webservice.EliminarProyecto")
    @ResponseWrapper(localName = "eliminarProyectoResponse", targetNamespace = "http://webService/", className = "webservice.EliminarProyectoResponse")
    @Action(input = "http://webService/WS/eliminarProyectoRequest", output = "http://webService/WS/eliminarProyectoResponse")
    public Respuesta eliminarProyecto(
        @WebParam(name = "ID", targetNamespace = "")
        Long id);

}
