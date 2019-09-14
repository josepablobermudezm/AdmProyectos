/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.model;

import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jose Pablo Bermudez
 */
@XmlRootElement(name = "AdministradorDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class AdministradorDto {
    @XmlTransient
    private Long ID;
    @XmlTransient
    private String nombre;
    @XmlTransient
    private String pApellido;
    @XmlTransient
    private String sApellido;
    @XmlTransient
    private String usuario;
    @XmlTransient
    private String correo;
    @XmlTransient
    private String clave;
    @XmlTransient
    private Long admVersion;
    @XmlTransient
    private String estado;

    public AdministradorDto(){
        
    }
    
    public AdministradorDto(Long ID, String nombre, String pApellido, String sApellido, String usuario, String correo, String clave, Long admVersion, String estado) {
        this.ID = ID;
        this.nombre = nombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
        this.usuario = usuario;
        this.correo = correo;
        this.clave = clave;
        this.admVersion = admVersion;
        this.estado = estado;
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
    
}
