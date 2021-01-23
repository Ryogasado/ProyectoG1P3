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
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
    
    
            
    //BOTON PARA REGRESAR
    void accionRegresar() throws Exception{
        Parent root1= FXMLLoader.load(getClass().getResource("ProyFXML.fxml"));
        Scene ventanaC= new Scene(root1);
        Stage window= (Stage) regresar.getScene().getWindow();
        window.setScene(ventanaC);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rTableView = new TableView();
        String[] datos = {"Fecha", "Duracion", "Nombre del usuario", "Cantidad de Oponentes", "Alineacion" };
        for (String campo: datos){
           TableColumn<String, Jugador> column = new TableColumn<> (campo);
           column.setCellValueFactory(new PropertyValueFactory<>(campo.toLowerCase()));
           column.prefWidthProperty().bind(rTableView.widthProperty().divide(5));
           rTableView.getColumns().add(column);
        }
       //Agregar datos al tableView
        for (Jugador j: jugadores){
           rTableView.getItems().add(j); 
        }
        cargarJugadores();
        // TODO
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
    public void actualizarArchivoJugadores() {
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
