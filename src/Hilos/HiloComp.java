/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import Enums.Alineacion;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import modelo.Carta;
import modelo.Juego;
import modelo.Jugador;
import modelo.Tablero;

/**
 *
 * @author Carlos Molineros
 */
public class HiloComp extends Thread {
    private GridPane gridComputadora;
    private HiloMazo cartaMazo;
    private Jugador computadora;
    private Tablero tblComputadora;
    private Alineacion alineacion;
    private boolean entry = true;
    private ArrayList<Carta> cartasJugadas;
    public static boolean visible = true;
    
    public HiloComp(GridPane gridMain, HiloMazo cartaMazo, Alineacion alineacion){
        this.gridComputadora = gridMain;
        computadora = new Jugador();
        tblComputadora = computadora.getTablero();
        tblComputadora.llenarCartasAzar(gridMain, cartaMazo);
        this.cartaMazo = cartaMazo;
        this.alineacion = alineacion;
        llenarGrid();
    }
    public void run(){
        
        while(entry){
            dormir();
            
            Platform.runLater(()->{
                for(int i=0;i<4;i++){
                    for(int j=0;j<4;j++){                    
                        int n = 0;
                        if (n==cartaMazo.getNumero()){
                            ImageView cntImagen = new ImageView();

                            if(visible){
                                cntImagen.setImage(Juego.Bean());
                            }
                            else{
                                cntImagen.setImage(Juego.WrongX());
                            }
                            gridComputadora.add(cntImagen,i,j);
                        }
                    }
                }
                if(Juego.verificarLoteria(alineacion,gridComputadora,cartasJugadas)){
                    System.out.println("GANO LA COMPUTADORA");
                    detener();
                }
            });
        }
        
    }
    public void llenarGrid(){
        int n = 0;
 
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                
                StackPane cntImgVw = new StackPane();
                Image imagen;
                ImageView cntImagen;
                if(visible){
                    imagen = Juego.imagenPequenaAusar(n);
                    cntImagen = new ImageView(imagen);
                    
                }
                else{
                    imagen = Juego.imagenNoVisible();
                    cntImagen = new ImageView(imagen);
                }
                cntImgVw.getChildren().add(cntImagen);
                gridComputadora.add(cntImgVw, i, j);
            }   
        }
    }
    
    //Dormir hilo
    public void dormir(){
        try {
            sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("Error en el hilo: "+ ex.getMessage());
        }
    }
    //Detener hilo para dar ganador
    public void detener(){
        entry = false;
    }
}
