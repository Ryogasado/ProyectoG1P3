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



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;


public class Imagen {
    
    //metodo para crear imagen
    public static Image obtenerImagenC(int num){
        Image img = null;
        try {
            int ancho=100;
            int largo=100;
            img = new Image(new FileInputStream("src/imagenes/"+num+".png"),ancho,largo,true,true);
        } 
        catch (FileNotFoundException ex) {
            System.out.println("No se encontro la imagen");;
        }
        return img;
    }
    
}
