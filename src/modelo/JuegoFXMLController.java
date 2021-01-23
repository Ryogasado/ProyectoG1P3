
package modelo;

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
    Tablero tablero1 = new Tablero();
    HiloMazo hilo;
    @FXML
    private Button regresar;
    
    @FXML
    private Button Loteria;
    
    @FXML
    private Label Proceso;

    
    @FXML
    private GridPane TableroJugador;
    
    @FXML
    private ImageView mazoImagen;
    
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
        tablero1.llenarCartasAzar(TableroJugador); 
        hilo= new HiloMazo(mazoImagen,Proceso);
        hilo.start();
        
        aleatorios = tablero1.getCartasAzar();
        for(int x=0; x<4;x++){
            for(int y=0;y<4;y++){
                int id =aleatorios[x][y];
                
                StackPane cntBtnImg = new StackPane();
                Image imagen = Imagen.imagenausar(id);
                ImageView cntImagen = new ImageView(imagen);
                
                cntBtnImg.getChildren().add(cntImagen);
                
                
                gridJugador.setPadding(new Insets(15));
                gridJugador.add(cntBtnImg, y, x);
                cntImagen.setOnMouseClicked(e->{
                    if(id == hMazo.getNumero()){
                        cntImagen.setDisable(true);
                        tblJugador.getMatrizMapa().remove(id);
                        tblJugador.getMatrizMapa().put(id, 1);
                        ImageView cntBean = new ImageView(Imagen.Bean());
                        cntBtnImg.getChildren().add(cntBean);

                        
                        
                        
                        
                    }
                    else{
                        HiloWrongChoise wrong = new HiloWrongChoise(cntBtnImg);
                        wrong.start();
                    }
                });
    }    
    
    
}
