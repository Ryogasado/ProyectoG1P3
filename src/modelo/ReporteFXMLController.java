/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
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
    ArrayList<Jugador> jugadores;
    String filename = "jugadores.csv";
    TableView rTableView;
    @FXML
    private Button regresar;
    java.util.Date date = new Date();
    
    
            
    //BOTON PARA REGRESAR
    @FXML
    void accionRegresar(ActionEvent event) throws Exception {
        Parent root1= FXMLLoader.load(getClass().getResource("ProyFXML.fxml"));
        Scene ventanaC= new Scene(root1);
        Stage window= (Stage) regresar.getScene().getWindow();
        window.setScene(ventanaC);
    }
    /*
    void accionRegresar()throws Exception{
        Parent root1= FXMLLoader.load(getClass().getResource("ProyFXML.fxml"));
        Scene ventanaC= new Scene(root1);
        Stage window= (Stage) regresar.getScene().getWindow();
        window.setScene(ventanaC);
        
    }
    */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TableColumn fechaC= new TableColumn("Fecha");
        TableColumn duraC= new TableColumn("Duracion");
        TableColumn usuarioC= new TableColumn("Usuario");
        TableColumn cantOpC= new TableColumn("Cantidad de Oponentes");
        TableColumn alineacionC= new TableColumn("Alineacion");
        rTableView.getColumns().addAll(fechaC,duraC, usuarioC, cantOpC, alineacionC);
        
        ObservableList<Reporte> data= FXCollections.observableArrayList(
            //crear nuevo repore
        );
        
        fechaC.setCellValueFactory(new PropertyValueFactory<Reporte,String>("Fecha"));
        duraC.setCellValueFactory(new PropertyValueFactory<Reporte,String>("Duracion"));
        usuarioC.setCellValueFactory(new PropertyValueFactory<Reporte,String>("Usuario"));
        cantOpC.setCellValueFactory(new PropertyValueFactory<Reporte,String>("Cantidad de Oponentes"));
        alineacionC.setCellValueFactory(new PropertyValueFactory<Reporte,String>("Alineacion"));
        
        rTableView.setItems(data);
    }
    //METODO PARA CARGAR JUGADORES AL TABLE VIEW
    private void cargarJugadores(){
       jugadores = new ArrayList<>();
       Path path =Paths.get(filename);
       if (Files.exists(path)){
           ObjectInputStream in =null;
            try {
                in= new ObjectInputStream(new FileInputStream(filename));
                jugadores =(ArrayList<Jugador>)in.readObject();
                in.close();
            } catch (FileNotFoundException ex ) {
                System.out.println(ex.getMessage());
            } catch(IOException ex ){
                System.out.println(ex.getMessage());
            } catch(ClassNotFoundException ex){
                System.out.println(ex.getMessage());
            }
       }
       System.out.println(jugadores);
   }

   //METODO PARA ACTUALIZAR LOS JUGADORES AL TABLE VIEW
    
    public void actualizarArchivoJugadores() throws Exception{
        FileOutputStream fout =null;
        try {
            fout =new FileOutputStream(filename);
            ObjectOutput out= new ObjectOutputStream(fout);
            out.writeObject(jugadores);
            out.flush();
        
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
        
            }catch(IOException ex){
                System.out.println(ex.getMessage());

            }finally{
                try {
                    fout.close();
                 } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
    
            }
       
    }
    
}
