
package webservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tblProyecto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tblProyecto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pryCorreopatrocinador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pryCorreotenico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pryCorreousuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pryEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pryFinalesperado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pryFinalreal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pryId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pryInicioreal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pryLiderusuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pryNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pryPatrocinador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pryVersion" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="pyrInicioesperado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pyrLidertecnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tblProyecto", propOrder = {
    "pryCorreopatrocinador",
    "pryCorreotenico",
    "pryCorreousuario",
    "pryEstado",
    "pryFinalesperado",
    "pryFinalreal",
    "pryId",
    "pryInicioreal",
    "pryLiderusuario",
    "pryNombre",
    "pryPatrocinador",
    "pryVersion",
    "pyrInicioesperado",
    "pyrLidertecnico"
})
public class TblProyecto {

    protected String pryCorreopatrocinador;
    protected String pryCorreotenico;
    protected String pryCorreousuario;
    protected String pryEstado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pryFinalesperado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pryFinalreal;
    protected BigDecimal pryId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pryInicioreal;
    protected String pryLiderusuario;
    protected String pryNombre;
    protected String pryPatrocinador;
    protected BigInteger pryVersion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pyrInicioesperado;
    protected String pyrLidertecnico;

    /**
     * Obtiene el valor de la propiedad pryCorreopatrocinador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPryCorreopatrocinador() {
        return pryCorreopatrocinador;
    }

    /**
     * Define el valor de la propiedad pryCorreopatrocinador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPryCorreopatrocinador(String value) {
        this.pryCorreopatrocinador = value;
    }

    /**
     * Obtiene el valor de la propiedad pryCorreotenico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPryCorreotenico() {
        return pryCorreotenico;
    }

    /**
     * Define el valor de la propiedad pryCorreotenico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPryCorreotenico(String value) {
        this.pryCorreotenico = value;
    }

    /**
     * Obtiene el valor de la propiedad pryCorreousuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPryCorreousuario() {
        return pryCorreousuario;
    }

    /**
     * Define el valor de la propiedad pryCorreousuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPryCorreousuario(String value) {
        this.pryCorreousuario = value;
    }

    /**
     * Obtiene el valor de la propiedad pryEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPryEstado() {
        return pryEstado;
    }

    /**
     * Define el valor de la propiedad pryEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPryEstado(String value) {
        this.pryEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad pryFinalesperado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPryFinalesperado() {
        return pryFinalesperado;
    }

    /**
     * Define el valor de la propiedad pryFinalesperado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPryFinalesperado(XMLGregorianCalendar value) {
        this.pryFinalesperado = value;
    }

    /**
     * Obtiene el valor de la propiedad pryFinalreal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPryFinalreal() {
        return pryFinalreal;
    }

    /**
     * Define el valor de la propiedad pryFinalreal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPryFinalreal(XMLGregorianCalendar value) {
        this.pryFinalreal = value;
    }

    /**
     * Obtiene el valor de la propiedad pryId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPryId() {
        return pryId;
    }

    /**
     * Define el valor de la propiedad pryId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPryId(BigDecimal value) {
        this.pryId = value;
    }

    /**
     * Obtiene el valor de la propiedad pryInicioreal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPryInicioreal() {
        return pryInicioreal;
    }

    /**
     * Define el valor de la propiedad pryInicioreal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPryInicioreal(XMLGregorianCalendar value) {
        this.pryInicioreal = value;
    }

    /**
     * Obtiene el valor de la propiedad pryLiderusuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPryLiderusuario() {
        return pryLiderusuario;
    }

    /**
     * Define el valor de la propiedad pryLiderusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPryLiderusuario(String value) {
        this.pryLiderusuario = value;
    }

    /**
     * Obtiene el valor de la propiedad pryNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPryNombre() {
        return pryNombre;
    }

    /**
     * Define el valor de la propiedad pryNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPryNombre(String value) {
        this.pryNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad pryPatrocinador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPryPatrocinador() {
        return pryPatrocinador;
    }

    /**
     * Define el valor de la propiedad pryPatrocinador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPryPatrocinador(String value) {
        this.pryPatrocinador = value;
    }

    /**
     * Obtiene el valor de la propiedad pryVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPryVersion() {
        return pryVersion;
    }

    /**
     * Define el valor de la propiedad pryVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPryVersion(BigInteger value) {
        this.pryVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad pyrInicioesperado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPyrInicioesperado() {
        return pyrInicioesperado;
    }

    /**
     * Define el valor de la propiedad pyrInicioesperado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPyrInicioesperado(XMLGregorianCalendar value) {
        this.pyrInicioesperado = value;
    }

    /**
     * Obtiene el valor de la propiedad pyrLidertecnico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPyrLidertecnico() {
        return pyrLidertecnico;
    }

    /**
     * Define el valor de la propiedad pyrLidertecnico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPyrLidertecnico(String value) {
        this.pyrLidertecnico = value;
    }

}
