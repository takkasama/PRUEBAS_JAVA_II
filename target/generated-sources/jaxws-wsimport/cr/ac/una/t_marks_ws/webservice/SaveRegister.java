
package cr.ac.una.t_marks_ws.webservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para saveRegister complex type.&lt;/p&gt;
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="saveRegister"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registerDTO" type="{http://webservice.t_marks_ws.una.ac.cr/}registerDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveRegister", propOrder = {
    "registerDTO"
})
public class SaveRegister {

    protected RegisterDTO registerDTO;

    /**
     * Obtiene el valor de la propiedad registerDTO.
     * 
     * @return
     *     possible object is
     *     {@link RegisterDTO }
     *     
     */
    public RegisterDTO getRegisterDTO() {
        return registerDTO;
    }

    /**
     * Define el valor de la propiedad registerDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterDTO }
     *     
     */
    public void setRegisterDTO(RegisterDTO value) {
        this.registerDTO = value;
    }

}
