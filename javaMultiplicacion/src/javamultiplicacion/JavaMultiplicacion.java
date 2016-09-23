/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamultiplicacion;
import java.util.*; //libreria necesaria para capturar los datos que vengan por teclado
/**
 *
 * @author rsilva
 */
public class JavaMultiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1,num2,res=0;
        
        System.out.println("Ingrese el primer número: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        num2 = sc.nextInt();
        
        for( ; num2>0; num2--) res+=num1;
        
        System.out.println("El resultado de la multiplicación es: " + res);
    }
    
}
