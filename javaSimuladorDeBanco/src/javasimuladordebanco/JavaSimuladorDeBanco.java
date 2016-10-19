/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasimuladordebanco;

/**
 *
 * @author rsilva
 */
public class JavaSimuladorDeBanco {

    /**
     * @param args the command line arguments
     */
   public static double importe = 498.36; 
    
   public static void RetirarDinero(double cantidad, String tipo){
        int contador=0;
        while(importe>=cantidad){
            importe-=cantidad;
            contador++;
        }
        
        if(contador>0) System.out.println(tipo + " de " + cantidad + " : " + contador);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
//        double importe = 498.36;
        double cantidades[] = {
                                500, 200, 100, 50, 20, 10, 5,  //7 billetes
                                2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01 // 8 monedas
        };
        int i;
        
        System.out.println("El importe" + importe +" se expenderá de la siguiente forma:");
        
        for(i=0;i<15;i++){
            if(i<7)
                RetirarDinero(cantidades[i], "billetes");
            else
                RetirarDinero(cantidades[i], "monedas");
        }
    }
    
}
