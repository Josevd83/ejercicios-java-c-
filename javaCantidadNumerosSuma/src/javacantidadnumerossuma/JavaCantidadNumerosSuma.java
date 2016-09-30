/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacantidadnumerossuma;

/**
 *
 * @author rsilva
 */
public class JavaCantidadNumerosSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num = new int[5];
        int cont;
        int suma;
        
        num[0]=340;
        for(int i=1; i<4; i++)num[i]=num[i-1]*36;
        
        for(int i=0; i<5; i++)
        {
            System.out.print("El número de cifras de: " + num[i]);
            suma = 0;
            cont=0;
            for(;num[i]>0;num[i]/=10)
            {
                suma+=num[i]%10;
                cont++;
            }
            
            System.out.println(" es " + cont + " y la suma de sus cifras es " + suma);
        }
        
        
    }
    
}
