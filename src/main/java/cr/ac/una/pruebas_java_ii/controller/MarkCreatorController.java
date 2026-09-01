/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.pruebas_java_ii.controller;

import cr.ac.una.pruebas_java_ii.model.EmployeeDTO;
import cr.ac.una.pruebas_java_ii.model.MarkDTO;
import cr.ac.una.pruebas_java_ii.util.Mensaje;
import cr.ac.una.pruebas_java_ii.util.Respuesta;

import cr.ac.una.pruebas_java_ii.service.EmployeeService;
import cr.ac.una.pruebas_java_ii.service.MarkService;


import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXToggleButton;



import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import cr.ac.una.pruebas_java_ii.service.EmployeeService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author takkasama
 */
public class MarkCreatorController extends Controller implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private MFXButton btnEntrance;
    @FXML
    private MFXButton btnExit;
    @FXML
    private MFXToggleButton tglIncosistent;
    @FXML
    private MFXToggleButton tglShiftDay;
    @FXML
    private MFXButton btnSave;
    @FXML
    private ListView<MarkDTO> tbMarks;

    private EmployeeDTO employee;

    


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadView();
    }    

    @Override
    public void initialize() {
        setNombreVista("Tester De Creacion de Marcas");
        getStage().setResizable(false);
    }

    @FXML
    private void onActionBtnEntrance(ActionEvent event) {
        try {
            MarkDTO mark = new MarkDTO();
            mark.setEntrance(LocalDateTime.now());
            mark.setInconsistent(tglIncosistent.isSelected());
            mark.setDayShift(tglShiftDay.isSelected());
            mark.setEmployee(employee);
            employee.getMarks().add(mark);
            
            MarkService markService = new MarkService();
            Respuesta res = markService.saveMark(mark);

            if(!res.getEstado()){
                new Mensaje().showModal(Alert.AlertType.ERROR, "Error to save the mark", getStage(), "onActionBtnEntrance");
                return;
            }
            mark = (MarkDTO) res.getResultado("Mark");
            employee.getMarks().add(mark);
            loadView();

        } catch (Exception e) {
            Logger.getLogger(MarkCreatorController.class.getName()).log(Level.SEVERE, "Error to save the mark", e);
            new Mensaje().showModal(Alert.AlertType.ERROR, "Error to save the mark", getStage(), "onActionBtnEntrance");
        }
    }

    @FXML
    private void onActionBtnExit(ActionEvent event) {

    }

    @FXML
    private void onActionBtnSave(ActionEvent event) {
    }
    
    private void loadView(){
        tbMarks.setItems(employee.getMarksProperty());
        tbMarks.setCellFactory((p) -> new ButtonCell());

        //Empleoado Temporal para pruebas
        try{
            EmployeeService employeeService = new EmployeeService();
            Long id = 8L;
            Respuesta res = employeeService.getEmployee(id);
            if(res.getEstado())
                this.employee = (EmployeeDTO) res.getResultado("Employee");
            else 
                new Mensaje().showModal(Alert.AlertType.ERROR, "ERROR TO LOAD THE EMPLPYEE TO TEST DE MARK REGISTER", getStage(), 
                        "loadView");
            
    
        } catch(Exception e){
            Logger.getLogger(MarkCreatorController.class.getName()).log(Level.SEVERE, "Error to remove the mark", e);
            new Mensaje().showModal(Alert.AlertType.ERROR, "RemoveMark", getStage(), "Error to remove the mark");
        }
    }

    private boolean removeMark(MarkDTO mark){
        try{
            if(mark.getId() == null){
                new Mensaje().showModal(Alert.AlertType.ERROR, "Error to remove the mark", getStage(), "removeMark");
                return false;
            }
            MarkService markService = new MarkService(); 

            Respuesta res = markService.deleteMark(mark.getId());
            
            if(res.getEstado()){
                new Mensaje().showModal(Alert.AlertType.INFORMATION, "The mark has been deleted", getStage(), "removeMark");
                return true;
            }
           
        }
        catch(Exception e){
            Logger.getLogger(MarkCreatorController.class.getName()).log(Level.SEVERE, "Error to remove the mark", e);
            new Mensaje().showModal(Alert.AlertType.ERROR, "RemoveMark", getStage(), "Error to remove the mark");
        }

        return false;
    }


    
  private class ButtonCell extends ListCell<MarkDTO> {

        final Button cellButton = new Button();
        final Label label = new Label();               
        final VBox vBox = new VBox(10);               

        public ButtonCell() {
           
            vBox.setAlignment(Pos.CENTER);
            vBox.getChildren().addAll(label, cellButton);
            vBox.getStyleClass().add("jfx-title-label-4");
            
            vBox.setPadding(new Insets(30));
            
            cellButton.setPrefWidth(72);
            cellButton.getStyleClass().add("jfx-cBTrash");
            cellButton.setOnAction((t) -> {
                if(!new Mensaje().showConfirmation("RemoveMark", getStage(), "Are you Shure?")) return;
                MarkDTO mark = ButtonCell.this.getListView().getItems().get(ButtonCell.this.getIndex());

                if(removeMark(mark)){
                    employee.getMarks().remove(mark);
                    employee.getMarksProperty().remove(mark);

                    ButtonCell.this.getListView().getItems().remove(mark);                      
                }
            });
            
        }
            @Override
             protected void updateItem(MarkDTO mark, boolean empty) {      
                 super.updateItem(mark, empty);
                 
                 if(empty || mark == null){
                     setText(null);
                     setGraphic(null);
                 }
                 
                 else{
                     String entrance = "Entrance : " + mark.getEntrance().toString().toUpperCase();
     
                     String exit = mark.getExit() != null ? "Exit : " + mark.getExit().toString().toUpperCase() : "";

                     String shift = mark.getDayShift() != null && mark.getDayShift() ? "Shift : Day" : "Shift : Night";

                     String incosistent = mark.getInconsistent() != null && mark.getInconsistent() ?  "I" : "";

                     String text = entrance + "\n" + exit + "\n" + shift + "\n" + incosistent;
                     
                     label.setText(text);

                     setGraphic(vBox);
                 }
             }
    
    }

    
}
