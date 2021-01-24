/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import Enums.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;


/**
 *
 * @author Favia Elizalde
 */
public class Juego {
    private String fecha;
    private int duracion;
    private Jugador ganador;
    private ArrayList<Jugador> jugadores;
    private Configuracion configuracion;
    private Mazo mazo;
    private ArrayList<Carta> cartasJugadas;
    private Alineacion alineacion;
    private Tablero tableroJugador;
    private Alineacion alinea;
    public static int cantOpn=1;
    
    
    Scanner sc= new Scanner(System.in);
    
    public Juego(){
        alinea= Alineacion.getRandomTipo();
        System.out.println("Nombre del Jugador: ");
        String nombre=sc.nextLine();
        ganador= new Jugador(nombre);
        cartasJugadas= new ArrayList<Carta>();
        jugadores= new ArrayList<Jugador>();
        mazo= new Mazo(); 
        tableroJugador= new Tablero();
    }
    
    public static Image Bean(){
        Image img1 = null;
        try {
            int ancho=50;
            int largo=50;
            img1 = new Image(new FileInputStream("src/imagenes/frijo1.png"),ancho,largo,true,true);
                    } 
        catch (FileNotFoundException ex) {
            System.out.println("No se encontro la imagen");;
        }
        return img1;
    }
    
    public static Image WrongX(){
        Image img1 = null;
        try {
            int ancho=50;
            int largo=50;
            img1 = new Image(new FileInputStream("src/imagenes/match.png"),ancho,largo,true,true);
                    } 
        catch (FileNotFoundException ex) {
            System.out.println("No se encontro la imagen");;
        }
        return img1;
    }
    
    public Tablero getTablero(){
        return tableroJugador;
    }
    
    
  /*  public static boolean verificarLoteria(Alineacion alineacion, GridPane grid){
        boolean verificacion = false;
        switch(alineacion){
            case FILA:
                
                break;
            case COLUMNA:
                
                break;
            case ESQUINA:
                

        }

                return verificacion;

    }*/
    
}
