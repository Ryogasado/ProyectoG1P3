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
public class Carta {
    private int numero;
    private String nombre;
    private String rutaImagen;
    
    public Carta(int numero, String nombre, String ruta){
        this.numero=numero;
        this.nombre=nombre;
        this.rutaImagen=ruta;
    }
    
}
