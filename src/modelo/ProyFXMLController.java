/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author Favia Elizalde
 */
public class ProyFXMLController implements Initializable  {
    //implements Initializable 
     
    @FXML
    private Label loteria;
    @FXML
    private Label mexicana;
    @FXML
    private ImageView portada; 
    @FXML
    private Button nJuego;
    @FXML
    private Button Reporte;
    @FXML
    private Button Config;
    
    public void accionConfig() throws Exception{
        Parent root1= FXMLLoader.load(getClass().getResource("ConfiguracionFXML.fxml"));
        Scene ventanaC= new Scene(root1);
        Stage window= (Stage) Config.getScene().getWindow();
        window.setScene(ventanaC);
    }
    public void accionnJuego() throws Exception{
        Parent root2= FXMLLoader.load(getClass().getResource("JuegoFXML.fxml"));
        Scene ventanaJ= new Scene(root2);
        Stage window= (Stage) nJuego.getScene().getWindow();
        window.setScene(ventanaJ);
    }
    public void accionReporte() throws Exception{
        Parent root3= FXMLLoader.load(getClass().getResource("ReporteFXML.fxml"));
        Scene ventanaR= new Scene(root3);
        Stage window= (Stage) Reporte.getScene().getWindow();
        window.setScene(ventanaR);
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
   
     
    
    

