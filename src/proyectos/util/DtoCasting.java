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
}
