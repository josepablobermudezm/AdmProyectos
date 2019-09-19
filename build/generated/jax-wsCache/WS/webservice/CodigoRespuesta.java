
package webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para codigoRespuesta.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="codigoRespuesta">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CORRECTO"/>
 *     &lt;enumeration value="ERROR_ACCESO"/>
 *     &lt;enumeration value="ERROR_PERMISOS"/>
 *     &lt;enumeration value="ERROR_NOENCONTRADO"/>
 *     &lt;enumeration value="ERROR_CLIENTE"/>
 *     &lt;enumeration value="ERROR_INTERNO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "codigoRespuesta")
@XmlEnum
public enum CodigoRespuesta {

    CORRECTO,
    ERROR_ACCESO,
    ERROR_PERMISOS,
    ERROR_NOENCONTRADO,
    ERROR_CLIENTE,
    ERROR_INTERNO;

    public String value() {
        return name();
    }

    public static CodigoRespuesta fromValue(String v) {
        return valueOf(v);
    }

}
