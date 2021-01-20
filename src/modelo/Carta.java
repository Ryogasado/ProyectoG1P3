/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.scene.image.Image;

/**
 *
 * @author Favia Elizalde
 */
public class Carta {
    private int numero;
    private String nombre;
    private Image imagen;
    
    
    public Carta(int numero){
        this.numero=numero;
        NumeroC(numero);
    }
    
    //Lee el archivo cartasloteria para obtener el numero y lo asocia con el nombre de la carta segun el csv
    public void NumeroC(int n){
        try(BufferedReader br = new BufferedReader(new FileReader("src/CSV/cartasloteria.csv"))){
            String line;
            while((line = br.readLine())!= null){
                String[] data = line.split(",");
                int num = Integer.parseInt(data[0]);
                if (num == n){
                    nombre= data[1];
                }
        }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Carta{" + "nombre=" + nombre + ", numero=" + numero + ", imagen=" + imagen + '}';
    }
    
    
    
}
