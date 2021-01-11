/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import Enums.*;
import java.util.*;


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
    
    Scanner sc= new Scanner(System.in);
    
    public Juego(){
        System.out.println("Nombre del Jugador: ");
        String nombre=sc.nextLine();
        ganador= new Jugador(nombre);
        cartasJugadas= new ArrayList<Carta>();
        jugadores= new ArrayList<Jugador>();
        mazo= new Mazo();       
    }
    
    
    
    
}
