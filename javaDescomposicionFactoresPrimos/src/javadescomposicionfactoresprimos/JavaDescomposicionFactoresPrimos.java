/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadescomposicionfactoresprimos;
import java.util.*;
/**
 *
 * @author rsilva
 */
public class JavaDescomposicionFactoresPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, factor;
        
        System.out.println("Ingrese el número a descomponer:");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        
        //60 30 15 5 1
        //2, 3, 4, 5, 6
        //numero = 60;
        for(factor=2; factor<=numero; factor++){
            while(numero%factor==0){
                System.out.println(numero + " | " + factor);
                numero/=factor;
            }
                    
        }
    }
    
}
