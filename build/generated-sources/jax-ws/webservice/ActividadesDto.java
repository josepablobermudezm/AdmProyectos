
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actividadesDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actividadesDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encargado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalEsperado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalReal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inicioEsperado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inicioReal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orden" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="proyecto" type="{http://webService/}proyectoDto" minOccurs="0"/>
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
@XmlType(name = "actividadesDto", propOrder = {
    "descripcion",
    "encargado",
    "estado",
    "finalEsperado",
    "finalReal",
    "id",
    "inicioEsperado",
    "inicioReal",
    "orden",
    "proyecto",
    "version"
})
public class ActividadesDto {

    protected String descripcion;
    protected String encargado;
    protected String estado;
    protected String finalEsperado;
    protected String finalReal;
    protected Long id;
    protected String inicioEsperado;
    protected String inicioReal;
    protected Integer orden;
    protected ProyectoDto proyecto;
    protected Long version;

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad encargado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncargado() {
        return encargado;
    }

    /**
     * Define el valor de la propiedad encargado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncargado(String value) {
        this.encargado = value;
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
     *     {@link String }
     *     
     */
    public String getFinalEsperado() {
        return finalEsperado;
    }

    /**
     * Define el valor de la propiedad finalEsperado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalEsperado(String value) {
        this.finalEsperado = value;
    }

    /**
     * Obtiene el valor de la propiedad finalReal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalReal() {
        return finalReal;
    }

    /**
     * Define el valor de la propiedad finalReal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalReal(String value) {
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
     *     {@link String }
     *     
     */
    public String getInicioEsperado() {
        return inicioEsperado;
    }

    /**
     * Define el valor de la propiedad inicioEsperado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInicioEsperado(String value) {
        this.inicioEsperado = value;
    }

    /**
     * Obtiene el valor de la propiedad inicioReal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInicioReal() {
        return inicioReal;
    }

    /**
     * Define el valor de la propiedad inicioReal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInicioReal(String value) {
        this.inicioReal = value;
    }

    /**
     * Obtiene el valor de la propiedad orden.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrden() {
        return orden;
    }

    /**
     * Define el valor de la propiedad orden.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrden(Integer value) {
        this.orden = value;
    }

    /**
     * Obtiene el valor de la propiedad proyecto.
     * 
     * @return
     *     possible object is
     *     {@link ProyectoDto }
     *     
     */
    public ProyectoDto getProyecto() {
        return proyecto;
    }

    /**
     * Define el valor de la propiedad proyecto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProyectoDto }
     *     
     */
    public void setProyecto(ProyectoDto value) {
        this.proyecto = value;
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
