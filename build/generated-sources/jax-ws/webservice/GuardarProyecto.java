
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para guardarProyecto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guardarProyecto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proyecto" type="{http://webService/}proyectoDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardarProyecto", propOrder = {
    "proyecto"
})
public class GuardarProyecto {

    protected ProyectoDto proyecto;

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

}
