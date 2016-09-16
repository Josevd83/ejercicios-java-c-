/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaserieoperacionesnumericas;
import java.util.*; //para captar por teclado lo que ingrese el usuario

/**
 *
 * @author rsilva
 */
public class JavaSerieOperacionesNumericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int serie = 1;
        boolean sumar = true;
        int cont;
        String cadena = "Serie: ";
        
        System.out.println("Indique cuantos números de la serie desea ver: ");
        Scanner sc = new Scanner(System.in);
        cont=sc.nextInt();
        
        do{
            cadena = cadena.concat(String.valueOf(serie) + " ");
            
            cont --;
            
            if(sumar) serie+=4;
            else serie-=2;
            
            sumar=!sumar;
            
            
        }while(cont>0);
        
        System.out.println(cadena);
    }
    
}
