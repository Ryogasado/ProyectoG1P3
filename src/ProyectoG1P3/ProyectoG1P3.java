/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoG1P3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/*import java.io.*;
import java.util.*;
import java.lang.*;
import Enums.*;
import modelo.*;*/

/**
 *
 * @author Carlos Molineros
 */
public class ProyectoG1P3 extends Application{
    
    @Override
    public void start(Stage stage) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("ProyFXML.fxml"));
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
