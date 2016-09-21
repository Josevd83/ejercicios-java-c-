/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaresta;
import java.util.*;//para capturar lo qeu el usuario ingrese por teclado
/**
 *
 * @author rsilva
 */
public class JavaResta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1,
            num2,
            aux = 0;
        
        System.out.println("Indique el número 1: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        
        System.out.println("Indique el número 2: ");
        num2 = sc.nextInt();
        
        /* metodo 1
        while(num2 < num1){
            num2++;
            aux++;
        }
        */
        
        //metodo 2
        for(;num2<num1;num2++) aux++;
        
        System.out.println("La resta es: " + aux);
    }
    
}
