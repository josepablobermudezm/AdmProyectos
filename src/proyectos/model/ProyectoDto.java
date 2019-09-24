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
import javafx.beans.property.ObjectProperty;
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

    public SimpleStringProperty proId;
    public SimpleStringProperty proNombre;
    public SimpleStringProperty proPatrocinador;
    public SimpleStringProperty proLiderusuario;
    public SimpleStringProperty proLidertecnico;
    public SimpleStringProperty proCorreopatrocinador;
    public SimpleStringProperty proCorreousuario;
    public SimpleStringProperty proCorreotecnico;
    public ObjectProperty<LocalDate> proFechainireal;
    public ObjectProperty<LocalDate> proFechafinreal;
    public ObjectProperty<LocalDate> proFechainicio;
    public ObjectProperty<LocalDate> proFechafinal;
    public ObjectProperty<String> proEstado;
    public SimpleStringProperty proVersion;
    private List<ActividadesDto> actividadList;
    private List<SeguimientoDto> seguimientoList;
    private AdministradorDto proAdministrador;

    public ProyectoDto() {
        this.proId = new SimpleStringProperty();
        this.proNombre = new SimpleStringProperty();
        this.proPatrocinador = new SimpleStringProperty();
        this.proLiderusuario = new SimpleStringProperty();
        this.proLidertecnico = new SimpleStringProperty();
        this.proCorreopatrocinador = new SimpleStringProperty();
        this.proCorreousuario = new SimpleStringProperty();
        this.proCorreotecnico = new SimpleStringProperty();
        this.proFechainireal = new SimpleObjectProperty();
        this.proFechafinreal = new SimpleObjectProperty();
        this.proFechainicio = new SimpleObjectProperty();
        this.proFechafinal = new SimpleObjectProperty();
        this.proEstado = new SimpleObjectProperty();
        this.proVersion = new SimpleStringProperty();
    }

    public ProyectoDto(webservice.ProyectoDto proyect) {
        this();
        this.proId.setValue(proyect.getProId() == null ? "" : proyect.getProId().toString());
        this.proNombre.setValue(proyect.getProNombre());
        this.proPatrocinador.setValue(proyect.getProPatrocinador());
        this.proLiderusuario.setValue(proyect.getProLiderusuario());
        this.proLidertecnico.setValue(proyect.getProLidertecnico());
        this.proCorreopatrocinador.setValue(proyect.getProCorreopatrocinador());
        this.proCorreousuario.setValue(proyect.getProCorreousuario());
        this.proCorreotecnico.setValue(proyect.getProCorreotecnico());
        if (proyect.getProFechafinal() != null) {
            LocalDate fechFinal = LocalDate.parse(proyect.getProFechafinal(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            this.proFechafinal.set(fechFinal);
        }
        if (proyect.getProFechafinreal() != null) {
            LocalDate fechFinalReal = LocalDate.parse(proyect.getProFechafinreal(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            this.proFechafinreal.set(fechFinalReal);
        }
        if (proyect.getProFechainicio() != null) {
            LocalDate fechIni = LocalDate.parse(proyect.getProFechainicio(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            this.proFechainicio.set(fechIni);
        }
        if (proyect.getProFechainireal() != null) {
            LocalDate fechIniReal = LocalDate.parse(proyect.getProFechainireal(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            this.proFechainireal.set(fechIniReal);
        }

        this.proEstado.setValue(proyect.getProEstado().equals("P")?"Planificado":
        proyect.getProEstado().equals("C")?"En Curso":proyect.getProEstado().equals("F")?"Finalizado":"Suspendido");
        this.proVersion.setValue(proyect.getProVersion().toString());
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
        this.proVersion.setValue(proVersion.toString());
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

    public LocalDate getProFechainireal() {
        return proFechainireal.get();
    }

    public void setProFechainireal(LocalDate proFechainireal) {
        this.proFechainireal.setValue(proFechainireal);

    }

    public LocalDate getProFechafinreal() {
        return proFechafinreal.get();
    }

    public void setProFechafinreal(LocalDate proFechafinreal) {
        this.proFechafinreal.setValue(proFechafinreal);
    }

    public LocalDate getProFechainicio() {
        return this.proFechainicio.get();
    }

    public void setProFechainicio(LocalDate proFechainicio) {
        this.proFechainicio.setValue(proFechainicio);
    }

    public LocalDate getProFechafinal() {
        return this.proFechafinal.get();
    }

    public void setProFechafinal(LocalDate proFechafinal) {
        this.proFechafinal.setValue(proFechafinal);
    }

    public String getProEstado() {
        return proEstado.get();
    }

    public void setProEstado(String proEstado) {
        this.proEstado.setValue(proEstado);
    }
    
    public List<ActividadesDto> getActividadList() {
        return actividadList;
    }

    public void setActividadList(List<ActividadesDto> actividadList) {
        this.actividadList = actividadList;
    }

    public List<SeguimientoDto> getSeguimientoList() {
        return seguimientoList;
    }

    public void setSeguimientoList(List<SeguimientoDto> seguimientoList) {
        this.seguimientoList = seguimientoList;
    }

    public AdministradorDto getProAdministrador() {
        return proAdministrador;
    }

    public void setProAdministrador(AdministradorDto proAdministrador) {
        this.proAdministrador = proAdministrador;
    }

    public Long getProVersion() {
        if (proVersion.get() != null) {
            if (!proVersion.get().isEmpty()) {
                return Long.valueOf(proVersion.get());
            }
        }
        return null;
    }

    public void setProVersion(Long proVersion) {
        this.proVersion.setValue(proVersion.toString());
    }
    
/*
    public ObservableList<SeguimientoDto> getSeguimientos() {
        return seguimientos;
    }
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
   
   public List<ws.admin.ac.cr.controller.ActividadDto> getActividadesService() {
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
    }
    public void setActividades(ObservableList<ActividadDto> actividades) {
        this.actividades = actividades;
    }
*/
    // setFromServidor

}
