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
    DtoCasting dtoCasting = new DtoCasting();
    
    public Respuesta getAdministradorUsuClave(String usuario, String clave){
        try{
            //Consulto al Service por un Administrador
            webservice.Respuesta resp = webService.getUsuario(usuario, clave);
            if(!resp.isEstado()){
                // Respuesta erronea si la respuesta del servidor también lo fue
                return new Respuesta(Boolean.FALSE, resp.getMensaje(), resp.getMensajeInterno());
            }
            // Obtengo un nuevo AdministradorDto a base del que el servidor devuelve y lo inserta en una nueva respuesta
            return new Respuesta(Boolean.TRUE, "", "", "AdministradorDto", new AdministradorDto((webservice.AdministradorDto)resp.getResultado()));
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
            webservice.AdministradorDto administrador = dtoCasting.castAdministrador(admin);
            webservice.Respuesta resp = webService.guardarAdministrador(administrador);
            if (!resp.isEstado()) {
                return new Respuesta(false, resp.getMensaje(), resp.getMensajeInterno(), "", "");
            }
            /*administrador = (ws.admin.ac.cr.controller.AdministradorDto) resp.getResultado("");
            System.out.println(resp.getResultado());*/
            return new Respuesta(true, resp.getMensaje(), resp.getMensajeInterno(), "", "");
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error guardando el Usuario.", ex);
            return new Respuesta(false, "Error guardando el Usuario.", "guardarUsuario " + ex.getMessage());
        }
    }
     public Respuesta eliminarAdministrador(Long Id) {
        try {
            String mensaje = webService.eliminarAdministrador(Id);
            return new Respuesta(true, mensaje, "");
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error guardando el Usuario.", ex);
            return new Respuesta(false, "Error guardando el Usuario.", "guardarUsuario " + ex.getMessage());
        }
    }
     public AdministradorDto getAdministrador(Long id){
        webservice.AdministradorDto adminWsDto = webService.getAdministradorById(id);
        AdministradorDto adminDto;
        if(adminWsDto!=null){
            adminDto = new AdministradorDto(adminWsDto);
        } else {
            adminDto = null;
        }
        return adminDto;
    }
    
}
