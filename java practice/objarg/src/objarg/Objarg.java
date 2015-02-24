/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objarg;

/**
 *
 * @author ACER
 */
public class Objarg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        object o1=new object(3,4,5);
        object o2=new object(5,12,1);
        object o3=new object(o1);
        o1.vol();
        o2.vol();
        o3.vol();
        System.out.print("volume of o1 an o3 are same "+ o1.check(o3) +".");
    }
    
}
