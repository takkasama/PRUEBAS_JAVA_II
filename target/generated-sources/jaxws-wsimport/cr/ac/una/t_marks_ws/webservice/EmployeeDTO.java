
package cr.ac.una.t_marks_ws.webservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para employeeDTO complex type.&lt;/p&gt;
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="employeeDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="avatar" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="avatarType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hourValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isAdministrator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marks" type="{http://webservice.t_marks_ws.una.ac.cr/}markDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="register" type="{http://webservice.t_marks_ws.una.ac.cr/}registerDTO" minOccurs="0"/&gt;
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
@XmlType(name = "employeeDTO", propOrder = {
    "avatar",
    "avatarType",
    "birthdate",
    "folio",
    "hourValue",
    "id",
    "idCard",
    "isAdministrator",
    "lastName",
    "marks",
    "name",
    "password",
    "register",
    "version"
})
public class EmployeeDTO {

    protected byte[] avatar;
    protected String avatarType;
    protected String birthdate;
    protected String folio;
    protected Double hourValue;
    protected Long id;
    protected String idCard;
    protected Boolean isAdministrator;
    protected String lastName;
    @XmlElement(nillable = true)
    protected List<MarkDTO> marks;
    protected String name;
    protected String password;
    protected RegisterDTO register;
    protected Long version;

    /**
     * Obtiene el valor de la propiedad avatar.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAvatar() {
        return avatar;
    }

    /**
     * Define el valor de la propiedad avatar.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAvatar(byte[] value) {
        this.avatar = value;
    }

    /**
     * Obtiene el valor de la propiedad avatarType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvatarType() {
        return avatarType;
    }

    /**
     * Define el valor de la propiedad avatarType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvatarType(String value) {
        this.avatarType = value;
    }

    /**
     * Obtiene el valor de la propiedad birthdate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Define el valor de la propiedad birthdate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdate(String value) {
        this.birthdate = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad hourValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHourValue() {
        return hourValue;
    }

    /**
     * Define el valor de la propiedad hourValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHourValue(Double value) {
        this.hourValue = value;
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
     * Obtiene el valor de la propiedad idCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * Define el valor de la propiedad idCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCard(String value) {
        this.idCard = value;
    }

    /**
     * Obtiene el valor de la propiedad isAdministrator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdministrator() {
        return isAdministrator;
    }

    /**
     * Define el valor de la propiedad isAdministrator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdministrator(Boolean value) {
        this.isAdministrator = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the marks property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the marks property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkDTO }
     * </p>
     * 
     * 
     * @return
     *     The value of the marks property.
     */
    public List<MarkDTO> getMarks() {
        if (marks == null) {
            marks = new ArrayList<>();
        }
        return this.marks;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad register.
     * 
     * @return
     *     possible object is
     *     {@link RegisterDTO }
     *     
     */
    public RegisterDTO getRegister() {
        return register;
    }

    /**
     * Define el valor de la propiedad register.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterDTO }
     *     
     */
    public void setRegister(RegisterDTO value) {
        this.register = value;
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
