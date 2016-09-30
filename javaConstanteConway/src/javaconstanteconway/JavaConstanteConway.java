/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconstanteconway;
import java.util.*;
/**
 *
 * @author rsilva
 */
public class JavaConstanteConway {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = 5;
        String cadena;
        int serie;
        
        int digito;//verificar el numero que se repite
        int cantidad;//cantidad de veces que se repite digito
        int posicion;//para llevar el control en que parte del string se esta analizando
        String Next;//se guarda el analisis progresivo de la cadena
        
        do{
            System.out.println("Cuantos números de Conway quires ver: ");
            Scanner sc = new Scanner(System.in);
            serie = sc.nextInt();
            
        }while(serie<=0);
        
        System.out.println("*****************\nLa Serie es:\n1");
        serie--;
        
        for(;serie>0; serie--)
        {
            Next = "";
            cadena = Integer.toString(numero);
            
            for(posicion=0; posicion<cadena.length();){
                digito = (cadena.charAt(posicion))-48;
                cantidad = 0;
                while(digito == (cadena.charAt(posicion))-48){
                    posicion ++;
                    cantidad++;
                    if(posicion>=cadena.length()) break;
                }
                Next=Next.concat(Integer.toString(cantidad) + Integer.toString(digito));
            }
            System.out.println(Next);
            numero=Integer.parseInt(Next);
        }
    }
    
}
