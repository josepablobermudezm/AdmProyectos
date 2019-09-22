/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.model;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
/**
 *
 * @author Jose Pablo Bermudez
 */

public class AdministradorDto {

    public SimpleStringProperty adnIdP;
    public SimpleStringProperty adnNombreP;
    public SimpleStringProperty adnPapellidoP;
    public SimpleStringProperty adnSapellidoP;
    public SimpleStringProperty adnCedulaP;
    public SimpleStringProperty adnCorreoP;
    public SimpleStringProperty adnUsuarioP;
    public SimpleStringProperty adnContrasenaP;
    public SimpleStringProperty adnEstadoP;
    public SimpleStringProperty adnVersion;

    
    public AdministradorDto() {
        adnIdP = new SimpleStringProperty();
        adnNombreP = new SimpleStringProperty();
        adnPapellidoP = new SimpleStringProperty();
        adnSapellidoP = new SimpleStringProperty();
        adnCedulaP = new SimpleStringProperty();
        adnCorreoP = new SimpleStringProperty();
        adnUsuarioP = new SimpleStringProperty();
        adnContrasenaP = new SimpleStringProperty();
        adnEstadoP = new SimpleStringProperty();
        adnVersion = new SimpleStringProperty();

    }

    public AdministradorDto(webservice.AdministradorDto admin) {
        this.adnCedulaP.setValue(admin.getAdnCedula());
        this.adnContrasenaP.setValue(admin.getAdnContrasena());
        this.adnCorreoP.setValue(admin.getAdnCorreo());
        this.adnEstadoP.setValue(admin.getAdnEstado());
        this.adnIdP.setValue(admin.getAdnId().toString());
        this.adnNombreP.setValue(admin.getAdnNombre());
        this.adnPapellidoP.setValue(admin.getAdnPapellido());
        this.adnSapellidoP.setValue(admin.getAdnSapellido());
        this.adnUsuarioP.setValue(admin.getAdnUsuario());
        this.adnVersion.setValue(admin.getAdnVersion().toString());
    }

    public AdministradorDto(AdministradorDto admin){
        this();
        this.adnCedulaP.set(admin.getAdnCedula());
        this.adnContrasenaP.set(admin.getAdnContrasena());
        this.adnCorreoP.set(admin.getAdnCorreo()); 
        this.adnEstadoP.set(admin.getAdnEstado());
        this.adnIdP.set(admin.getAdnId().toString());
        this.adnNombreP.set(admin.getAdnNombre());
        this.adnPapellidoP.set(admin.getAdnPapellido());
        this.adnSapellidoP.set(admin.getAdnSapellido());
        this.adnUsuarioP.set(admin.getAdnUsuario());
        this.adnVersion.set(admin.getAdnVersion().toString());
    }
    
    public Long getAdnId() {
        if (adnIdP.get() != null) {
            if (!adnIdP.get().isEmpty()) {
                return Long.valueOf(adnIdP.get());
            }
        }
        return null;
    }

    public void setAdnId(Long adnId) {
        this.adnIdP.setValue(adnId.toString());
    }

    public String getAdnNombre() {
        return adnNombreP.get();
    }

    public void setAdnNombre(String adnNombre) {
        this.adnNombreP.setValue(adnNombre);
    }

    public String getAdnPapellido() {
        return adnPapellidoP.get();
    }

    public void setAdnPapellido(String adnPapellido) {
        this.adnPapellidoP.setValue(adnPapellido);
    }

    public String getAdnSapellido() {
        return adnSapellidoP.get();
    }

    public void setAdnSapellido(String adnSapellido) {
        this.adnSapellidoP.setValue(adnSapellido);
    }

    public String getAdnCedula() {
        return adnCedulaP.get();
    }

    public void setAdnCedula(String adnCedula) {
        this.adnCedulaP.setValue(adnCedula);
    }

    public String getAdnCorreo() {
        return adnCorreoP.get();
    }

    public void setAdnCorreo(String adnCorreo) {
        this.adnCorreoP.setValue(adnCorreo);
    }

    public String getAdnUsuario() {
        return adnUsuarioP.get();
    }

    public void setAdnUsuario(String adnUsuario) {
        this.adnUsuarioP.setValue(adnUsuario);
    }

    public String getAdnContrasena() {
        return adnContrasenaP.get();
    }

    public void setAdnContrasena(String adnContrasena) {
        this.adnContrasenaP.setValue(adnContrasena);
    }

    public Long getAdnVersion() {
        if (adnVersion.get() != null) {
            if (!adnVersion.get().isEmpty()) {
                return Long.valueOf(adnVersion.get());
            }
        }
        return null;
    }

    public void setAdnVersion(Long ID) {
        this.adnVersion.setValue(ID.toString());
    }

    public String getAdnEstado() {
        return adnEstadoP.get();
    }

    public void setAdnEstado(String adnEstado) {
        this.adnEstadoP.setValue(adnEstado);
    }

    @Override
    public String toString() {
        //return "AdministradorDto{" + "adnId=" + adnId + ", adnNombre=" + adnNombre + ", adnPapellido=" + adnPapellido + ", adnSapellido=" + adnSapellido + ", adnCedula=" + adnCedula + ", adnCorreo=" + adnCorreo + ", adnUsuario=" + adnUsuario + ", adnContrasena=" + adnContrasena + ", adnEstado=" + adnEstado + ", adnVersion=" + adnVersion + '}';
        return "NEL Perro";
    }
    
}
