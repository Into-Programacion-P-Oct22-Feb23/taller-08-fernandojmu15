/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica02;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author VEL-USER
 */
public class Problematica02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int num = 25;
        int numDos;
        int numTres;
        int numCuatro;
        int contador;
        String mensaje = "";
        mensaje = mensaje + "#\tx2\tx3\tx4\n";
        
        for(contador = 25; contador >= 1; contador--){
            numDos = num * 2;
            numTres = num * 3;
            numCuatro = num * 4;
            mensaje = String.format("%s%d\t%d\t%d\t%d\n", 
                    mensaje,
                    num, 
                    numDos, 
                    numTres, 
                    numCuatro);
            num--;
            numDos--;
            numTres--;
            numCuatro--;
        }
        System.out.println(mensaje); 
    }
    
}
