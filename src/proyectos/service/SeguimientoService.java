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
import proyectos.model.SeguimientoDto;
import proyectos.util.AppContext;
import proyectos.util.DtoCasting;
import proyectos.util.Respuesta;
import webservice.ProyectoDto;
import webservice.WS;
import webservice.WS_Service;

/**
 *
 * @author Jose Pablo Bermudez
 */
public class SeguimientoService {
    WS_Service service = new webservice.WS_Service();
    WS webService = service.getWSPort();
    DtoCasting dtoCast = new DtoCasting();
    
    
    public Respuesta guardarSeguimiento(SeguimientoDto seg) {
        try {
            webservice.SeguimientoDto seguimiento = dtoCast.castSeg(seg);
            webservice.Respuesta resp = webService.guardarSeguimiento(seguimiento);
            if (!resp.isEstado()) {
                return new Respuesta(false, resp.getMensaje(), resp.getMensajeInterno(), "", "");
            }
            AdministradorDto admin = (AdministradorDto) AppContext.getInstance().get("AdministradorDto");
            AdministradorService adminService = new AdministradorService();
            Respuesta respuesta = adminService.getAdministrador(admin.getAdnId());
            admin = (AdministradorDto) respuesta.getResultado("AdministradorDto");
            
            ProyectoService proService = new ProyectoService();
            ProyectoDto pro = (ProyectoDto) AppContext.getInstance().get("ProyectoDto");
            respuesta = proService.getProyecto(pro.getProId());
            pro = (ProyectoDto) respuesta.getResultado("ProyectoDto");
            
            AppContext.getInstance().set("AdministradorDto", admin);
            AppContext.getInstance().set("ProyectoDto", pro);
            return new Respuesta(true, resp.getMensaje(), resp.getMensajeInterno(), "SeguimientoDto", new SeguimientoDto((webservice.SeguimientoDto)resp.getResultado()));
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error guardando el Usuario.", ex);
            if(ex.getCause() != null && ex.getCause().getClass() == ConnectException.class){
                return new Respuesta(false, "Error. No se pudo hacer conexión con el servidor: ", "guardarAdministrador " + ex.getMessage());
            }
            return new Respuesta(false, "Error guardando el Usuario.", "guardarUsuario " + ex.getMessage());
        }
    }
    public Respuesta eliminarSeguimiento(Long Id) {
        try {
            webservice.Respuesta resp = webService.eliminarSeguimiento(Id);
            return new Respuesta(resp.isEstado(), resp.getMensaje(), resp.getMensajeInterno());
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error guardando el Usuario.", ex);
            if(ex.getCause() != null && ex.getCause().getClass() == ConnectException.class){
                return new Respuesta(false, "Error. No se pudo hacer conexión con el servidor: ", "eliminarAdministrador " + ex.getMessage());
            }
            return new Respuesta(false, "Error Eliminando el Administrador.", "eliminarAdministrador " + ex.getMessage());
        }
    }
    
}
