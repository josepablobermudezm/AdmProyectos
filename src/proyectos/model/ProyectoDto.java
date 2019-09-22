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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import proyectos.util.LocalDateAdapter;

/**
 *
 * @author Jose Pablo Bermudez
 */

public class ProyectoDto {
    Long ID;
    String nombre;
    String patrocinador;
    String liderUsuario;
    String liderTecnico;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    LocalDate inicioEsperado;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    LocalDate inicioReal;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    LocalDate finalEsperado;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    LocalDate finalReal;
    String estado;
    String correoUsuario;
    String correoTecnico;
    String correoPatrocinador;
    Long version;

    public ProyectoDto(){
        
    }
    
    public ProyectoDto(Long ID, String nombre, String patrocinador, String liderUsuario, String liderTecnico,LocalDate inicioEsperado, LocalDate inicioReal, LocalDate finalEsperado, LocalDate finalReal, String estado, String correoUsuario, String correoTecnico, String correoPatrocinador, Long version) {
        this.ID = ID;
        this.nombre = nombre;
        this.patrocinador = patrocinador;
        this.liderUsuario = liderUsuario;
        this.liderTecnico = liderTecnico;
        this.inicioEsperado = inicioEsperado;
        this.inicioReal = inicioReal;
        this.finalEsperado = finalEsperado;
        this.finalReal = finalReal;
        this.estado = estado;
        this.correoUsuario = correoUsuario;
        this.correoTecnico = correoTecnico;
        this.correoPatrocinador = correoPatrocinador;
        this.version = version;
    }
    public ProyectoDto(webservice.ProyectoDto proyecto){
        this.ID = proyecto.getId();
        this.nombre = proyecto.getNombre();
        this.patrocinador = proyecto.getPatrocinador();
        this.liderUsuario = proyecto.getLiderUsuario();
        this.liderTecnico = proyecto.getLiderTectnico();
        /*this.inicioEsperado = proyecto.getInicioEsperado();
        this.inicioReal = proyecto.getInicioReal();
        this.finalEsperado = proyecto.getFinalEsperado();
        this.finalReal = proyecto.getFinalReal();*/
        this.estado = proyecto.getEstado();
        this.correoUsuario = proyecto.getCorreoLiderUsuario();
        this.correoTecnico = proyecto.getCorreoLiderTecnico();
        this.correoPatrocinador = proyecto.getCorreoPatrocinador();
        this.version = proyecto.getVersion(); 
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

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public String getLiderUsuario() {
        return liderUsuario;
    }

    public void setLiderUsuario(String liderUsuario) {
        this.liderUsuario = liderUsuario;
    }

    public String getLiderTecnico() {
        return liderTecnico;
    }

    public void setLiderTecnico(String liderTecnico) {
        this.liderTecnico = liderTecnico;
    }
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getInicioEsperado() {
        return inicioEsperado;
    }
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public void setInicioEsperado(LocalDate inicioEsperado) {
        this.inicioEsperado = inicioEsperado;
    }
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getInicioReal() {
        return inicioReal;
    }
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public void setInicioReal(LocalDate inicioReal) {
        this.inicioReal = inicioReal;
    }
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getFinalEsperado() {
        return finalEsperado;
    }
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public void setFinalEsperado(LocalDate finalEsperado) {
        this.finalEsperado = finalEsperado;
    }
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getFinalReal() {
        return finalReal;
    }
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public void setFinalReal(LocalDate finalReal) {
        this.finalReal = finalReal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getCorreoTecnico() {
        return correoTecnico;
    }

    public void setCorreoTecnico(String correoTecnico) {
        this.correoTecnico = correoTecnico;
    }

    public String getCorreoPatrocinador() {
        return correoPatrocinador;
    }

    public void setCorreoPatrocinador(String correoPatrocinador) {
        this.correoPatrocinador = correoPatrocinador;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
    
    
}
