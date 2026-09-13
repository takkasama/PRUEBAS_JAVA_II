/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.pruebas_java_ii.controller;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author takkasama
 */
public class EmployeeController extends Controller implements Initializable {

    @FXML
    private MFXTextField txtName;
    @FXML
    private MFXTextField txtLastName;
    @FXML
    private MFXButton btnSave;
    @FXML
    private MFXButton btnClear;
    @FXML
    private MFXButton btnDelete;
    @FXML
    private Label lblStatus;
    @FXML
    private MFXButton btnRefresh;
    @FXML
    private ListView<?> lvEmployees;
    @FXML
    private Label lblTotalEmployees;
    @FXML
    private MFXTextField txtEmployeeReport;
    @FXML
    private MFXTextField txtStartDate;
    @FXML
    private MFXTextField txtEndDate;
    @FXML
    private MFXButton btnReportJRPrint;
    @FXML
    private MFXButton btnReportPDF;
    @FXML
    private MFXButton btnReportExcel;
    @FXML
    private MFXButton btnPreviewReport;
    @FXML
    private MFXButton btnGenerateAll;
    @FXML
    private Label lblReportStatus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onActionSave(ActionEvent event) {
    }

    @FXML
    private void onActionClear(ActionEvent event) {
    }

    @FXML
    private void onActionDelete(ActionEvent event) {
    }

    @FXML
    private void onActionRefresh(ActionEvent event) {
    }

    @FXML
    private void onActionGenerateJRPrint(ActionEvent event) {
    }

    @FXML
    private void onActionGeneratePDF(ActionEvent event) {
    }

    @FXML
    private void onActionGenerateExcel(ActionEvent event) {
    }

    @FXML
    private void onActionPreviewReport(ActionEvent event) {
    }

    @FXML
    private void onActionGenerateAll(ActionEvent event) {
    }

    @Override
    public void initialize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
