/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import static java.lang.Thread.sleep;
import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import modelo.Juego;



/**
 *
 * @author Carlos Molineros
 */
public class HiloX extends Thread{
    StackPane sp;
    ImageView iv;
    
    public HiloX(StackPane sp){
        this.sp=sp;
    }
    
    public void run(){
        Platform.runLater(()->{
            Image wrong = Juego.WrongX();
            iv = new ImageView();
            iv.setImage(wrong);
            sp.getChildren().add(iv);
            Platform.runLater(()->{
                dormir();
                sp.getChildren().remove(iv);
            });

        });
    }
    
     public void dormir(){
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    
}
