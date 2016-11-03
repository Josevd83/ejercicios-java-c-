/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabuscarpalabrasencadena;

/**
 *
 * @author rsilva
 */
public class JavaBuscarPalabrasEnCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String texto= "Este video es un tutorial de ejercicio de java y c++";
        int longitud = 0;       int contador = 0;       String palabra_objetivo = "de";
        int posicion = 0;       int veces_hallada = 0;       String palabra_rastreadora = "";
        
        for(int i=0; i<texto.length(); i++){
            while(!Character.isLetter(texto.charAt(i)) && (i+1)<texto.length() ) i++;
            
            posicion=i;
            longitud=0;
            contador++;
            while(Character.isLetter(texto.charAt(i)) && (i+1)<texto.length()){
                longitud++;
                i++;
            }
            
            palabra_rastreadora=texto.substring(posicion, posicion+longitud);
            if(palabra_rastreadora.equals(palabra_objetivo)){
                System.out.println("'"+ palabra_objetivo + "' fue encontrada en la posicion " + contador);
                veces_hallada++;
            }
        }
        
        if(veces_hallada == 0) System.out.println(palabra_objetivo + " no esta en el texto");
        else System.out.println("'" + palabra_objetivo + "' fue hallada " + veces_hallada + " veces");
    }
    
}
