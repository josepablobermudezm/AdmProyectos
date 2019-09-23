/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jose Pablo Bermudez
 */

public class ProyectoDto {

    private SimpleStringProperty proId;
    private SimpleStringProperty proNombre;
    private SimpleStringProperty proPatrocinador;
    private SimpleStringProperty proLiderusuario;
    private SimpleStringProperty proLidertecnico;
    private SimpleStringProperty proCorreopatrocinador;
    private SimpleStringProperty proCorreousuario;
    private SimpleStringProperty proCorreotecnico;
    private SimpleObjectProperty<LocalDate> proFechainireal;
    private SimpleObjectProperty<LocalDate> proFechafinreal;
    private SimpleObjectProperty<LocalDate> proFechainicio;
    private SimpleObjectProperty<LocalDate> proFechafinal;
    private SimpleObjectProperty<String> proEstado;
    private SimpleLongProperty proVersion;

    private ObservableList<SeguimientoDto> seguimientos = FXCollections.observableArrayList();
    private ObservableList<ActividadesDto> actividades = FXCollections.observableArrayList();

    public ProyectoDto() {
        this.proId = new SimpleStringProperty();
        this.proNombre = new SimpleStringProperty();
        this.proPatrocinador = new SimpleStringProperty();
        this.proLiderusuario = new SimpleStringProperty();
        this.proLidertecnico = new SimpleStringProperty();
        this.proCorreopatrocinador = new SimpleStringProperty();
        this.proCorreousuario = new SimpleStringProperty();
        this.proCorreotecnico = new SimpleStringProperty();
        this.proFechainireal = new SimpleObjectProperty<LocalDate>();
        this.proFechafinreal = new SimpleObjectProperty<LocalDate>();
        this.proFechainicio = new SimpleObjectProperty<LocalDate>();
        this.proFechafinal = new SimpleObjectProperty<LocalDate>();
        this.proEstado = new SimpleObjectProperty("P");
        this.proVersion = new SimpleLongProperty();
    }

    public ProyectoDto(webservice.ProyectoDto proyect){
        this();
        this.proId.setValue(proyect.getProId() == null ? "" : proyect.getProId().toString());
        this.proNombre.setValue(proyect.getProNombre());
        this.proPatrocinador.setValue(proyect.getProPatrocinador());
        this.proLiderusuario.setValue(proyect.getProLiderusuario());
        this.proLidertecnico.setValue(proyect.getProLidertecnico());
        this.proCorreopatrocinador.setValue(proyect.getProCorreopatrocinador());
        this.proCorreousuario.setValue(proyect.getProCorreousuario());
        this.proCorreotecnico.setValue(proyect.getProCorreotecnico());
        setProFechainireal(proyect.getProFechainireal());
        setProFechafinreal(proyect.getProFechafinreal());
        setProFechainicio(proyect.getProFechainicio());
        setProFechafinal(proyect.getProFechafinal());
        this.proEstado.setValue(proyect.getProEstado());
        this.proVersion.setValue(proyect.getProVersion());
        // Faltan listas del Service
        // Actividades - Seguimientos
    }

    public ProyectoDto(Long proId, String proNombre, String proPatrocinador, String proLiderusuario, String proLidertecnico, String proCorreopatrocinador, String proCorreousuario, String proCorreotecnico, LocalDate proFechainireal, LocalDate proFechafinreal, LocalDate proFechainicio, LocalDate proFechafinal, String proEstado, Long proVersion) {
        this();
        this.proId.setValue(proId == null ? null : proId.toString());
        this.proNombre.setValue(proNombre);
        this.proPatrocinador.setValue(proPatrocinador);
        this.proLiderusuario.setValue(proLiderusuario);
        this.proLidertecnico.setValue(proLidertecnico);
        this.proCorreopatrocinador.setValue(proCorreopatrocinador);
        this.proCorreousuario.setValue(proCorreousuario);
        this.proCorreotecnico.setValue(proCorreotecnico);
        this.proFechainireal.setValue(proFechainireal);
        this.proFechafinreal.setValue(proFechafinreal);
        this.proFechainicio.setValue(proFechainicio);
        this.proFechafinal.setValue(proFechafinal);
        this.proEstado.setValue(proEstado);
        this.proVersion.setValue(proVersion);
    }

    public Long getProId() {
        if (proId.get() != null) {
            if (!proId.get().isEmpty()) {
                return Long.valueOf(proId.get());
            }
        }
        return null;
    }

    public void setProId(Long proId) {
        this.proId.setValue(proId == null ? null : proId.toString());
    }

    public String getProNombre() {
        return proNombre.get();
    }

    public void setProNombre(String proNombre) {
        this.proNombre.setValue(proNombre);
    }

    public String getProPatrocinador() {
        return proPatrocinador.get();
    }

    public void setProPatrocinador(String proPatrocinador) {
        this.proPatrocinador.setValue(proPatrocinador);
    }

