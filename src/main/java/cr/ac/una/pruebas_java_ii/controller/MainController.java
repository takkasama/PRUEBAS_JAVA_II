/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.pruebas_java_ii.controller;

import cr.ac.una.pruebas_java_ii.util.FlowController;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXToggleButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author takkasama
 */
public class MainController extends Controller implements Initializable{

    @FXML
    private MFXButton btnEmployees;
    @FXML
    private MFXButton btnMarks;
    @FXML
    private MFXButton btnCreateMark;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void initialize() {
    }

    @FXML
    private void onActionEmployees(ActionEvent event) {
    }

    @FXML
    private void onActionMarks(ActionEvent event) {
        FlowController.getInstance().goViewInStage("markView", getStage());
    }

    @FXML
    private void onActionBtnCreateMark(ActionEvent event) {
        FlowController.getInstance().goViewInStage("MarkCreatorView", getStage());
    }
    
    
    
    
}
