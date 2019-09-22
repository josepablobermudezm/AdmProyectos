/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import proyectos.model.AdministradorDto;
import proyectos.model.ProyectoDto;

/**
 *
 * @author Jose Pablo Bermudez
 */
public class DtoCasting {
    
    //webservice es la carpeta de las clases que se generan solas
    //El proposito de esta clase de hacer como una copia del objeto
    public webservice.AdministradorDto castAdmin(AdministradorDto admin){
        webservice.AdministradorDto administrador = new webservice.AdministradorDto();
        administrador.setAdnCedula(admin.getAdnCedula());
        administrador.setAdnContrasena(admin.getAdnContrasena());
        administrador.setAdnCorreo(admin.getAdnCorreo());
        administrador.setAdnEstado(admin.getAdnEstado());
        administrador.setAdnId(admin.getAdnId());
        administrador.setAdnNombre(admin.getAdnNombre());
        administrador.setAdnPapellido(admin.getAdnPapellido());
        administrador.setAdnSapellido(admin.getAdnSapellido());
        administrador.setAdnUsuario(admin.getAdnUsuario());
        administrador.setAdnVersion((admin.getAdnVersion()!=null)?admin.getAdnVersion()+1:1);        
        return administrador;
    }
    public webservice.ProyectoDto castProyecto(ProyectoDto proyectoDto){
        webservice.ProyectoDto proyectoDto1 = new webservice.ProyectoDto();
        proyectoDto1.setId(proyectoDto.getID());
        proyectoDto1.setCorreoLiderTecnico(proyectoDto.getCorreoTecnico());
        proyectoDto1.setCorreoLiderUsuario(proyectoDto.getCorreoUsuario());
        proyectoDto1.setCorreoPatrocinador(proyectoDto.getCorreoPatrocinador());
        proyectoDto1.setEstado(proyectoDto.getEstado());
        proyectoDto1.setFinalEsperado(proyectoDto.getFinalEsperado().atStartOfDay(ZoneId.systemDefault()).toInstant());
        proyectoDto1.setInicioEsperado(proyectoDto.getInicioEsperado());
        proyectoDto1.setInicioReal(proyectoDto.getInicioReal());
        proyectoDto1.setLiderTectnico(proyectoDto.getLiderTecnico());
        proyectoDto1.setLiderUsuario(proyectoDto.getLiderUsuario());
        proyectoDto1.setNombre(proyectoDto.getNombre());
        proyectoDto1.setPatrocinador(proyectoDto.getPatrocinador());
        proyectoDto1.setVersion(proyectoDto.getVersion());
        return proyectoDto1;
    }
    public Date ConvertirLocalDate(LocalDate localdate){
        return(java.sql.Date.valueOf(localdate));
        
    }
}
