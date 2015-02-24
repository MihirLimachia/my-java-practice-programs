/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedcatchinmethods;

/**
 *
 * @author ACER
 */
public class NestedCatchinmethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=5;
        int b=0;
        int c;
        try{
        neste();
        c=a/b;
        }
        catch(ArithmeticException ex){
        System.out.print("arithmetic exception encountered");
        }
    }
    static void neste(){
       try{
       int p[]=new int[5];
       p[5]=7;      
       }
       catch(ArrayIndexOutOfBoundsException ex){
       System.out.print("Array index out of bounds");      
       }    
    }
}
