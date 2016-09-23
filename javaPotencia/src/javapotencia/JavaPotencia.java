/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapotencia;
import java.util.*;
/**
 *
 * @author rsilva
 */
public class JavaPotencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numBase, exponente, res=1;
        
        System.out.println("Ingrese el número base:");
        Scanner sc = new Scanner(System.in);
        numBase = sc.nextInt();
        
        System.out.println("Ingrese el número exponente:");
        exponente = sc.nextInt();
        
        for( ; exponente>0;exponente--) res*=numBase;
        
        System.out.println("El resultado de la potencia es: " + res);
    }
    
}
