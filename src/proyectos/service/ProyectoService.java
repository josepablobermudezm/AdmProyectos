/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.service;

import proyectos.model.ProyectoDto;
import proyectos.util.DtoCasting;
import proyectos.util.Respuesta;
import webservice.WS;
import webservice.WS_Service;

/**
 *
 * @author Jose Pablo Bermudez
 */
public class ProyectoService {
     WS_Service service = new webservice.WS_Service();
    WS webService = service.getWSPort();
    DtoCasting dtoCasting = new DtoCasting();
    
    public Respuesta GuardarProyecto(ProyectoDto proyectoDto){
         webservice.ProyectoDto  proyectoDto1 = dtoCasting.castProyecto(proyectoDto);
         webservice.Respuesta  res = webService.guardarProyecto(proyectoDto1);
        return null;
        
    }
}
