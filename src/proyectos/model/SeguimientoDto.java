/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jose Pablo Bermudez
 */
public class SeguimientoDto {
    public SimpleStringProperty segId;
    public SimpleObjectProperty<LocalDate> segFecha;
    public SimpleStringProperty segAvance;
    public SimpleLongProperty segVersion;
    
    private ProyectoDto segProyecto;

    public SeguimientoDto() {
        segId = new SimpleStringProperty();
        segFecha = new SimpleObjectProperty<>();
        segAvance = new SimpleStringProperty();
        segVersion = new SimpleLongProperty();
    }

    public SeguimientoDto(Long segId, LocalDate segFecha, Double segAvance, Long segVersion) {
        this();
        this.segId.setValue(segId != null ? segId.toString() : null);
        this.segFecha.setValue(segFecha);
        this.segAvance.setValue(segAvance.toString());
        this.segVersion.setValue(segVersion);
    }
    
    public SeguimientoDto(webservice.SeguimientoDto seg) {
        this();
        this.segId.setValue(seg.getSegId() == null ? null : seg.getSegId().toString());
        setSegFecha(seg.getSegFecha());
        this.segAvance.setValue(seg.getSegAvance().toString());
        this.segVersion.setValue(seg.getSegVersion());
    }
    
    public SeguimientoDto(webservice.SeguimientoDto seg, ProyectoDto pro){
        this(seg);
        segProyecto = pro;
    }
    
    public Long getSegId() {
        if(segId.getValue()!= null){
            if(!segId.get().isEmpty()){
                return Long.valueOf(segId.get());
            }
        }
        return null;
    }

    public void setSegId(Long segId) {
        this.segId.setValue(segId != null ? segId.toString() : null);
    }

    public String getSegFecha() {
        if(segFecha.get() != null){
            return segFecha.get().toString();
        }
        return null;
    }

    public void setSegFecha(String segFecha) {
        this.segFecha.setValue(null);
        if(segFecha != null){
            if(!segFecha.isEmpty()){
                this.segFecha.setValue(LocalDate.parse(segFecha, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            }
        }
    }

    
    public Double getSegAvance() {
        if(segAvance.getValue()!=null){
            if(!segAvance.get().isEmpty()){
                return Double.valueOf(segAvance.get());
            }
        }
        return null;
    }

    public void setSegAvance(Integer segAvance) {
        this.segAvance.setValue(segAvance.toString());
    }

    public Long getSegVersion() {
        return segVersion.get();
    }

    public void setSegVersion(Long segVersion) {
        this.segVersion.setValue(segVersion);
    }

    public ProyectoDto getSegProyecto() {
        return segProyecto;
    }

    public void setSegProyecto(ProyectoDto segProyecto) {
        this.segProyecto = segProyecto;
    }
}