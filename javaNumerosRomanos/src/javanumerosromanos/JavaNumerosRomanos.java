/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanumerosromanos;
import java.util.*;

/**
 *
 * @author rsilva
 */
public class JavaNumerosRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        String millares[] = {"", "M", "MM", "MMM"};
        String centenas[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String decenas[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String unidades[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Introduzca un número(1-3999): ");
            numero = sc.nextInt();
        }while(numero < 1 || numero >= 4000);
        
        //2569
        
        System.out.println("Número: " + numero + " = " + millares  [numero/1000]
                                                       + centenas  [(numero/100) % 10]
                                                       + decenas   [(numero/10) % 10]
                                                       + unidades [numero%10]);
        
    }
    
}
