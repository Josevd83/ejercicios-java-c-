/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatriopitagorico;

/**
 *
 * @author rsilva
 */
public class JavaTrioPitagorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //SE RECOMIENDA VISITAR LA PAGINA PROJECTEULER.NET PARA RESOLVER TODO TIPO DE EJERCICIOS PROPUESTOS (MATEMATICOS, NUMERICOS)
        
        boolean encontrado = false;
        for(int a=1; a<333 && !encontrado; a++)
        {
            for(int b=1; b<666 && !encontrado; b++)
            {
                for(int c=1; c<999 && !encontrado; c++)
                {
                    if(a+b+c == 1000)
                    {
                        if(a*a + b*b == c*c)
                        {
                            System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
                            encontrado=true;
                        }
                    }
                }
            }
        }
    }
    
}
