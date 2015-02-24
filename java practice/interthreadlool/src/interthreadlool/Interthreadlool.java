/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interthreadlool;

/**
 *
 * @author ACER
 */
public class Interthreadlool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Q q=new Q();
        C c1=new C(q);
        P p1=new P(q);
        System.out.println("Press Control-C to stop.");
    }
    
}
