package cr.ac.una.pruebas_java_ii.model;

import java.time.LocalDateTime;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author takkasama
 */
public class MarkDTO {
 
    private StringProperty id;
    private ObjectProperty<LocalDateTime> entrance;
    private ObjectProperty<LocalDateTime> exit;
    
    private BooleanProperty inconsistent;
    private BooleanProperty dayShift;
    
    private ObjectProperty<EmployeeDTO> employee;
    
    private Long version;
    
    public MarkDTO(){
        this.id = new SimpleStringProperty();
        this.entrance = new SimpleObjectProperty<>(LocalDateTime.now());
        this.exit = new SimpleObjectProperty<>();
        this.inconsistent = new SimpleBooleanProperty(false);
        this.dayShift = new SimpleBooleanProperty(true);
        this.employee = new SimpleObjectProperty<>();   
        
    }



    
    public Long getId() { 
        if(id.get() != null && !id.get().isBlank())
            return Long.valueOf(id.get());
    
        return null; 
    }
    public void setId(String id) { this.id.set(id); }   
    
    public LocalDateTime getEntrance() { return entrance.get(); }
    public void setEntrance(LocalDateTime entrance) { this.entrance.set(entrance); }

    public LocalDateTime getExit() { return exit.get(); }
    public void setExit(LocalDateTime exit) { this.exit.set(exit); }

    public Boolean getInconsistent() { return inconsistent.get(); }
    public void setInconsistent(boolean inconsistent) { this.inconsistent.set(inconsistent); }

    public Boolean getDayShift() { return dayShift.get(); }
    public void setDayShift(Boolean dayShift) { this.dayShift.set(dayShift); }

    public Long getVersion() { return version; }
    public void setVersion(Long version) { this.version = version; }

    public EmployeeDTO getEmployee(){ return employee.get(); }
    public void setEmployee(EmployeeDTO employee) { this.employee.set(employee); }


    public ObjectProperty<LocalDateTime> getEntranceProperty() { return entrance; }

    public ObjectProperty<LocalDateTime> getExitProperty() { return exit; }

    public BooleanProperty getIsInconsistentProperty() { return inconsistent; }

    public BooleanProperty getIsDayShiftProperty() { return dayShift; }

    public ObjectProperty<EmployeeDTO> getEmployeeProperty(){ return employee; }    
}
