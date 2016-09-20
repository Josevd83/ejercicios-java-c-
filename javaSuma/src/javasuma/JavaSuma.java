/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasuma;
import java.util.*; //libreria para recibir datos or teclado

/**
 *
 * @author rsilva
 */
public class JavaSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, num2;
        
        System.out.println("Indique el número 1: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        
        System.out.println("Indique el número 2: ");
        num2 = sc.nextInt();
        
        /* forma 1
        while(num2>0){
            num1++;
            num2--;
        }*/
        
        //forma 2
        for(; num2>0;num2--) num1++;
        
        System.out.println("La suma es: " + num1);
        
        
    }
    
}
