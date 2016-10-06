/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanumerosamigosyperfectos;

/**
 *
 * @author rsilva
 */
public class JavaNumerosAmigosYPerfectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, div1, div2, amigos, perfectos;
        
        amigos = 0;
        perfectos = 0;
        
        //for(num1=2; perfectos<3; num1++)
        for(num1=2; amigos<10; num1++)
        {
            div1=0;
            div2=0;
            
            for(int i=1; i<=num1/2; i++)
                if(num1%i==0) div1+=i;
            
            if(div1==num1){
                perfectos++;
                System.out.println("El número perfecto " + perfectos + " es " + num1);
            }
            else
            {
                num2=div1;
            
                for(int i=1; i<=num2/2; i++)
                    if(num2%i==0) div2+=i;

                if(div1==num2 && div2==num1){
                    amigos++;
                    System.out.println("La pareja de amigos número " + amigos + " son " + num1 + " y " + num2);
                }
            }
 
        }
    }
    
}
