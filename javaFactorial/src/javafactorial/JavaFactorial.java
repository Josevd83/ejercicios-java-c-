/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafactorial;
import java.util.*; //Para pedir datos por teclado
/**
 *
 * @author rsilva
 */
public class JavaFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //5! = 1*2*3*4*5 = 120
        
        int numero;
        int res=1;
        
        do{
            System.out.println("Indique un número: ");
            Scanner sc = new Scanner(System.in);
            numero = sc.nextInt();
        }while(numero<1);
        
        
        for(int i = 1; i<=numero; i++)
            res*=i; // res = res*i
        
        System.out.println(numero + "!= " + res);
    }
    
}
