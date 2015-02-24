/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplecatch;

/**
 *
 * @author ACER
 */
public class Multiplecatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=4;
        int b[]=new int[5];
        int p=0;
        try{
           
        int c=a/(p*b[5]);        }
        catch(ArithmeticException ex){
         System.out.print("dividing by zero");        
        }
        catch(ArrayIndexOutOfBoundsException ex){
        System.out.print("accesing elemnts outside of array");    
        }
    }
    
}
