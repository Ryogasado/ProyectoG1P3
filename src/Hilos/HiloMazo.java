/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        for(int i: listaCartasNumeros){
            Carta nueva= new Carta(i);
            mazo.add(nueva);
            
        }
    }

    //Run del hilo
    @Override
    public void run(){
        
        for(Carta c: mazo){
            try {
                numero= c.getNumero();
                imag= new Image(new FileInputStream("src/imagenes/"+numero+".png"),90,90,true,true);
                imagenSc.setImage(imag);
                dormir();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HiloMazo.class.getName()).log(Level.SEVERE, null, ex);
            }
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
