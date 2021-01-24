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
    private double duracion;
    private Jugador ganador;
    private ArrayList<Jugador> jugadores;
    private Configuracion configuracion;
    private Mazo mazo;
    private ArrayList<CartaJuego> cartasJugadas;
    private Alineacion alineacion;
    private Tablero tableroJugador;
    public static int cantOpn=1;
    
    
    Scanner sc= new Scanner(System.in);
    
    public Juego(){
        
        System.out.println("Nombre del Jugador: ");
        String nombre=sc.nextLine();
        ganador= new Jugador(nombre);
        cartasJugadas= new ArrayList<CartaJuego>();
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
    
    public static Image imagenNoVisible(){
        Image img1 = null;
        try {
            int ancho=45;
            int largo=45;
            img1 = new Image(new FileInputStream("src/imagenes/back.png"),ancho,largo,true,true);
                    } 
        catch (FileNotFoundException ex) {
            System.out.println("No se encontro la imagen");;
        }
        return img1;
    }
    
    public static Image imagenPequenaAusar(int num){
        Image img1 = null;
        try {
            int ancho=45;
            int largo=45;
            img1 = new Image(new FileInputStream("src/imagenes/"+num+".png"),ancho,largo,true,true);
                    } 
        catch (FileNotFoundException ex) {
            System.out.println("No se encontro la imagen");;
        }
        return img1;
    }
    
    
    public static boolean verificarLoteria(Alineacion alineacion, GridPane grid, ArrayList<CartaJuego> cartasJugadas){
        boolean verificacion = false;
        switch(alineacion){
            case FILA:
                if(cartasJugadas.get(0).isMarcada()==true & cartasJugadas.get(1).isMarcada()==true & cartasJugadas.get(2).isMarcada()==true & cartasJugadas.get(3).isMarcada()==true){
                    return true;
                }else if(cartasJugadas.get(4).isMarcada()==true & cartasJugadas.get(5).isMarcada()==true & cartasJugadas.get(6).isMarcada()==true & cartasJugadas.get(7).isMarcada()==true){
                return true;   
                } else if(cartasJugadas.get(8).isMarcada()==true & cartasJugadas.get(9).isMarcada()==true & cartasJugadas.get(10).isMarcada()==true & cartasJugadas.get(11).isMarcada()==true){
                    return true;
                } else if(cartasJugadas.get(12).isMarcada()==true & cartasJugadas.get(13).isMarcada()==true & cartasJugadas.get(14).isMarcada()==true & cartasJugadas.get(15).isMarcada()==true){
                    
                }
        
                break;
            case COLUMNA:
                
                break;
            case ESQUINA:
                

        }

                return verificacion;

    }

    
}
