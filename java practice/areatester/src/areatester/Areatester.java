/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areatester;

/**
 *
 * @author ACER
 */
public class Areatester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        rec r=new rec();
        System.out.println(r.getheigth()*r.getwidth());
        System.out.println(2*(r.getheigth()+r.getwidth()));
    }
    
}
