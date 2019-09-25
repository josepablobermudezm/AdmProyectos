/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.service;

import java.net.ConnectException;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectos.util.DtoCasting;
import proyectos.model.AdministradorDto;
import proyectos.util.Respuesta;
import webservice.WS;
import webservice.WS_Service;

/**
 *
 * @author Jose Pablo Bermudez
 */
public class AdministradorService {
    
    WS_Service service = new webservice.WS_Service();
    WS webService = service.getWSPort();
    DtoCasting dtoCast = new DtoCasting();
    
    public AdministradorService() {
    }
    
    public Respuesta getAdministradorUsuClave(String usuario, String clave){
        try{
            webservice.Respuesta resp = webService.getUsuario(usuario, clave);
            if(!resp.isEstado()){
                return new Respuesta(Boolean.FALSE, resp.getMensaje(), resp.getMensajeInterno());
            }
            webservice.AdministradorDto administrador = (webservice.AdministradorDto)resp.getResultado();
            return new Respuesta(Boolean.TRUE, "", "", "AdministradorDto", new AdministradorDto(administrador));
        }catch (Exception ex){
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error al obtener el Usuario.", ex);
            if(ex.getCause() != null && ex.getCause().getClass() == ConnectException.class){
                return new Respuesta(false, "Error al obtener el Usuario. No se pudo hacer conexión con el servidor: ", "getAdministradorUsuClave " + ex.getMessage());
            }
            return new Respuesta(false, "Error al obtener el Usuario.", "getAdministradorUsuClave " + ex.getMessage());
        }
    }

    public Respuesta guardarAdministrador(AdministradorDto admin) {
        try {
            webservice.AdministradorDto administrador = dtoCast.castAdmin(admin);
            webservice.Respuesta resp = webService.guardarAdministrador(administrador);
            if (!resp.isEstado()) {
                return new Respuesta(false, resp.getMensaje(), resp.getMensajeInterno(), "", "");
            }
            return new Respuesta(true, resp.getMensaje(), resp.getMensajeInterno(), "AdministradorDto", (AdministradorDto)(new AdministradorDto((webservice.AdministradorDto)resp.getResultado())));
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error guardando el Usuario.", ex);
            if(ex.getCause() != null && ex.getCause().getClass() == ConnectException.class){
                return new Respuesta(false, "Error. No se pudo hacer conexión con el servidor: ", "guardarAdministrador " + ex.getMessage());
            }
            return new Respuesta(false, "Error guardando el Usuario.", "guardarAdministrador " + ex.getMessage());
        }
    }
    
    public Respuesta eliminarAdministrador(Long Id) {
        try {
            webservice.Respuesta resp = webService.eliminarAdministrador(Id);
            return new Respuesta(resp.isEstado(), resp.getMensaje(), resp.getMensajeInterno());
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error guardando el Usuario.", ex);
            if(ex.getCause() != null && ex.getCause().getClass() == ConnectException.class){
                return new Respuesta(false, "Error. No se pudo hacer conexión con el servidor: ", "eliminarAdministrador " + ex.getMessage());
            }
            return new Respuesta(false, "Error Eliminando el Administrador.", "eliminarAdministrador " + ex.getMessage());
        }
    }
    public Respuesta getAdministrador(Long ID){
        try{
            webservice.Respuesta resp = webService.getAdministrador(ID);
            if(!resp.isEstado()){
                return new Respuesta(Boolean.FALSE, resp.getMensaje(), resp.getMensajeInterno());
            }
            return new Respuesta(Boolean.TRUE, "", "", "AdministradorDto", new AdministradorDto((webservice.AdministradorDto)resp.getResultado()));
        }catch (Exception ex){
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error al obtener el Usuario.", ex);
            if(ex.getCause() != null && ex.getCause().getClass() == ConnectException.class){
                return new Respuesta(false, "Error al obtener el Usuario. No se pudo hacer conexión con el servidor: ", "getAdministrador " + ex.getMessage());
            }
            return new Respuesta(false, "Error al obtener el Usuario.", "getAdministradorUsuClave " + ex.getMessage());
        }
    }
}