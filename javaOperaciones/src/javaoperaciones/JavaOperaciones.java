/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoperaciones;

/**
 *
 * @author rsilva
 */
public class JavaOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 0; i<=10; i++){
            System.out.println("\n********************************* " + i);
            System.out.println("\nTABLA DE MULTIPLICAR DEL "+ i);
            
            for(int j = 0; j<=10; j++ ){
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
        
    }
    
}
