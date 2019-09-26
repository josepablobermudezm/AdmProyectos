/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
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
public class ActividadesDto {
    
    public SimpleStringProperty actId;
    public SimpleStringProperty actDescripcion;
    public SimpleStringProperty actEncargado;
    public  SimpleObjectProperty<LocalDate> actFechainireal;
    public  SimpleObjectProperty<LocalDate> actFechafinreal;
    public  SimpleObjectProperty<LocalDate> actFechainicio;
    public  SimpleObjectProperty<LocalDate> actFechafinal;
    public  SimpleStringProperty actEstado;
    public  SimpleIntegerProperty actNumorden;
    public  SimpleLongProperty actVersion;
    private ProyectoDto actProyecto;
    

    public ActividadesDto() {
        actId = new SimpleStringProperty();
        actDescripcion = new SimpleStringProperty();
        actEncargado = new SimpleStringProperty();
        actFechainireal = new SimpleObjectProperty<>();
        actFechafinreal = new SimpleObjectProperty<>();
        actFechainicio = new SimpleObjectProperty<>();
        actFechafinal = new SimpleObjectProperty<>();
        actEstado = new SimpleStringProperty("Planificada");
        actNumorden = new SimpleIntegerProperty();
        actVersion = new SimpleLongProperty();
    }

    public ActividadesDto(Long actId, String actDescripcion, String actEncargado, LocalDate actFechainireal, LocalDate actFechafinreal, LocalDate actFechainicio, LocalDate actFechafinal, String actEstado, Integer actNumorden, Long actVersion) {
        this();
        this.actId.setValue(actId != null ? actId.toString() : null);
        this.actDescripcion.setValue(actDescripcion);
        this.actEncargado.setValue(actEncargado);
        this.actFechainireal.setValue(actFechainireal);
        this.actFechafinreal.setValue(actFechafinreal);
        this.actFechainicio.setValue(actFechainicio);
        this.actFechafinal.setValue(actFechafinal);
        this.actEstado.setValue(actEstado);
        this.actNumorden.setValue(actNumorden);
        this.actVersion.setValue(actVersion);
    }
    
    public ActividadesDto(webservice.ActividadesDto act){
        this();
        setActId(act.getId());
        this.actDescripcion.setValue(act.getDescripcion());
        this.actEncargado.setValue(act.getEncargado());
        setActFechainireal(act.getInicioReal());
        setActFechafinreal(act.getFinalReal());
        setActFechainicio(act.getInicioEsperado());
        setActFechafinal(act.getFinalEsperado());
        this.actEstado.setValue(act.getEstado().equals("P")?"Planificada":
        act.getEstado().equals("C")?"En Curso":act.getEstado().equals("M")?"Postergada":"Finalizada");
        this.actNumorden.setValue(act.getOrden());
        this.actVersion.setValue(act.getVersion());
    }
    public ActividadesDto(webservice.ActividadesDto act, ProyectoDto pro){
        this(act);
        actProyecto = pro;
    }   
    public Long getActId() {
        if(actId.get() != null){
            if(!actId.get().isEmpty()){
                return Long.valueOf(actId.get());
            }
        }
        return null;
    }

    public void setActId(Long actId) {
        this.actId.setValue(actId != null ? actId.toString() : null);
    }

    public String getActDescripcion() {
        return actDescripcion.get();
    }

    public void setActDescripcion(String actDescripcion) {
        this.actDescripcion.setValue(actDescripcion);
    }

    public String getActEncargado() {
        return actEncargado.get();
    }

    public void setActEncargado(String actEncargado) {
        this.actEncargado.setValue(actEncargado);
    }

    public String getActFechainireal() {
        if(actFechainireal.get() != null){
            return actFechainireal.get().toString();
        }
        return null;
    }

    public void setActFechainireal(String actFechainireal) {
        this.actFechainireal.setValue(null);
        if(actFechainireal != null){
            if(!actFechainireal.isEmpty()){
                this.actFechainireal.setValue(LocalDate.parse(actFechainireal, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            }
        }
    }

    public String getActFechafinreal() {
        if(actFechafinreal.get() != null){
            return actFechafinreal.get().toString();
        }
        return null;
    }

    public void setActFechafinreal(String actFechafinreal) {
        this.actFechafinreal.setValue(null);
        if(actFechafinreal != null){
            if(!actFechafinreal.isEmpty()){
                this.actFechafinreal.setValue(LocalDate.parse(actFechafinreal, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            }
        }
    }

    public String getActEstado() {
        return actEstado.get();
    }

    public void setActEstado(String actEstado) {
        this.actEstado.setValue(actEstado);
    }

    public Integer getActNumorden() {
        return actNumorden.get();
    }

    public void setActNumorden(Integer actNumorden) {
        this.actNumorden.setValue(actNumorden);
    }

    public Long getActVersion() {
        return actVersion.get();
    }

    public void setActVersion(Long actVersion) {
        this.actVersion.setValue(actVersion);
    }

    public ProyectoDto getActProyecto() {
        return actProyecto;
    }

    public void setActProyecto(ProyectoDto actProyecto) {
        this.actProyecto = actProyecto;
    }

    public String getActFechainicio() {
        if(actFechainicio.get() != null){
            return actFechainicio.get().toString();
        }
        return null;
    }

    public void setActFechainicio(String actFechainicio) {
        this.actFechainicio.setValue(null);
        if(actFechainicio != null){
            if(!actFechainicio.isEmpty()){
                this.actFechainicio.setValue(LocalDate.parse(actFechainicio, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            }
        }
    }

    public String getActFechafinal() {
        return actFechafinal.get() == null ? null : actFechafinal.get().toString();
    }

    public void setActFechafinal(String actFechafinal) {
        this.actFechafinal.setValue(null);
        if(actFechafinal != null){
            if(!actFechafinal.isEmpty()){
                this.actFechafinal.setValue(LocalDate.parse(actFechafinal, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            }
        }
    }
}