/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Favia Elizalde
 */
public class Jugador {
    private String nombre;
    private Tablero tablero;
    
    public Jugador(){
    }
    
    public Jugador(String nombre){
        this.nombre=nombre;
    }
    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
}
