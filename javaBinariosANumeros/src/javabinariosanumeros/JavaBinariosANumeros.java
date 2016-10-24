/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabinariosanumeros;

/**
 *
 * @author rsilva
 */
public class JavaBinariosANumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero=0;
        String Binario = "10010101";
        
        System.out.println("El número en binario " + Binario + " es el: ");
        
        for(int j = 0; j<Binario.length(); j++){
            if(Binario.charAt(j)=='1'){
                numero+=Math.pow(2,((Binario.length()-1)-j));
            }
        }
        
        System.out.println(numero);
        
        
    }
    
}
