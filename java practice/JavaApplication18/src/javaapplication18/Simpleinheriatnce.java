/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author ACER
 */
public class Simpleinheriatnce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        b o1=new b();
        o1.j=0;
        o1.k=10;
        o1.i=4;
        o1.disk();
        o1.disij();
        classscreation o2=new classscreation();
        o2=o1;
        o2.disij();
        o1.sum();
        
    }
    
}
