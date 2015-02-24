/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returnobj;

/**
 *
 * @author ACER
 */
public class Returnobj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       obj o1=new obj(10,20);
       obj o2=o1.change(o1);
       System.out.print(o2.a+"  "+o2.b);
        
    }
    
}
