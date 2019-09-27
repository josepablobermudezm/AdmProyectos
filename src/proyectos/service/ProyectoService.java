/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.service;

import java.net.ConnectException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectos.model.AdministradorDto;
import proyectos.model.ProyectoDto;
import proyectos.util.AppContext;
import proyectos.util.DtoCasting;
import webservice.WS;
import webservice.WS_Service;
import proyectos.util.Respuesta;

/**
 *
 * @author Jose Pablo Bermudez
 */
public class ProyectoService {

    WS_Service service = new webservice.WS_Service();
    WS webService = service.getWSPort();
    DtoCasting dtoCast = new DtoCasting();

    public Respuesta guardarProyecto(ProyectoDto pro) {
        try {
            webservice.ProyectoDto proyecto = dtoCast.castPro(pro);
            webservice.Respuesta resp = webService.guardarProyecto(proyecto);
            if (!resp.isEstado()) {
                return new Respuesta(false, resp.getMensaje(), resp.getMensajeInterno(), "", "");
            }
            AdministradorDto administrador = (AdministradorDto) AppContext.getInstance().get("AdministradorDto");
            AdministradorService adminisService = new AdministradorService();
            Respuesta respuesta = adminisService.getAdministrador(administrador.getAdnId());
            administrador = (AdministradorDto) respuesta.getResultado("AdministradorDto");
            AppContext.getInstance().set("AdministradorDto", administrador);
            return new Respuesta(true, resp.getMensaje(), resp.getMensajeInterno(), "Proyecto", new ProyectoDto((webservice.ProyectoDto) resp.getResultado()));
        } catch (Exception ex) {
            return new Respuesta(false, "Error guardando el Usuario.", "guardarProyecto " + ex.getMessage());
        }
    }

    public Respuesta eliminarAdministrador(Long Id) {
        try {
            webservice.Respuesta resp = webService.eliminarAdministrador(Id);
            return new Respuesta(resp.isEstado(), resp.getMensaje(), resp.getMensajeInterno());
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error guardando el Usuario.", ex);
            if (ex.getCause() != null && ex.getCause().getClass() == ConnectException.class) {
                return new Respuesta(false, "Error. No se pudo hacer conexión con el servidor: ", "eliminarAdministrador " + ex.getMessage());
            }
            return new Respuesta(false, "Error Eliminando el Administrador.", "eliminarAdministrador " + ex.getMessage());
        }
    }

    public Respuesta getProyecto(Long ID) {
        try {
            webservice.Respuesta resp = webService.getProyecto(ID);
            if (!resp.isEstado()) {
                return new Respuesta(Boolean.FALSE, resp.getMensaje(), resp.getMensajeInterno());
            }
            return new Respuesta(Boolean.TRUE, "", "", "ProyectoDto", new ProyectoDto((webservice.ProyectoDto) resp.getResultado()));
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error al obtener el Usuario.", ex);
            if (ex.getCause() != null && ex.getCause().getClass() == ConnectException.class) {
                return new Respuesta(false, "Error al obtener el Usuario. No se pudo hacer conexión con el servidor: ", "getAdministrador " + ex.getMessage());
            }
            return new Respuesta(false, "Error al obtener el Usuario.", "getAdministradorUsuClave " + ex.getMessage());
        }
    }

    public Respuesta getProyectosFiltrados(String nombre, String patrocinador, String estado, Long id) {
        try {
            webservice.Respuesta res = webService.getProyectosporFiltro(nombre, patrocinador, estado, id);
            if (!res.isEstado()) {
                return new Respuesta(false, res.getMensaje(), res.getMensajeInterno());
            }
            return new Respuesta(true, "", "", "Proyectos", res.getResultado());
        } catch (Exception ex) {

            if (ex.getCause() != null && ex.getCause().getClass() == ConnectException.class) {
                return new Respuesta(false, "Error al obtener el Usuario. No se pudo hacer conexión con el servidor: ", "getProyectosporFiltro " + ex.getMessage());
            }
            return new Respuesta(false, "Error al obtener el Usuario.", "getAProyectoPorFiltros " + ex.getMessage());

        }
    }
}
