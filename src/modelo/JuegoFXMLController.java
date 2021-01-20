
package modelo;

import Hilos.HiloMazo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Favia Elizalde
 * 
 */
public class JuegoFXMLController implements Initializable {
    Tablero tablero1 = new Tablero();
    HiloMazo hilo;
    @FXML
    private Button regresar;
    
    @FXML
    private Button Loteria;

    
    @FXML
    private GridPane TableroJugador;
    
    @FXML
    private ImageView mazoImagen;
    
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
        tablero1.llenarCartasAzar(TableroJugador); 
        hilo= new HiloMazo(mazoImagen);
        hilo.start();
    }    
    
}
