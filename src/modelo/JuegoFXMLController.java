
package modelo;

import Enums.Alineacion;
import Hilos.HiloComp;
import Hilos.HiloMazo;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Favia Elizalde
 * 
 */
public class JuegoFXMLController implements Initializable {
    private Alineacion alinea;
    Juego juego;
    Tablero tablero1 = new Tablero();
    Tablero tablero2 = new Tablero();
    Tablero tablero3 = new Tablero();
    HiloMazo hilo;
    //BOTONES
    @FXML
    private Button regresar;
    
    @FXML
    private Button Loteria;
    //ETIQUETAS
    @FXML
    private Label Proceso;
    
     @FXML
    private Label labelAlineacion;

    //GRIDPANES
    @FXML
    private GridPane TableroJugador;
    
     @FXML
    private GridPane TableroOp1;

    @FXML
    private GridPane TableroOp2;
    @FXML
    private ImageView mazoImagen;
    //IMAGE VIEW
    @FXML
    private ImageView Frejol;
    
    @FXML
    void accionRegresar() throws Exception{
        Parent root1= FXMLLoader.load(getClass().getResource("ProyFXML.fxml"));
        Scene ventanaC= new Scene(root1);
        Stage window= (Stage) regresar.getScene().getWindow();
        window.setScene(ventanaC);
    }
    
    @FXML
    void accionLoteria(ActionEvent event) throws Exception {
        
    }
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        // Inicializa el tablero
        //Crear Juego y del Juego obtener el tabler, el mazo y todo
        juego=new Juego();
        alinea= Alineacion.getRandomTipo();
        if(Juego.cantOpn==2){
           labelAlineacion= new Label("La alineacion es:"+alinea);
           hilo= new HiloMazo(mazoImagen);
           hilo.start();
           tablero1.llenarCartasAzar(TableroJugador,hilo);
           tablero2.llenarCartasAzar(TableroOp1,hilo);
           tablero3.llenarCartasAzar(TableroOp2,hilo);
           HiloComp hOp1= new HiloComp(TableroOp1,hilo,alinea);
           hOp1.start();
           HiloComp hOp2= new HiloComp(TableroOp2,hilo,alinea);
           hOp2.start();
           
        }
        else{
          labelAlineacion= new Label("La alineacion es:"+alinea);
          hilo= new HiloMazo(mazoImagen);
          hilo.start();
          tablero1.llenarCartasAzar(TableroJugador, hilo);
          tablero2.llenarCartasAzar(TableroOp1, hilo);
          HiloComp hOp1= new HiloComp(TableroOp1,hilo,alinea);
          hOp1.start();
        }
        //juego.getTablero().llenarCartasAzar(TableroJugador);
        
        
        
    }    
    
    
}
