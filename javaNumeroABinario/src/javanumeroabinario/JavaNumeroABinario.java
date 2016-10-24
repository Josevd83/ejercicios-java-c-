/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanumeroabinario;

/**
 *
 * @author rsilva
 */
public class JavaNumeroABinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Potencias de 2
        ^15     ^10     ^9      ^8      ^7      ^6      ^5      ^4      ^3      ^2      ^1      ^0
        32768   2048    1024    256     124     64      32      16      8       4       2       1
        37-5-1                                          1       0       0       1       0       1
        */
        
        int numero = 23734;
        String Binario = "";
        
        System.out.println("El número " + numero + " en Binario es: ");
        for(int j=15; j>=0; j--)
        {
            if(numero>=Math.pow(2, j))
            {
                numero-=Math.pow(2, j);
                Binario=Binario.concat("1");
            }
            else
                Binario=Binario.concat("0");
        }
        System.out.println(Binario);
    }
    
}
