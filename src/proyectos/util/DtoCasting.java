/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.util;

import webservice.AdministradorDto;

/**
 *
 * @author Jose Pablo Bermudez
 */
public class DtoCasting {
    
    //webservice es la carpeta de las clases que se generan solas
    //El proposito de esta clase de hacer como una copia del objeto
    public webservice.AdministradorDto castAdministrador(AdministradorDto admin){
        webservice.AdministradorDto administrador = new webservice.AdministradorDto();
        administrador.setCedula(admin.getCedula());
        administrador.setClave(admin.getClave());
        administrador.setCorreo(admin.getCorreo());
        administrador.setEstado(admin.getEstado());
        administrador.setID(admin.getID());
        administrador.setNombre(admin.getNombre());
        administrador.setPApellido(admin.getPApellido());
        administrador.setSApellido(admin.getSApellido());
        administrador.setUsuario(admin.getUsuario());
        administrador.setVersion(admin.getVersion());        
        return administrador;
    }
    
    public proyectos.model.AdministradorDto castAdministrar2(webservice.AdministradorDto admin){
    
        proyectos.model.AdministradorDto admDto = new proyectos.model.AdministradorDto();
        admDto.setCedula(admin.getCedula());
        admDto.setClave(admin.getClave());
        admDto.setCorreo(admin.getCorreo());
        admDto.setEstado(admin.getEstado());
        admDto.setID(admin.getID());
        admDto.setNombre(admin.getNombre());
        admDto.setpApellido(admin.getPApellido());
        admDto.setsApellido(admin.getSApellido());
        admDto.setUsuario(admin.getUsuario());
        admDto.setAdmVersion(admin.getVersion());
        
        return admDto;
    
    }
    
}
