/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxvolinh;

/**
 *
 * @author ACER
 */
public class Boxvolinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boxe o1=new boxe(100,20,40,100);
        double densi=o1.dens();
        System.out.println(densi);
        box o2=new box();
        o2=o1;
        System.out.println(o2.vol());
    }
    
}