    public String getProLiderusuario() {
        return proLiderusuario.get();
    }

    public void setProLiderusuario(String proLiderusuario) {
        this.proLiderusuario.setValue(proLiderusuario);
    }

    public String getProLidertecnico() {
        return proLidertecnico.get();
    }

    public void setProLidertecnico(String proLidertecnico) {
        this.proLidertecnico.setValue(proLidertecnico);
    }

    public String getProCorreopatrocinador() {
        return proCorreopatrocinador.get();
    }

    public void setProCorreopatrocinador(String proCorreopatrocinador) {
        this.proCorreopatrocinador.setValue(proCorreopatrocinador);
    }

    public String getProCorreousuario() {
        return proCorreousuario.get();
    }

    public void setProCorreousuario(String proCorreousuario) {
        this.proCorreousuario.setValue(proCorreousuario);
    }

    public String getProCorreotecnico() {
        return proCorreotecnico.get();
    }

    public void setProCorreotecnico(String proCorreotecnico) {
        this.proCorreotecnico.setValue(proCorreotecnico);
    }

    public String getProFechainireal() {
        if(proFechainireal.get() != null){
            return proFechainireal.get().toString();
        }
        return null;
    }

    public void setProFechainireal(String proFechainireal) {
        this.proFechainireal.setValue(null);
        if(proFechainireal != null){
            if(!proFechainireal.isEmpty()){
                this.proFechainireal.setValue(LocalDate.parse(proFechainireal, DateTimeFormatter.ISO_DATE));
            }
        }
    }

    public String getProFechafinreal() {
        if(proFechafinreal.get() != null){
            return proFechafinreal.get().toString();
        }
        return null;
    }

    public void setProFechafinreal(String proFechafinreal) {
        this.proFechafinreal.setValue(null);
        if(proFechafinreal != null){
            if(!proFechafinreal.isEmpty()){
                this.proFechafinreal.setValue(LocalDate.parse(proFechafinreal, DateTimeFormatter.ISO_DATE));
            }
        }
    }

    public String getProEstado() {
        return proEstado.get();
    }

    public void setProEstado(String proEstado) {
        this.proEstado.setValue(proEstado);
    }

    public String getProFechainicio() {
        if(proFechainicio.get() != null){
            return this.proFechainicio.get().toString();
        }
        return null;
    }

    public void setProFechainicio(String proFechainicio) {
        this.proFechainicio.setValue(null);
        if(proFechainicio != null){
            if(!proFechainicio.isEmpty()){
                this.proFechainicio.setValue(LocalDate.parse(proFechainicio, DateTimeFormatter.ISO_DATE));
            }
        }
    }

    public String getProFechafinal() {
        if(proFechafinal.get() != null){
            return this.proFechafinal.get().toString();
        }
        return null;
    }

    public void setProFechafinal(String proFechafinal) {
        this.proFechafinal.setValue(null);
        if(proFechafinal != null){
            if(!proFechafinal.isEmpty()){
                this.proFechafinal.setValue(LocalDate.parse(proFechafinal, DateTimeFormatter.ISO_DATE));
            }
        }
    }

    public Long getProVersion() {
        return proVersion.get();
    }

    public void setProVersion(Long proVersion) {
        this.proVersion.setValue(proVersion);
    }

    public ObservableList<SeguimientoDto> getSeguimientos() {
        return seguimientos;
    }
/*
    public List<ws.admin.ac.cr.controller.SeguimientoDto> getSeguimientosService() {
        List<ws.admin.ac.cr.controller.SeguimientoDto> segs = new ArrayList<>();
        try {
            CastingDto cast = new CastingDto();
            for (SeguimientoDto s : seguimientos) {
                segs.add(cast.castSeg(s));
            }
            return segs;
        } catch (Exception ex) {
            System.err.println("Error Pasar Seguimientos a servidor ProyectoDto getSeguimiientosService() " + ex.getMessage());
            return segs;
        }
    }
*/
    public void setSeguimientos(ObservableList<SeguimientoDto> seguimientos) {
        this.seguimientos = seguimientos;
    }
    
    // setFromServidor

    public ObservableList<ActividadesDto> getActividades() {
        return actividades;
    }

    /*public List<ws.admin.ac.cr.controller.ActividadDto> getActividadesService() {
        List<ws.admin.ac.cr.controller.ActividadDto> acts = new ArrayList<>();
        try {
            CastingDto cast = new CastingDto();
            for (ActividadDto a : actividades) {
                acts.add(cast.castAct(a));
            }
            return acts;
        } catch (Exception ex) {
            System.err.println("Error Pasar Actividades a servidor ProyectoDto getActividadesService() " + ex.getMessage());
            return acts;
        }
    }*/

    public void setActividades(ObservableList<ActividadesDto> actividades) {
        this.actividades = actividades;
    }

    
    // setFromServidor
}
