
package Enums;

import java.util.Random;

/**
 *
 * @author Favia Elizalde
 */
public enum Alineacion {
    
    ESQUINA,
    FILA,
    COLUMNA;
    
    //Elige la alineacion aleatoriamente
    public static Alineacion getRandomTipo(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
