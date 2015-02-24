/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingsycmethods;

/**
 *
 * @author ACER
 */
public class Usingsyncmethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        callme c=new callme();
        caller a=new caller("hello",c);
        caller b=new caller("hi",c);
        caller d=new caller("bye",c);
        try{
        a.t.join();
        b.t.join();
        d.t.join();
        }
        catch(InterruptedException e){
        System.out.println("main thread interrupted");
        }
    }
    
}
