/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.*;
import java.util.*;

/**
 *
 * @author Favia Elizalde
 */
public class Configuracion {
    private boolean visible;
    private int numOponentes;
    
    Scanner sc= new Scanner(System.in);
    
    public Configuracion(){
        System.out.println("Elegir el numero de oponentes: ");
        System.out.println("1 o 2");
        int numero=sc.nextInt();
        sc.nextLine();
        this.numOponentes=numero;
    }
    
    public void method(String archivo){
        try{
            File file= new File(archivo);            
            FileWriter escribir= new FileWriter(file);
            BufferedWriter bw= new BufferedWriter(escribir);
            PrintWriter pw= new PrintWriter(file);
            
            
            if (!file.exists()){
                file.createNewFile();
                escribir.write("Numero de oponentes: "+this.numOponentes);
                escribir.write("Cartas visibles o ocultas: "+this.visible);
            }else{
                escribir.write("Numero de oponentes: "+this.numOponentes);
                escribir.write("Cartas visibles o ocultas: "+this.visible);              
                
            }
               
        }catch(IOException e){
            System.out.println("Error");
            
        }
        
    }
}
