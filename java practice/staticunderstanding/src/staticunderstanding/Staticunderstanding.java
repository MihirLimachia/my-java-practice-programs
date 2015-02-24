/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticunderstanding;

/**
 *
 * @author ACER
 */
public class Staticunderstanding {

    /**
     * @param x
     */
  public static void meth(int x){
   System.out.print(x+" "+a+" "+b);   
   }
    static int a=4;
    static int b;
    static {
    System.out.print("static block initialised");
    b=a*4;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        meth(45);
    }
    
}
