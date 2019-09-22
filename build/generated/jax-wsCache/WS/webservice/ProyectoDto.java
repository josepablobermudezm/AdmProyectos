
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para proyectoDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="proyectoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correoLiderTecnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correoLiderUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correoPatrocinador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalEsperado" type="{http://webService/}localDate" minOccurs="0"/>
 *         &lt;element name="finalReal" type="{http://webService/}localDate" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inicioEsperado" type="{http://webService/}localDate" minOccurs="0"/>
 *         &lt;element name="inicioReal" type="{http://webService/}localDate" minOccurs="0"/>
 *         &lt;element name="liderTectnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="liderUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patrocinador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proyectoDto", propOrder = {
    "correoLiderTecnico",
    "correoLiderUsuario",
    "correoPatrocinador",
    "estado",
    "finalEsperado",
    "finalReal",
    "id",
    "inicioEsperado",
    "inicioReal",
    "liderTectnico",
    "liderUsuario",
    "nombre",
    "patrocinador",
    "version"
})
public class ProyectoDto {

    protected String correoLiderTecnico;
    protected String correoLiderUsuario;
    protected String correoPatrocinador;
    protected String estado;
    protected LocalDate finalEsperado;
    protected LocalDate finalReal;
    protected Long id;
    protected LocalDate inicioEsperado;
    protected LocalDate inicioReal;
    protected String liderTectnico;
    protected String liderUsuario;
    protected String nombre;
    protected String patrocinador;
    protected Long version;

    /**
     * Obtiene el valor de la propiedad correoLiderTecnico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoLiderTecnico() {
        return correoLiderTecnico;
    }

    /**
     * Define el valor de la propiedad correoLiderTecnico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoLiderTecnico(String value) {
        this.correoLiderTecnico = value;
    }

    /**
     * Obtiene el valor de la propiedad correoLiderUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoLiderUsuario() {
        return correoLiderUsuario;
    }

    /**
     * Define el valor de la propiedad correoLiderUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoLiderUsuario(String value) {
        this.correoLiderUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad correoPatrocinador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoPatrocinador() {
        return correoPatrocinador;
    }

    /**
     * Define el valor de la propiedad correoPatrocinador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoPatrocinador(String value) {
        this.correoPatrocinador = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad finalEsperado.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getFinalEsperado() {
        return finalEsperado;
    }

    /**
     * Define el valor de la propiedad finalEsperado.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setFinalEsperado(LocalDate value) {
        this.finalEsperado = value;
    }

    /**
     * Obtiene el valor de la propiedad finalReal.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getFinalReal() {
        return finalReal;
    }

    /**
     * Define el valor de la propiedad finalReal.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setFinalReal(LocalDate value) {
        this.finalReal = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad inicioEsperado.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getInicioEsperado() {
        return inicioEsperado;
    }

    /**
     * Define el valor de la propiedad inicioEsperado.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setInicioEsperado(LocalDate value) {
        this.inicioEsperado = value;
    }

    /**
     * Obtiene el valor de la propiedad inicioReal.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getInicioReal() {
        return inicioReal;
    }

    /**
     * Define el valor de la propiedad inicioReal.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setInicioReal(LocalDate value) {
        this.inicioReal = value;
    }

    /**
     * Obtiene el valor de la propiedad liderTectnico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiderTectnico() {
        return liderTectnico;
    }

    /**
     * Define el valor de la propiedad liderTectnico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiderTectnico(String value) {
        this.liderTectnico = value;
    }

    /**
     * Obtiene el valor de la propiedad liderUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiderUsuario() {
        return liderUsuario;
    }

    /**
     * Define el valor de la propiedad liderUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiderUsuario(String value) {
        this.liderUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad patrocinador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatrocinador() {
        return patrocinador;
    }

    /**
     * Define el valor de la propiedad patrocinador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatrocinador(String value) {
        this.patrocinador = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

}
