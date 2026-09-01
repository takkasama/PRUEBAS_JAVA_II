
package cr.ac.una.t_marks_ws.webservice;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cr.ac.una.t_marks_ws.webservice package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _DeleteMark_QNAME = new QName("http://webservice.t_marks_ws.una.ac.cr/", "deleteMark");
    private static final QName _DeleteMarkResponse_QNAME = new QName("http://webservice.t_marks_ws.una.ac.cr/", "deleteMarkResponse");
    private static final QName _SaveMark_QNAME = new QName("http://webservice.t_marks_ws.una.ac.cr/", "saveMark");
    private static final QName _SaveMarkResponse_QNAME = new QName("http://webservice.t_marks_ws.una.ac.cr/", "saveMarkResponse");
    private static final QName _Wrapper_QNAME = new QName("http://webservice.t_marks_ws.una.ac.cr/", "wrapper");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cr.ac.una.t_marks_ws.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteMark }
     * 
     * @return
     *     the new instance of {@link DeleteMark }
     */
    public DeleteMark createDeleteMark() {
        return new DeleteMark();
    }

    /**
     * Create an instance of {@link DeleteMarkResponse }
     * 
     * @return
     *     the new instance of {@link DeleteMarkResponse }
     */
    public DeleteMarkResponse createDeleteMarkResponse() {
        return new DeleteMarkResponse();
    }

    /**
     * Create an instance of {@link SaveMark }
     * 
     * @return
     *     the new instance of {@link SaveMark }
     */
    public SaveMark createSaveMark() {
        return new SaveMark();
    }

    /**
     * Create an instance of {@link SaveMarkResponse }
     * 
     * @return
     *     the new instance of {@link SaveMarkResponse }
     */
    public SaveMarkResponse createSaveMarkResponse() {
        return new SaveMarkResponse();
    }

    /**
     * Create an instance of {@link Wrapper }
     * 
     * @return
     *     the new instance of {@link Wrapper }
     */
    public Wrapper createWrapper() {
        return new Wrapper();
    }

    /**
     * Create an instance of {@link MarkDTO }
     * 
     * @return
     *     the new instance of {@link MarkDTO }
     */
    public MarkDTO createMarkDTO() {
        return new MarkDTO();
    }

    /**
     * Create an instance of {@link EmployeeDTO }
     * 
     * @return
     *     the new instance of {@link EmployeeDTO }
     */
    public EmployeeDTO createEmployeeDTO() {
        return new EmployeeDTO();
    }

    /**
     * Create an instance of {@link RegisterDTO }
     * 
     * @return
     *     the new instance of {@link RegisterDTO }
     */
    public RegisterDTO createRegisterDTO() {
        return new RegisterDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMark }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteMark }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.t_marks_ws.una.ac.cr/", name = "deleteMark")
    public JAXBElement<DeleteMark> createDeleteMark(DeleteMark value) {
        return new JAXBElement<>(_DeleteMark_QNAME, DeleteMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMarkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteMarkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.t_marks_ws.una.ac.cr/", name = "deleteMarkResponse")
    public JAXBElement<DeleteMarkResponse> createDeleteMarkResponse(DeleteMarkResponse value) {
        return new JAXBElement<>(_DeleteMarkResponse_QNAME, DeleteMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveMark }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveMark }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.t_marks_ws.una.ac.cr/", name = "saveMark")
    public JAXBElement<SaveMark> createSaveMark(SaveMark value) {
        return new JAXBElement<>(_SaveMark_QNAME, SaveMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveMarkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveMarkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.t_marks_ws.una.ac.cr/", name = "saveMarkResponse")
    public JAXBElement<SaveMarkResponse> createSaveMarkResponse(SaveMarkResponse value) {
        return new JAXBElement<>(_SaveMarkResponse_QNAME, SaveMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Wrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Wrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.t_marks_ws.una.ac.cr/", name = "wrapper")
    public JAXBElement<Wrapper> createWrapper(Wrapper value) {
        return new JAXBElement<>(_Wrapper_QNAME, Wrapper.class, null, value);
    }

}
