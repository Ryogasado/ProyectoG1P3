/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Favia Elizalde
 */
public class ConfiguracionFXMLController implements Initializable{
    
    @FXML
    private ChoiceBox<String> oponentes;
    @FXML
    private ChoiceBox<String> visibilidad; 
    @FXML
    private Button btnAceptar;
    @FXML
    private Label visibCartas;
    @FXML
    private Label escogerOp;
    @FXML
    private Button regresar;
    
    @FXML
    void accionRegresar() throws Exception{
        Parent root1= FXMLLoader.load(getClass().getResource("ProyFXML.fxml"));
        Scene ventanaC= new Scene(root1);
        Stage window= (Stage) regresar.getScene().getWindow();
        window.setScene(ventanaC);
    }
    
    
    @FXML
    void accionAceptar(ActionEvent event) throws Exception {

    }

    @FXML
    void clickOponentes(MouseEvent event) throws Exception {
        String numO= oponentes.getSelectionModel().getSelectedItem().toString();
        
    }

    @FXML
    void clickVisibilidad(MouseEvent event) throws Exception{
        String vis= visibilidad.getSelectionModel().getSelectedItem().toString();    
    }


    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> listO= FXCollections.observableArrayList("1","2");
        oponentes.setItems(listO);
        ObservableList<String> listV= FXCollections.observableArrayList("Si","No");
        visibilidad.setItems(listV);
 
    }
    
}
