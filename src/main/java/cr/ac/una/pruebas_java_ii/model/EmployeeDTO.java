package cr.ac.una.pruebas_java_ii.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


/**
 *
 * @author takkasama
 */
public class EmployeeDTO {
    
    private StringProperty id;
    private StringProperty name;
    private StringProperty lastName;
    private ObjectProperty<LocalDate> birthdate;
    private StringProperty idCard;
    
    private StringProperty folio;
    private BooleanProperty isAdministrator;
    private StringProperty password;
    
    private ObjectProperty<RegisterDTO> register;
    private List<MarkDTO> marks;

    private DoubleProperty hourValue;
    
    private byte[] avatar;
    private StringProperty avatarType;
    
    private Long version;

    public EmployeeDTO() {
        this.id= new SimpleStringProperty();
        this.name = new SimpleStringProperty();
        this.lastName = new SimpleStringProperty();
        this.birthdate = new SimpleObjectProperty<>();
        this.idCard = new SimpleStringProperty();

        this.folio = new SimpleStringProperty();
        this.isAdministrator = new SimpleBooleanProperty(false);
        this.password = new SimpleStringProperty();

        this.register = new SimpleObjectProperty<>();
        this.marks = new ArrayList<>();

        this.hourValue = new SimpleDoubleProperty(1000.0);
        this.avatarType = new SimpleStringProperty();
    
    }
    
    

    
    public Long getId() { 
        if(id.get() != null && !id.get().isBlank())
            return Long.valueOf(id.get());
        return null;
    }
    public void setId(String id) { this.id.set(id); }

    public String getName() { return name.get(); }
    public void setName(String name) { this.name.set(name); }

    public String getLastName() { return lastName.get(); }
    public void setLastName(String lastName) { this.lastName.set(lastName); }

    public LocalDate getBirthdate() { return birthdate.get(); }
    public void setBirthdate(LocalDate birthdate) { this.birthdate.set(birthdate); }

    public String getIdCard() { return idCard.get(); }
    public void setIdCard(String idCard) { this.idCard.set(idCard); }

    public boolean getIsAdministrator() { return isAdministrator.get(); }
    public void setIsAdministrator(boolean isAdministrator) { this.isAdministrator.set(isAdministrator); }

    public String getPassword() { return password.get(); }
    public void setPassword(String password) { this.password.set(password); }

    public String getFolio() { return folio.get(); }
    public void setFolio(String folio) { this.folio.set(folio); }

    public RegisterDTO getRegister() { return register.get(); }
    public void setRegister(RegisterDTO register) { this.register.set(register); }

    public List<MarkDTO> getMarks() { return marks; }
    public void setMarks(List<MarkDTO> marks) { this.marks = marks; }

    public double getHourValue() { return hourValue.get(); }
    public void setHourValue(double hourValue) { this.hourValue.set(hourValue); }

    public byte[] getAvatar() { return avatar; }
    public void setAvatar(byte[] avatar) { this.avatar = avatar; }

    public String getAvatarType() { return avatarType.get(); }
    public void setAvatarType(String avatarType) { this.avatarType.set(avatarType); }

    public Long getVersion() { return version; }
    public void setVersion(Long version) { this.version = version; }

    
    
    public StringProperty getIdProperty() { return id; }

    public StringProperty getNameProperty() { return name; }

    public StringProperty getLastNameProperty() { return lastName; }

    public ObjectProperty<LocalDate> getBirthdateProperty() { return birthdate; }

    public StringProperty getIdCardProperty() { return idCard; }

    public StringProperty getFolioProperty() { return folio; }

    public BooleanProperty getIsAdministratorProperty() { return isAdministrator; }

    public StringProperty getPasswordProperty() { return password; }

    public ObjectProperty<RegisterDTO> getRegisterProperty() { return register; }

    public ObservableList<MarkDTO> getMarksProperty() { return FXCollections.observableArrayList(marks); }

    public DoubleProperty getHourValueProperty() { return hourValue; }

    public StringProperty getAvatarTypeProperty() { return avatarType; }

    
}
