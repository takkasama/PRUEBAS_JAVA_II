
package cr.ac.una.t_marks_ws.webservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para saveMark complex type.&lt;/p&gt;
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="saveMark"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="markDTO" type="{http://webservice.t_marks_ws.una.ac.cr/}markDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveMark", propOrder = {
    "markDTO"
})
public class SaveMark {

    protected MarkDTO markDTO;

    /**
     * Obtiene el valor de la propiedad markDTO.
     * 
     * @return
     *     possible object is
     *     {@link MarkDTO }
     *     
     */
    public MarkDTO getMarkDTO() {
        return markDTO;
    }

    /**
     * Define el valor de la propiedad markDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkDTO }
     *     
     */
    public void setMarkDTO(MarkDTO value) {
        this.markDTO = value;
    }

}
