/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabuscarpalabramaslarga;

/**
 *
 * @author rsilva
 */
public class JavaBuscarPalabraMasLarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String texto = "Este es un ejemplo de un ejercicio para encontrar "
                + "la palabra mas larga¿funcionara correctamente??????????";
        int longitud=0;
        int posicion=0;
        int mayor=0;
        int PosMayor=0;
        
        for(int i=0; i<texto.length(); i++){
            while(!Character.isLetter(texto.charAt(i)) && (i+1)<texto.length()){
                i++;
            }
            
            posicion=i;
            longitud=0;
            while(Character.isLetter(texto.charAt(i)) && (i+1)<texto.length()){
                longitud++;
                i++;
            }
            
            if(longitud>mayor){
                mayor=longitud;
                PosMayor=posicion;
            }
        }
        
        String Palabra="";
        for(int i=0; i<mayor; i++){
            Palabra=Palabra.concat(String.valueOf(texto.charAt(PosMayor+i)));
        }
        System.out.println("La palabra mas larga es '" + Palabra + "' y tiene " + mayor + " caracteres");
    }
    
}
