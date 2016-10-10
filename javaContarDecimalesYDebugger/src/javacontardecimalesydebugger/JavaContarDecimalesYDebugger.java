/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacontardecimalesydebugger;

/**
 *
 * @author rsilva
 */
public class JavaContarDecimalesYDebugger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double numero = 395.994532;
        int decimales = 0, entero;
        
        System.out.println(numero);
        
        entero = (int)numero;
        
        while(numero>entero)
        {
            numero*=10;
            decimales++;
            entero=(int)numero;
        }
        
        System.out.println("Tiene " + decimales + " decimales");
    }
    
}
