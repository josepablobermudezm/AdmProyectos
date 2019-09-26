
package webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="actividades" type="{http://webService/}actividadesDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="proAdmin" type="{http://webService/}administradorDto" minOccurs="0"/>
 *         &lt;element name="proCorreopatrocinador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proCorreotecnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proCorreousuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proFechafinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proFechafinreal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proFechainicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proFechainireal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="proLidertecnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proLiderusuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proPatrocinador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="seguimientos" type="{http://webService/}seguimientoDto" maxOccurs="unbounded" minOccurs="0"/>
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
    "actividades",
    "proAdmin",
    "proCorreopatrocinador",
    "proCorreotecnico",
    "proCorreousuario",
    "proEstado",
    "proFechafinal",
    "proFechafinreal",
    "proFechainicio",
    "proFechainireal",
    "proId",
    "proLidertecnico",
    "proLiderusuario",
    "proNombre",
    "proPatrocinador",
    "proVersion",
    "seguimientos"
})
public class ProyectoDto {

    @XmlElement(nillable = true)
    protected List<ActividadesDto> actividades;
    protected AdministradorDto proAdmin;
    protected String proCorreopatrocinador;
    protected String proCorreotecnico;
    protected String proCorreousuario;
    protected String proEstado;
    protected String proFechafinal;
    protected String proFechafinreal;
    protected String proFechainicio;
    protected String proFechainireal;
    protected Long proId;
    protected String proLidertecnico;
    protected String proLiderusuario;
    protected String proNombre;
    protected String proPatrocinador;
    protected Long proVersion;
    @XmlElement(nillable = true)
    protected List<SeguimientoDto> seguimientos;

    /**
     * Gets the value of the actividades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actividades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActividades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActividadesDto }
     * 
     * 
     */
    public List<ActividadesDto> getActividades() {
        if (actividades == null) {
            actividades = new ArrayList<ActividadesDto>();
        }
        return this.actividades;
    }

    /**
     * Obtiene el valor de la propiedad proAdmin.
     * 
     * @return
     *     possible object is
     *     {@link AdministradorDto }
     *     
     */
    public AdministradorDto getProAdmin() {
        return proAdmin;
    }

    /**
     * Define el valor de la propiedad proAdmin.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministradorDto }
     *     
     */
    public void setProAdmin(AdministradorDto value) {
        this.proAdmin = value;
    }

    /**
     * Obtiene el valor de la propiedad proCorreopatrocinador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProCorreopatrocinador() {
        return proCorreopatrocinador;
    }

    /**
     * Define el valor de la propiedad proCorreopatrocinador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProCorreopatrocinador(String value) {
        this.proCorreopatrocinador = value;
    }

    /**
     * Obtiene el valor de la propiedad proCorreotecnico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProCorreotecnico() {
        return proCorreotecnico;
    }

    /**
     * Define el valor de la propiedad proCorreotecnico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProCorreotecnico(String value) {
        this.proCorreotecnico = value;
    }

    /**
     * Obtiene el valor de la propiedad proCorreousuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProCorreousuario() {
        return proCorreousuario;
    }

    /**
     * Define el valor de la propiedad proCorreousuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProCorreousuario(String value) {
        this.proCorreousuario = value;
    }

    /**
     * Obtiene el valor de la propiedad proEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProEstado() {
        return proEstado;
    }

    /**
     * Define el valor de la propiedad proEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProEstado(String value) {
        this.proEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad proFechafinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProFechafinal() {
        return proFechafinal;
    }

    /**
     * Define el valor de la propiedad proFechafinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProFechafinal(String value) {
        this.proFechafinal = value;
    }

    /**
     * Obtiene el valor de la propiedad proFechafinreal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProFechafinreal() {
        return proFechafinreal;
    }

    /**
     * Define el valor de la propiedad proFechafinreal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProFechafinreal(String value) {
        this.proFechafinreal = value;
    }

    /**
     * Obtiene el valor de la propiedad proFechainicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProFechainicio() {
        return proFechainicio;
    }

    /**
     * Define el valor de la propiedad proFechainicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProFechainicio(String value) {
        this.proFechainicio = value;
    }

    /**
     * Obtiene el valor de la propiedad proFechainireal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProFechainireal() {
        return proFechainireal;
    }

    /**
     * Define el valor de la propiedad proFechainireal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProFechainireal(String value) {
        this.proFechainireal = value;
    }

    /**
     * Obtiene el valor de la propiedad proId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProId() {
        return proId;
    }

    /**
     * Define el valor de la propiedad proId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProId(Long value) {
        this.proId = value;
    }

    /**
     * Obtiene el valor de la propiedad proLidertecnico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProLidertecnico() {
        return proLidertecnico;
    }

    /**
     * Define el valor de la propiedad proLidertecnico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProLidertecnico(String value) {
        this.proLidertecnico = value;
    }

    /**
     * Obtiene el valor de la propiedad proLiderusuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProLiderusuario() {
        return proLiderusuario;
    }

    /**
     * Define el valor de la propiedad proLiderusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProLiderusuario(String value) {
        this.proLiderusuario = value;
    }

    /**
     * Obtiene el valor de la propiedad proNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProNombre() {
        return proNombre;
    }

    /**
     * Define el valor de la propiedad proNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProNombre(String value) {
        this.proNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad proPatrocinador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProPatrocinador() {
        return proPatrocinador;
    }

    /**
     * Define el valor de la propiedad proPatrocinador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProPatrocinador(String value) {
        this.proPatrocinador = value;
    }

    /**
     * Obtiene el valor de la propiedad proVersion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProVersion() {
        return proVersion;
    }

    /**
     * Define el valor de la propiedad proVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProVersion(Long value) {
        this.proVersion = value;
    }

    /**
     * Gets the value of the seguimientos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seguimientos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeguimientos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeguimientoDto }
     * 
     * 
     */
    public List<SeguimientoDto> getSeguimientos() {
        if (seguimientos == null) {
            seguimientos = new ArrayList<SeguimientoDto>();
        }
        return this.seguimientos;
    }

}
