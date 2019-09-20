/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.util;

import proyectos.model.AdministradorDto;

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
        administrador.setPApellido(admin.getpApellido());
        administrador.setSApellido(admin.getsApellido());
        administrador.setUsuario(admin.getUsuario());
        administrador.setVersion(admin.getAdmVersion());        
        return administrador;
    }
}
