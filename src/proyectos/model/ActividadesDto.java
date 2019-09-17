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
@XmlRootElement(name = "ActividadesDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ActividadesDto {
    
    @XmlTransient
    private Long ID;
    @XmlTransient
    private String descripcion;
    @XmlTransient
    private String encargado;
    @XmlTransient
    private String estado;
    @XmlTransient
    private LocalDate inicioReal;
    @XmlTransient
    private LocalDate inicioEsperado;
    @XmlTransient
    private LocalDate finalEsperado;
    @XmlTransient
    private LocalDate finalReal;
    @XmlTransient
    private Integer order;
    @XmlTransient
    private Long version;
    @XmlTransient
    private ProyectoDto proyecto;

    public ActividadesDto(Long ID, String descripcion, String encargado, String estado, LocalDate inicioReal, LocalDate inicioEsperado, LocalDate finalEsperado, LocalDate finalReal, Integer order, Long version, ProyectoDto proyecto) {
        this.ID = ID;
        this.descripcion = descripcion;
        this.encargado = encargado;
        this.estado = estado;
        this.inicioReal = inicioReal;
        this.inicioEsperado = inicioEsperado;
        this.finalEsperado = finalEsperado;
        this.finalReal = finalReal;
        this.order = order;
        this.version = version;
        this.proyecto = proyecto;
    }
    
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
    public LocalDate getInicioEsperado() {
        return inicioEsperado;
    }
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public void setInicioEsperado(LocalDate inicioEsperado) {
        this.inicioEsperado = inicioEsperado;
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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public ProyectoDto getProyecto() {
        return proyecto;
    }

    public void setProyecto(ProyectoDto proyecto) {
        this.proyecto = proyecto;
    }
    
    
}
