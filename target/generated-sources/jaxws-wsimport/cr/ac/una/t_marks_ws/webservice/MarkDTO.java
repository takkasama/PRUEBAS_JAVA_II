
package cr.ac.una.t_marks_ws.webservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para markDTO complex type.&lt;/p&gt;
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="markDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dayShift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="employee" type="{http://webservice.t_marks_ws.una.ac.cr/}employeeDTO" minOccurs="0"/&gt;
 *         &lt;element name="entrance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="inconsistent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "markDTO", propOrder = {
    "dayShift",
    "employee",
    "entrance",
    "exit",
    "id",
    "inconsistent",
    "version"
})
public class MarkDTO {

    protected Boolean dayShift;
    protected EmployeeDTO employee;
    protected String entrance;
    protected String exit;
    protected Long id;
    protected Boolean inconsistent;
    protected Long version;

    /**
     * Obtiene el valor de la propiedad dayShift.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayShift() {
        return dayShift;
    }

    /**
     * Define el valor de la propiedad dayShift.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayShift(Boolean value) {
        this.dayShift = value;
    }

    /**
     * Obtiene el valor de la propiedad employee.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDTO }
     *     
     */
    public EmployeeDTO getEmployee() {
        return employee;
    }

    /**
     * Define el valor de la propiedad employee.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDTO }
     *     
     */
    public void setEmployee(EmployeeDTO value) {
        this.employee = value;
    }

    /**
     * Obtiene el valor de la propiedad entrance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrance() {
        return entrance;
    }

    /**
     * Define el valor de la propiedad entrance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrance(String value) {
        this.entrance = value;
    }

    /**
     * Obtiene el valor de la propiedad exit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExit() {
        return exit;
    }

    /**
     * Define el valor de la propiedad exit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExit(String value) {
        this.exit = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad inconsistent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInconsistent() {
        return inconsistent;
    }

    /**
     * Define el valor de la propiedad inconsistent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInconsistent(Boolean value) {
        this.inconsistent = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

}
