
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="segAvance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="segFecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="segProyecto" type="{http://webService/}proyectoDto" minOccurs="0"/>
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
    "segProyecto"
})
public class SeguimientoDto {

    protected Integer segAvance;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar segFecha;
    protected ProyectoDto segProyecto;

    /**
     * Obtiene el valor de la propiedad segAvance.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegAvance() {
        return segAvance;
    }

    /**
     * Define el valor de la propiedad segAvance.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegAvance(Integer value) {
        this.segAvance = value;
    }

    /**
     * Obtiene el valor de la propiedad segFecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSegFecha() {
        return segFecha;
    }

    /**
     * Define el valor de la propiedad segFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSegFecha(XMLGregorianCalendar value) {
        this.segFecha = value;
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

}
