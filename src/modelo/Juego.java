/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import Enums.*;
import java.util.*;
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
    
    Scanner sc= new Scanner(System.in);
    
    public Juego(){
        System.out.println("Nombre del Jugador: ");
        String nombre=sc.nextLine();
        ganador= new Jugador(nombre);
        cartasJugadas= new ArrayList<Carta>();
        jugadores= new ArrayList<Jugador>();
        mazo= new Mazo();       
    }
    
  /*  public static boolean verificarLoteria(Alineacion alineacion, GridPane grid){
        boolean verificacion = false;
        switch(alineacion){
            case FILA:
                for (int i = 0; i < aleatorios.length; i++) {  
                    int sumf = 0;
                    for (int j = 0; j < aleatorios[i].length; j++) {
                        int valor =tblJugador.getMatrizMapa().get(aleatorios[i][j]);
                        sumf=sumf+ valor;  
                    }  
                    if (sumf == 4){
                        return true;
                        
                    } 
                  }  
                break;
            case COLUMNA:
                for (int i = 0; i < aleatorios[0].length; i++) {  
                    int sumc=0;  
                    for (int j = 0; j < aleatorios.length; j++) {  
                        int valor = tblJugador.getMatrizMapa().get(aleatorios[j][i]);
                        sumc=sumc+valor;
                        if(sumc == 4){
                            return true;
                        }
                    }
                }
                break;
            case ESQUINA:
                int id1 = aleatorios[0][0];
                int valor1 = tblJugador.getMatrizMapa().get(id1);
                int id2 = aleatorios[0][3];
                int valor2 = tblJugador.getMatrizMapa().get(id2);
                int id3 = aleatorios[3][0];
                int valor3 = tblJugador.getMatrizMapa().get(id3);
                int id4 = aleatorios[3][3];
                int valor4 = tblJugador.getMatrizMapa().get(id4);
                int suma = valor1+valor2+valor3+valor4;
                if (suma==4){
                    return true;
                }

        }

                return verificacion;

    }*/
    
}
