/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import java.util.ArrayList;
import java.util.Collections;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modelo.Carta;

/**
 *
 * @author Carlos Molineros
 */
public class HiloMazo extends Thread{
    public ArrayList<Carta> mazo = new ArrayList<>();
    private int numero;
    public ImageView imagenSc;
    public Image imag;
    
    public int getNumero(){
        return numero;
    }
    
    public void setId(int numero) {
        this.numero= numero;
    }
    
    //Metodo para llenar las cartas del mazo
    public void llenarMazo(){
        ArrayList<Integer> listaCartasNumeros = new ArrayList<>();
        for(int i=1 ;i<=54;i++){
            listaCartasNumeros.add(i);
        }
        Collections.shuffle(listaCartasNumeros);
        //Arreglar lo de agregar con el constructor de la carta
        for(int i: listaCartasNumeros){
            Carta nueva= new Carta(i,nombre,ruta);
            mazo.add(nueva);
            
        }
    }

    //Run del hilo
    @Override
    public void run(){
        for(Carta c: mazo){
            imag= c.getImagen();
            numero= c.getNumero();
            imagenSc.setImage(imag);
            dormir();
        }
    }
    
    //Estado dormir hilo
    public void dormir(){
        try{
            sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();

        }
    }
    
    //Constructor Hilo
     public HiloMazo(ImageView imgView){
        this.imagenSc= imgView;
        llenarMazo();
    }
}
