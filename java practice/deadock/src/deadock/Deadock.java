/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadock;

/**
 *
 * @author ACER
 */
public class Deadock implements Runnable {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        
        A a=new A();
        B b=new B();
        Deadock(){
        Thread.currentThread().setName("main thread");
        Thread t=new Thread(this,"racing thread");
        t.start();
        a.foo(b);
                }
        public void run(){
        b.bar(a);
        }
 public static void main(String[] args) {
 new Deadock();               
 }
    
}
