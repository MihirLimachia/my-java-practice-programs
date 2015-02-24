/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suspendresume;

/**
 *
 * @author ACER
 */
public class Suspendresume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        threa a=new threa("one");
        threa b=new threa("two");
        try{
        Thread.sleep(1000);
        a.t.suspend();
        Thread.sleep(1000);
        a.t.resume();
        Thread.sleep(1000);
         b.t.suspend();
         Thread.sleep(1000);
        b.t.resume();       
        }
        catch(InterruptedException e){
        System.out.println("main thread interrupted");
        }
        try{
        a.t.join();
        b.t.join();
        }
        catch(InterruptedException e){
        System.out.println("main thread interrupted");
        }
        
        System.out.println("exiting main thread");
    }
    
}
