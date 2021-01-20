/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Favia Elizalde
 */
public class ReporteFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button regresar;
    
    @FXML
    void accionRegresar() throws Exception{
        Parent root1= FXMLLoader.load(getClass().getResource("ProyFXML.fxml"));
        Scene ventanaC= new Scene(root1);
        Stage window= (Stage) regresar.getScene().getWindow();
        window.setScene(ventanaC);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
