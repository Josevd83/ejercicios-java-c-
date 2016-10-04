/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaserieprimos;
import java.util.*;
/**
 *
 * @author rsilva
 */
public class JavaSeriePrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 1, cont, objetivo, aux;
        boolean primo;
        
        System.out.println("Ingrese la cantidad de números primos que desea ver:");
        
        Scanner sc = new Scanner(System.in);
        objetivo = sc.nextInt();
        
        for(cont=0; cont<objetivo;numero++)
        {
            primo = true;
            
            for(aux=2; aux<=numero/2 && primo==true; aux++){
                if(numero%aux==0) primo=false;
            }
            
            
            if(primo){
                cont++;
                System.out.println("El número primo " + cont + " es " + numero);
            }
        }
    }
    
}
