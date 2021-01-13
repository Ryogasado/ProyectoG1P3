/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Favia Elizalde
 */

public class ProyFXMain extends Application{
    
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

/*public class ProyFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        
        //Botones
        Button nJuego = new Button();
        Button Config = new Button();
        Button Reporte = new Button();
        
        //        
        nJuego.setText("Nuevo Juego");
        nJuego.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Nuevo Juego");
            }
        });
        
        Reporte.setText("Reporte");
        Reporte.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Reporte");
            }
        });
        
        Config.setText("Configuraciones");
        Config.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Configuraciones");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(nJuego);
        root.getChildren().add(Config);
        root.getChildren().add(Reporte);
        
        Scene scene = new Scene(root, 600, 550);
        
        primaryStage.setTitle("LOTERIA MEXICANA");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
        /*
    public static void main(String[] args) {
        launch(args);
    }
    
}*/
