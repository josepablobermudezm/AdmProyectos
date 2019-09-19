/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.service;

import java.util.logging.Level;
import java.util.logging.Logger;
import proyectos.util.DtoCasting;
import proyectos.util.Respuesta;
import webservice.AdministradorDto;
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
    
    
    public Respuesta guardarAdministrador(AdministradorDto admin) {
        try {
            webservice.AdministradorDto administrador = dtoCasting.castAdministrador(admin);
            webservice.Respuesta resp = webService.guardarAdministrador(administrador);
            if (!resp.isEstado()) {
                return new Respuesta(false, resp.getMensaje(), resp.getMensajeInterno(), "", "");
            }
            return new Respuesta(true, resp.getMensaje(), resp.getMensajeInterno(), "", "");
        } catch (Exception ex) {
            Logger.getLogger(AdministradorService.class.getName()).log(Level.SEVERE, "Error guardando el Usuario.", ex);
            return new Respuesta(false, "Error guardando el Usuario.", "guardarUsuario " + ex.getMessage());
        }
    }
    
}
