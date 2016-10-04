/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaserieprimos;

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
        int numero = 1, cont, objetivo=15, aux;
        boolean primo;
        
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
