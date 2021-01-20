/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.*;

/**
 *
 * @author Favia Elizalde
 */
public class Mazo {
    private ArrayList<Carta> cartas;
    
    
    public void llenarMazo(){
        ArrayList<Integer> listaNumCartas = new ArrayList<>();
        for(int i=1 ;i<=54;i++){
            listaNumCartas.add(i);
        }
        Collections.shuffle(listaNumCartas);
        for(int i: listaNumCartas){
            Carta nueva= new Carta(i);
            cartas.add(nueva);
        }
    }
    public void barajar(){
        
    }
    
}
