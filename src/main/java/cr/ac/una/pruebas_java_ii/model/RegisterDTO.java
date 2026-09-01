package cr.ac.una.pruebas_java_ii.model;

import java.util.List;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author takkasama
 */
public class RegisterDTO {
    
    private StringProperty id;
    private StringProperty description;
    private List<EmployeeDTO> employeeList;
    private Long version;

    public RegisterDTO() {
    }

    
    public Long getId() {
        if(id.get() != null && !id.get().isBlank())
            return Long.valueOf(id.get());
        return null;
    }
    public void setId(String id){ this.id.set(id); }

    public String getDescription() { return description.get(); }
    public void setDescription(String description) { this.description.set(description); }

    public List<EmployeeDTO> getEmployeeList() { return employeeList; }
    public void setEmployeeList(List<EmployeeDTO> employeeList) { this.employeeList = employeeList; }

    public Long getVersion() { return version; }
    public void setVersion(Long version) { this.version = version; }
    
    
    public StringProperty getIdProperty() { return id; }

    public StringProperty getDescriptionProperty() { return description; }

    public ObservableList<EmployeeDTO> getEmployeeListProperty() { return FXCollections.observableArrayList(employeeList); }    
}
