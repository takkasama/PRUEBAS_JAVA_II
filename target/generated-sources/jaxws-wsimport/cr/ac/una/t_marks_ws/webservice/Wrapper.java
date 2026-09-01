
package cr.ac.una.t_marks_ws.webservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para wrapper complex type.&lt;/p&gt;
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="wrapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="mark" type="{http://webservice.t_marks_ws.una.ac.cr/}markDTO"/&gt;
 *           &lt;element name="folio" type="{http://webservice.t_marks_ws.una.ac.cr/}registerDTO"/&gt;
 *           &lt;element name="employe" type="{http://webservice.t_marks_ws.una.ac.cr/}employeeDTO"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="internalMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wrapper", propOrder = {
    "mark",
    "folio",
    "employe",
    "internalMessage",
    "message",
    "state"
})
public class Wrapper {

    protected MarkDTO mark;
    protected RegisterDTO folio;
    protected EmployeeDTO employe;
    protected String internalMessage;
    protected String message;
    protected Boolean state;

    /**
     * Obtiene el valor de la propiedad mark.
     * 
     * @return
     *     possible object is
     *     {@link MarkDTO }
     *     
     */
    public MarkDTO getMark() {
        return mark;
    }

    /**
     * Define el valor de la propiedad mark.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkDTO }
     *     
     */
    public void setMark(MarkDTO value) {
        this.mark = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link RegisterDTO }
     *     
     */
    public RegisterDTO getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterDTO }
     *     
     */
    public void setFolio(RegisterDTO value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad employe.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDTO }
     *     
     */
    public EmployeeDTO getEmploye() {
        return employe;
    }

    /**
     * Define el valor de la propiedad employe.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDTO }
     *     
     */
    public void setEmploye(EmployeeDTO value) {
        this.employe = value;
    }

    /**
     * Obtiene el valor de la propiedad internalMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalMessage() {
        return internalMessage;
    }

    /**
     * Define el valor de la propiedad internalMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalMessage(String value) {
        this.internalMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setState(Boolean value) {
        this.state = value;
    }

}
