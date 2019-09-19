
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAdministrador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAdministrador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Administrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasenna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAdministrador", propOrder = {
    "administrador",
    "contrasenna"
})
public class GetAdministrador {

    @XmlElement(name = "Administrador")
    protected String administrador;
    protected String contrasenna;

    /**
     * Obtiene el valor de la propiedad administrador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrador() {
        return administrador;
    }

    /**
     * Define el valor de la propiedad administrador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrador(String value) {
        this.administrador = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasenna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasenna() {
        return contrasenna;
    }

    /**
     * Define el valor de la propiedad contrasenna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasenna(String value) {
        this.contrasenna = value;
    }

}
