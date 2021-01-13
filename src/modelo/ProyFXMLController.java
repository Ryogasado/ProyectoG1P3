/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Favia Elizalde
 */
public class ProyFXMLController implements Initializable {
    
    private Configuracion configuracion;
    
    @FXML
    private Label loteria;
    @FXML
    private Label mexicana;
    @FXML
    private ImageView portada; 
    
    @FXML
    private void handleButtonAction (ActionEvent event){
    }
    
    @FXML private void accionnJuego(){
        configuracion= new Configuracion();
        
        
    }
    
    @FXML private void accionConfig(){
    }
    
    @FXML private void accionReporte(){
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
