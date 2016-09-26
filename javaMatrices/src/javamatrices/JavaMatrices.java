/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamatrices;

/**
 *
 * @author rsilva
 */
public class JavaMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
                MATRIZ PRODUCTO[2][3]
                =====================
                        ---------------------------------
                FILA 0  | nombre1 |  cantiad1 | precio1 |
                FILA 1  | nombre2 |  cantidad | precio2 |
                        ---------------------------------
                         columna0   columna1    columna2
        */  
        
        String producto[][] = new String[2][3];
        
        producto[0][0] = "CafeMediano";
        producto[0][1] = "2";
        producto[0][2] = "15.80";
        
        producto[1][0] = "CafeGrande";
        producto[1][1] = "4.5";
        producto[1][2] = "36";
        
        float relacion1=Float.parseFloat((producto[0][2])) / Float.parseFloat(producto[0][1]);
        float relacion2=Float.parseFloat((producto[1][2])) / Float.parseFloat(producto[1][1]);
        
        if(relacion1 > relacion2)
            System.out.println(producto[1][0] + " es mas economico en relacion cantidad/precio");
        
        if(relacion1 < relacion2)
            System.out.println(producto[0][0] + " es mas economico en relacion cantidad/precio");
        
        if(relacion1 == relacion2)
            System.out.println(producto[0][0] + " y " + producto[1][0] + " tienen la misma relacion cantidad/precio");
    }
    
}
