/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Favia Elizalde
 */
public class ConfiguracionFXMLController implements Initializable{
    ObservableList list= FXCollections.observableArrayList();
    ObservableList list2= FXCollections.observableArrayList();
    
    @FXML
    private ChoiceBox<?> oponentes;
    @FXML
    private ChoiceBox<?> visibilidad; 
    @FXML
    private Button btnAceptar;
    @FXML
    private Label visibCartas;
    @FXML
    private Label escogerOp;
    
    @FXML
    void accionAceptar(ActionEvent event) throws Exception {

    }

    @FXML
    void clickOponentes(MouseEvent event) throws Exception {
        list2.removeAll(list2);
        String uno= "1";
        String dos= "2";
        list2.addAll(uno,dos);
        oponentes.getItems().addAll(list2);
    }

    @FXML
    void clickVisibilidad(MouseEvent event) throws Exception{
        list.removeAll(list);
        String si= "Si";
        String no= "No";
        list.addAll(si,no);
        visibilidad.getItems().addAll(list); 
    }
   

  

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      
    }
    
}
