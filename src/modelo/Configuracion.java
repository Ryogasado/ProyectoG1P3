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
    private String numOponentes;
    
    Scanner sc= new Scanner(System.in);
    
    public Configuracion(String s, String oponent){
        this.numOponentes= oponent;
        if(s.equals("Si")){
            visible= true;
        }else{
            visible=false;
        }
        
    }
    
    public void methodConfig(String archivo){
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
