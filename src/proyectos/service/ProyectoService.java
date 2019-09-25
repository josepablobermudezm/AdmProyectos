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
import proyectos.util.DtoCasting;

import webservice.Respuesta;

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

 
    public proyectos.util.Respuesta guardarAdministrador(ProyectoDto pro) {

        try {
            webservice.ProyectoDto proyecto = dtoCast.castPro(pro);
            webservice.Respuesta resp = webService.guardarProyecto(proyecto);
            if (!resp.isEstado()) {

                return new Respuesta(false, resp.getMensaje(), resp.getMensajeInterno(), "", "");
            }
            return new Respuesta(true, resp.getMensaje(), resp.getMensajeInterno(), "Proyecto", new ProyectoDto((webservice.ProyectoDto)resp.getResultado()));
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error guardando el Proyecto.", ex);
            if(ex.getCause() != null && ex.getCause().getClass() == ConnectException.class){
                return new Respuesta(false, "Error. No se pudo hacer conexión con el servidor: ", "guardarProyecto " + ex.getMessage());
            }
            return new Respuesta(false, "Error guardando el Usuario.", "guardarProyecto " + ex.getMessage());
        }
    }
    
    
    public Respuesta eliminarProyecto(Long Id) {
        try {
            webservice.Respuesta resp = webService.eliminarProyecto(Id);
            return new Respuesta(resp.isEstado(), resp.getMensaje(), resp.getMensajeInterno());
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error guardando el Usuario.", ex);
            if(ex.getCause() != null && ex.getCause().getClass() == ConnectException.class){
                return new Respuesta(false, "Error. No se pudo hacer conexión con el servidor: ", "eliminarAdministrador " + ex.getMessage());
            }
            return new Respuesta(false, "Error Eliminando el Administrador.", "eliminarAdministrador " + ex.getMessage());

                return new proyectos.util.Respuesta(false, resp.getMensaje(), resp.getMensajeInterno(), "", "");
            }
            return new proyectos.util.Respuesta(true, resp.getMensaje(), resp.getMensajeInterno(), "", "");
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error guardando el Proyecto.", ex);
            return new proyectos.util.Respuesta(false, "Error guardando el Usuario.", "guardarProyecto " + ex.getMessage());
        }
    }
    
    public proyectos.util.Respuesta eliminarProyecto(Long Id) {
        try {
            String mensaje = webService.eliminarProyecto(Id);
            return new proyectos.util.Respuesta(true, mensaje, "");
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error guardando el Usuario.", ex);
            return new proyectos.util.Respuesta(false, "Error guardando el Usuario.", "guardarUsuario " + ex.getMessage());

        }
    }
}