/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

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
    String inicioEsperado;
    String inicioReal;
    String finalEsperado;
    String finalReal;
    String estado;
    String correoUsuario;
    String correoTecnico;
    String correoPatrocinador;
    Long version;

    public ProyectoDto(){
        
    }
    
    public ProyectoDto(Long ID, String nombre, String patrocinador, String liderUsuario, String liderTecnico, String inicioEsperado, String inicioReal, String finalEsperado, String finalReal, String estado, String correoUsuario, String correoTecnico, String correoPatrocinador, Long version) {
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

    public String getInicioEsperado() {
        return inicioEsperado;
    }

    public void setInicioEsperado(String inicioEsperado) {
        this.inicioEsperado = inicioEsperado;
    }

    public String getInicioReal() {
        return inicioReal;
    }

    public void setInicioReal(String inicioReal) {
        this.inicioReal = inicioReal;
    }

    public String getFinalEsperado() {
        return finalEsperado;
    }

    public void setFinalEsperado(String finalEsperado) {
        this.finalEsperado = finalEsperado;
    }

    public String getFinalReal() {
        return finalReal;
    }

    public void setFinalReal(String finalReal) {
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
