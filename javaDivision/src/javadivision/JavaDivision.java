/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadivision;
import java.util.*;
/**
 *
 * @author rsilva
 */
public class JavaDivision {

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
        
        while(num1>=num2){
            num1-=num2;
            res++;
        }
        
        System.out.println("El resultado es: " + res + " y el resultado o resto es: " + num1);
    }
    
}
