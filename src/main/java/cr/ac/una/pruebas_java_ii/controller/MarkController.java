package cr.ac.una.pruebas_java_ii.controller;

import cr.ac.una.pruebas_java_ii.model.EmployeeDTO;
import cr.ac.una.pruebas_java_ii.model.MarkDTO;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXToggleButton;



import java.net.URL;
import java.util.ResourceBundle;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author takkasama
 */
public class MarkController extends Controller implements Initializable {


    @FXML
    private MFXTextField txtEmployeeId;
    @FXML
    private MFXButton btnSearchEmployee;
    @FXML
    private MFXButton btnClearSearch;
    @FXML
    private MFXButton btnRefreshMarks;
    @FXML
    private Label lblEmployeeName;
    @FXML
    private Label lblEmployeeId;
    @FXML
    private Label lblEmployeeStatus;
    @FXML
    private Label lblTotalMarks;
    @FXML
    private TableView<MarkDTO> tbMarks;
    @FXML
    private TableColumn<MarkDTO, String> colId;
    @FXML
    private TableColumn<MarkDTO, String> colEntry;
    @FXML
    private TableColumn<MarkDTO, String> colExit;
    @FXML
    private TableColumn<MarkDTO, String> colShift;
    @FXML
    private TableColumn<MarkDTO, String> colInconsistent;
    @FXML
    private Label lblTotalInconsistent;
    @FXML
    private Label lblStatus;
    @FXML
    private MFXButton btnExportJRPrint;
    @FXML
    private MFXButton btnExportPDF;
    @FXML
    private MFXButton btnExportExcel;

    
    private EmployeeDTO employee;
    
    private ObservableList<MarkDTO> marksObservalble;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @Override
    public void initialize() {
        setNombreVista("Tester De Creacion de Marcas");
        getStage().setResizable(false);
    }

    @FXML
    private void onActionSearchEmployee(ActionEvent event) {
    }

    @FXML
    private void onActionClearSearch(ActionEvent event) {
    }

    @FXML
    private void onActionRefreshMarks(ActionEvent event) {
    }

    @FXML
    private void onActionExportJRPrint(ActionEvent event) {
    }

    @FXML
    private void onActionExportPDF(ActionEvent event) {
    }

    @FXML
    private void onActionExportExcel(ActionEvent event) {
    }

    
    private class ButtonCell extends Table
    

}
