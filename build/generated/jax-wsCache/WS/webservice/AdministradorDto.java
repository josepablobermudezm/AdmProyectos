
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para administradorDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="administradorDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adnCedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adnContrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adnCorreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adnEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adnNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adnPapellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adnSapellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adnUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adnVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "administradorDto", propOrder = {
    "adnCedula",
    "adnContrasena",
    "adnCorreo",
    "adnEstado",
    "adnId",
    "adnNombre",
    "adnPapellido",
    "adnSapellido",
    "adnUsuario",
    "adnVersion"
})
public class AdministradorDto {

    protected String adnCedula;
    protected String adnContrasena;
    protected String adnCorreo;
    protected String adnEstado;
    protected Long adnId;
    protected String adnNombre;
    protected String adnPapellido;
    protected String adnSapellido;
    protected String adnUsuario;
    protected Long adnVersion;

    /**
     * Obtiene el valor de la propiedad adnCedula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdnCedula() {
        return adnCedula;
    }

    /**
     * Define el valor de la propiedad adnCedula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdnCedula(String value) {
        this.adnCedula = value;
    }

    /**
     * Obtiene el valor de la propiedad adnContrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdnContrasena() {
        return adnContrasena;
    }

    /**
     * Define el valor de la propiedad adnContrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdnContrasena(String value) {
        this.adnContrasena = value;
    }

    /**
     * Obtiene el valor de la propiedad adnCorreo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdnCorreo() {
        return adnCorreo;
    }

    /**
     * Define el valor de la propiedad adnCorreo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdnCorreo(String value) {
        this.adnCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad adnEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdnEstado() {
        return adnEstado;
    }

    /**
     * Define el valor de la propiedad adnEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdnEstado(String value) {
        this.adnEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad adnId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdnId() {
        return adnId;
    }

    /**
     * Define el valor de la propiedad adnId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdnId(Long value) {
        this.adnId = value;
    }

    /**
     * Obtiene el valor de la propiedad adnNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdnNombre() {
        return adnNombre;
    }

    /**
     * Define el valor de la propiedad adnNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdnNombre(String value) {
        this.adnNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad adnPapellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdnPapellido() {
        return adnPapellido;
    }

    /**
     * Define el valor de la propiedad adnPapellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdnPapellido(String value) {
        this.adnPapellido = value;
    }

    /**
     * Obtiene el valor de la propiedad adnSapellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdnSapellido() {
        return adnSapellido;
    }

    /**
     * Define el valor de la propiedad adnSapellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdnSapellido(String value) {
        this.adnSapellido = value;
    }

    /**
     * Obtiene el valor de la propiedad adnUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdnUsuario() {
        return adnUsuario;
    }

    /**
     * Define el valor de la propiedad adnUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdnUsuario(String value) {
        this.adnUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad adnVersion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdnVersion() {
        return adnVersion;
    }

    /**
     * Define el valor de la propiedad adnVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdnVersion(Long value) {
        this.adnVersion = value;
    }

}
