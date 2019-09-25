
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para guardarSeguimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guardarSeguimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seguimiento" type="{http://webService/}seguimientoDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardarSeguimiento", propOrder = {
    "seguimiento"
})
public class GuardarSeguimiento {

    protected SeguimientoDto seguimiento;

    /**
     * Obtiene el valor de la propiedad seguimiento.
     * 
     * @return
     *     possible object is
     *     {@link SeguimientoDto }
     *     
     */
    public SeguimientoDto getSeguimiento() {
        return seguimiento;
    }

    /**
     * Define el valor de la propiedad seguimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link SeguimientoDto }
     *     
     */
    public void setSeguimiento(SeguimientoDto value) {
        this.seguimiento = value;
    }

}
