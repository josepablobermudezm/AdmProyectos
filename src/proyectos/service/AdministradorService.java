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
    
    public AdministradorDto cargarAdmin(String usu, String pass){
        webservice.AdministradorDto adminWsAux = webService.getAdmin(usu, pass);
        AdministradorDto adminDto ;
        if(adminWsAux!=null){
            adminDto = new AdministradorDto(adminWsAux);
        } else {
            adminDto = null;
        }
        return adminDto;
    }
    
    public Respuesta guardarAdministrador(AdministradorDto admin) {
        try {
            webservice.AdministradorDto administrador = dtoCasting.castAdmin(admin);
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
    /*public AdministradorDto getAdministrador(Long id){
        webservice.AdministradorDto adminWsDto = webService.getAdministradorById(id);
        AdministradorDto adminDto;
        if(adminWsDto!=null){
            adminDto = new AdministradorDto(adminWsDto);
        } else {
            adminDto = null;
        }
        return adminDto;
    }*/
    
}
