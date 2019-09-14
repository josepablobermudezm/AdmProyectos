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
@XmlRootElement(name = "SeguimientoDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class SeguimientoDto {
    @XmlTransient
    Long ID;
    @XmlTransient
    LocalDate fecha;
    @XmlTransient
    Long avance;
    @XmlTransient
    ProyectoDto proyecto;
    @XmlTransient
    Long version;

    public SeguimientoDto(){
        
    }
    
    public SeguimientoDto(Long ID, LocalDate fecha, Long avance, ProyectoDto proyecto, Long version) {
        this.ID = ID;
        this.fecha = fecha;
        this.avance = avance;
        this.proyecto = proyecto;
        this.version = version;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Long getAvance() {
        return avance;
    }

    public void setAvance(Long avance) {
        this.avance = avance;
    }

    public ProyectoDto getProyecto() {
        return proyecto;
    }

    public void setProyecto(ProyectoDto proyecto) {
        this.proyecto = proyecto;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
    
    
    
    
}
