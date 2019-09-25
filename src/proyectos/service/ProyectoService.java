/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.service;

import java.net.ConnectException;
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
            AdministradorDto admin = (AdministradorDto) AppContext.getInstance().get("AdministradorDto");
            AdministradorService adminService = new AdministradorService();
            Respuesta respuesta = adminService.getAdministrador(admin.getAdnId());
            admin = (AdministradorDto) respuesta.getResultado("AdministradorDto");
            AppContext.getInstance().set("AdministradorDto", admin);
            return new Respuesta(true, resp.getMensaje(), resp.getMensajeInterno(), "Proyecto", new ProyectoDto((webservice.ProyectoDto) resp.getResultado()));
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error guardando el Proyecto.", ex);
            if (ex.getCause() != null && ex.getCause().getClass() == ConnectException.class) {
                return new Respuesta(false, "Error. No se pudo hacer conexión con el servidor: ", "guardarProyecto " + ex.getMessage());
            }
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
            //Consulto al Service por un Administrador
            webservice.Respuesta resp = webService.getProyecto(ID);
            if (!resp.isEstado()) {
                // Respuesta erronea si la respuesta del servidor también lo fue
                return new Respuesta(Boolean.FALSE, resp.getMensaje(), resp.getMensajeInterno());
            }
            // Obtengo un nuevo AdministradorDto a base del que el servidor devuelve y lo inserta en una nueva respuesta
            return new Respuesta(Boolean.TRUE, "", "", "ProyectoDto", new ProyectoDto((webservice.ProyectoDto) resp.getResultado()));
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error al obtener el Usuario.", ex);
            if (ex.getCause() != null && ex.getCause().getClass() == ConnectException.class) {
                return new Respuesta(false, "Error al obtener el Usuario. No se pudo hacer conexión con el servidor: ", "getAdministrador " + ex.getMessage());
            }
            return new Respuesta(false, "Error al obtener el Usuario.", "getAdministradorUsuClave " + ex.getMessage());
        }
    }
}