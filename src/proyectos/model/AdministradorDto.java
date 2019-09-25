/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.model;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
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
    public SimpleBooleanProperty adnEstadoP;
    public SimpleStringProperty adnVersion;

    private List<ProyectoDto> proyectos = FXCollections.observableArrayList();
    
    public AdministradorDto() {
        adnIdP = new SimpleStringProperty("");
        adnNombreP = new SimpleStringProperty("");
        adnPapellidoP = new SimpleStringProperty("");
        adnSapellidoP = new SimpleStringProperty("");
        adnCedulaP = new SimpleStringProperty("");
        adnCorreoP = new SimpleStringProperty("");
        adnUsuarioP = new SimpleStringProperty("");
        adnContrasenaP = new SimpleStringProperty("");
        adnEstadoP = new SimpleBooleanProperty(true);
        adnVersion = new SimpleStringProperty("");
    }

    public AdministradorDto(webservice.AdministradorDto admin) {
        this();
        this.adnCedulaP.setValue(admin.getAdnCedula());
        this.adnContrasenaP.setValue(admin.getAdnContrasena());
        this.adnCorreoP.setValue(admin.getAdnCorreo());
        this.adnEstadoP.setValue(admin.getAdnEstado().equals("A") ? true : false);
        this.adnIdP.setValue(admin.getAdnId().toString());
        this.adnNombreP.setValue(admin.getAdnNombre());
        this.adnPapellidoP.setValue(admin.getAdnPapellido());
        this.adnSapellidoP.setValue(admin.getAdnSapellido());
        this.adnUsuarioP.setValue(admin.getAdnUsuario());
        this.adnVersion.setValue(admin.getAdnVersion().toString());
        
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

    public List<ProyectoDto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<ProyectoDto> proyectos) {
        this.proyectos = proyectos;
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
        return adnEstadoP.get() == true ? "A" : "I";
    }

    public void setAdnEstado(String adnEstado) {
        this.adnEstadoP.setValue(adnEstado == "A" ? true : false);
    }

   /* public ObservableList<AdminPorProyectoDto> getProyectos() {
        return proyectos;
    }
    
    public List<ws.admin.ac.cr.controller.AdminPorProyectoDto> getProyectosServices(){
        List<ws.admin.ac.cr.controller.AdminPorProyectoDto> prs = new ArrayList<>();
        for(AdminPorProyectoDto a : proyectos){
            ws.admin.ac.cr.controller.AdminPorProyectoDto adm = new CastingDto().castAdminPorProyecto(a);
            //adm.setAxpAdministrador(new CastingDto().castAdmin(this));
            prs.add(new CastingDto().castAdminPorProyecto(a));
        }
        return prs;
    }
    public void setProyectos(ObservableList<AdminPorProyectoDto> proyectos) {
        this.proyectos = proyectos;
    }
    */
    // Set List Servidor

    @Override
    public String toString() {
        return "AdministradorDto{" + "adnIdP=" + adnIdP + ", adnNombreP=" + adnNombreP + ", adnPapellidoP=" + adnPapellidoP + ", adnSapellidoP=" + adnSapellidoP + ", adnCedulaP=" + adnCedulaP + ", adnCorreoP=" + adnCorreoP + ", adnUsuarioP=" + adnUsuarioP + ", adnContrasenaP=" + adnContrasenaP + ", adnEstadoP=" + adnEstadoP + ", adnVersion=" + adnVersion + ", proyectos=" + proyectos + '}';
    }
    

    
}
