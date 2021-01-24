package modelo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import Hilos.*;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Favia Elizalde
 */
public class Tablero {
    private ArrayList<CartaJuego> cartas;
    private ArrayList<Integer> listaNumCartas = new ArrayList<>();
    int n =0;
    
    public Tablero(){
        cartas= new ArrayList<CartaJuego>();
        
        for(int i=1 ;i<=54;i++){
            listaNumCartas.add(i);
        }
        for(int j: listaNumCartas){
            Carta nueva = new Carta(j);  
        }
    }
    
    public void llenarCartasAzar(GridPane grid, HiloMazo hilo){
        try{
            
            Image img1 = null;
            Collections.shuffle(listaNumCartas);
            
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    //int n = 0;
                    StackPane cntBtnImg = new StackPane();
                    img1 = new Image(new FileInputStream("src/imagenes/"+listaNumCartas.get(n)+".png"),60,60,true,true);
                    ImageView img = new ImageView(img1);
                    cntBtnImg.getChildren().add(img);
                    grid.add(cntBtnImg,i,j);
                    //Accion al clickear la imagen
                    img.setOnMouseClicked(e->{
                        if(n == hilo.getNumero()){
                        img.setDisable(true);
                        
                        ImageView cntBean = new ImageView(Juego.Bean());
                        cntBtnImg.getChildren().add(cntBean);   
                        
                        }
                        else{
                        HiloX wrong = new HiloX(cntBtnImg);
                        wrong.start();
                        }
                    });
                    //Crear CartaJuego
                    int numeroCarta= listaNumCartas.get(n);
                    Carta cartaNueva= new Carta(numeroCarta);
                    CartaJuego cN= new CartaJuego(cartaNueva,false);
                    cartas.add(cN);                    
                    n++;
                }
            }
        }catch(FileNotFoundException ex){
            System.out.println("No se encontro la imagen");
        }
    }
    
    public ArrayList<CartaJuego> getCartasJuego(){
        return cartas;
    }
    
    public void compararCartas(ArrayList<Carta> cementerio, ImageView imagen){
        
        for(CartaJuego c: cartas){
            Carta cN= c.getCarta();
            int numeroCarta= cN.getNumero();
            for(Carta u: cementerio){
                int numC= u.getNumero();
                if(numeroCarta==numC){
                    c.setMarcada(true);
                    //agregar frejol
                    //StackPane
                    Image imagenF= Juego.Bean();
                    
                }else{
                    //salir la X
                    Image imagenW= Juego.WrongX();
                    
                }
            }  
        }
    }
      
    
    
    
}