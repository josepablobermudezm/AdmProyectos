/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.model;

import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jose Pablo Bermudez
 */

public class AdministradorDto {
    private Long ID;
    private String nombre;
    private String pApellido;
    private String sApellido;
    private String usuario;
    private String correo;
    private String clave;
    private Long admVersion;
    private String estado;
    private String cedula;

    
    public SimpleStringProperty IdS = new SimpleStringProperty("");
    public SimpleStringProperty NombreS = new SimpleStringProperty("");
    public SimpleStringProperty PapellidoS = new SimpleStringProperty("");
    public SimpleStringProperty SapellidoS = new SimpleStringProperty("");
    public SimpleStringProperty CedulaS = new SimpleStringProperty("");
    public SimpleStringProperty CorreoS = new SimpleStringProperty("");
    public SimpleStringProperty UsuarioS = new SimpleStringProperty("");
    public SimpleStringProperty ContrasenaS = new SimpleStringProperty("");
    public SimpleStringProperty EstadoS = new SimpleStringProperty("");
    
    
    public AdministradorDto(){
        
    }
    
    public AdministradorDto(Long ID, String nombre, String pApellido, String sApellido,String cedula, String usuario, String correo, String clave, Long admVersion, String estado) {
        this.ID = ID;
        this.nombre = nombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
        this.usuario = usuario;
        this.correo = correo;
        this.clave = clave;
        this.admVersion = admVersion;
        this.estado = estado;
        this.cedula = cedula;
    }
    public AdministradorDto( String nombre, String pApellido, String sApellido,String cedula, String usuario, String correo, String clave) {
        
        this.nombre = nombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
        this.usuario = usuario;
        this.correo = correo;
        this.clave = clave;
        this.cedula = cedula;
    }
    

    public AdministradorDto(webservice.AdministradorDto admin){
        this.ID = admin.getID();
        this.admVersion = admin.getVersion();
        this.clave = admin.getClave();
        this.correo = admin.getCorreo();
        this.estado = admin.getEstado();
        this.nombre = admin.getNombre();
        this.pApellido = admin.getPApellido();
        this.sApellido = admin.getSApellido();
        this.usuario = admin.getUsuario();
        this.cedula = admin.getCedula();
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Long getAdmVersion() {
        return admVersion;
    }

    public void setAdmVersion(Long admVersion) {
        this.admVersion = admVersion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    
    /*public Long getIdS() {
        if(IdS.get() != null){
            if(!IdS.get().isEmpty()){
                return Long.valueOf(IdS.get());
            }
        }
        return null;
    }

    public void setIdS(Long Id) {
        this.IdS.setValue(Id.toString());
    }

    public String getNombreS() {
        return NombreS.get();
    }

    public void setNombreS(String Nombre) {
        this.NombreS.setValue(Nombre);
    }

    public String getPapellidoS() {
        return PapellidoS.get();
    }

    public void setPapellidoS(String Papellido) {
        this.PapellidoS.setValue(Papellido);
    }

    public String getSapellidoS() {
        return SapellidoS.get();
    }

    public void setSapellidoS(String Sapellido) {
        this.SapellidoS.setValue(Sapellido);
    }

    public String getCedulaS() {
        return CedulaS.get();
    }

    public void setCedulaS(String Cedula) {
        this.CedulaS.setValue(Cedula);
    }

    public String getCorreoS() {
        return CorreoS.get();
    }

    public void setCorreoS(String Correo) {
        this.CorreoS.setValue(Correo);
    }

    public String getUsuarioS() {
        return UsuarioS.get();
    }

    public void setUsuarioS(String Usuario) {
        this.UsuarioS.setValue(Usuario);
    }

    public String getContrasenaS() {
        return ContrasenaS.get();
    }

    public void setContrasenaS(String Contrasena) {
        this.ContrasenaS.setValue(Contrasena);
    }

    public String getEstadoS() {
        return EstadoS.get();
    }

    public void setEstadoS(String Estado) {
        this.EstadoS.setValue(Estado);
    }

    public Long getVersionS() {
        return admVersion;
    }

    public void setVersionS(Long Version) {
        this.admVersion = Version;
    }
*/
    @Override
    public String toString() {
        return "AdministradorDto{" + "Id=" + ID + ", Nombre=" + nombre + ", Papellido=" + pApellido + ", Sapellido=" + sApellido + ", Cedula=" + cedula + ", Correo=" + correo + ", Usuario=" + usuario + ", Contrasena=" + clave + ", Estado=" + estado + ", Version=" + admVersion + '}';
    }
    
}
