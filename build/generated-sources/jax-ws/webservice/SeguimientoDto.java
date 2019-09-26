
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para seguimientoDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="seguimientoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="segAvance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="segFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="segProyecto" type="{http://webService/}proyectoDto" minOccurs="0"/>
 *         &lt;element name="segVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seguimientoDto", propOrder = {
    "segAvance",
    "segFecha",
    "segId",
    "segProyecto",
    "segVersion"
})
public class SeguimientoDto {

    protected Double segAvance;
    protected String segFecha;
    protected Long segId;
    protected ProyectoDto segProyecto;
    protected Long segVersion;

    /**
     * Obtiene el valor de la propiedad segAvance.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSegAvance() {
        return segAvance;
    }

    /**
     * Define el valor de la propiedad segAvance.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSegAvance(Double value) {
        this.segAvance = value;
    }

    /**
     * Obtiene el valor de la propiedad segFecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegFecha() {
        return segFecha;
    }

    /**
     * Define el valor de la propiedad segFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegFecha(String value) {
        this.segFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad segId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSegId() {
        return segId;
    }

    /**
     * Define el valor de la propiedad segId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSegId(Long value) {
        this.segId = value;
    }

    /**
     * Obtiene el valor de la propiedad segProyecto.
     * 
     * @return
     *     possible object is
     *     {@link ProyectoDto }
     *     
     */
    public ProyectoDto getSegProyecto() {
        return segProyecto;
    }

    /**
     * Define el valor de la propiedad segProyecto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProyectoDto }
     *     
     */
    public void setSegProyecto(ProyectoDto value) {
        this.segProyecto = value;
    }

    /**
     * Obtiene el valor de la propiedad segVersion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSegVersion() {
        return segVersion;
    }

    /**
     * Define el valor de la propiedad segVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSegVersion(Long value) {
        this.segVersion = value;
    }

}
