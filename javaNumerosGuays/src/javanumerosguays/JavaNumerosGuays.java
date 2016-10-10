/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanumerosguays;

/**
 *
 * @author rsilva
 */
public class JavaNumerosGuays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num, cont, acumulado;
        boolean guay;
        
        //1,2,3,4,5,6
        
        cont = 0;
        for(num=1;cont<10; num++)
        {
            acumulado = 0;
            guay = false;
            
            for (int i = 1; i<=num && guay==false; i++){
                acumulado+=i;
                if(acumulado==num){
                    cont++;
                    guay=true;
                    System.out.println("El número guay " + cont + " es " + num);
                }
            }
        }
    }
    
}
