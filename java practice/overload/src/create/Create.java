/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package create;

/**
 *
 * @author ACER
 */
public class Create{
    public static void main(String arg[]){
    Overload o1=new Overload();
    int p=o1.square();
    double q=o1.square(6.5);
    int r=o1.square(4); 
   System.out.print(p+" "+q+" "+r); 
    
    }
}
