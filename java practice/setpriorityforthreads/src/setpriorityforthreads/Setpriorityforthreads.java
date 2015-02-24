/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setpriorityforthreads;

/**
 *
 * @author ACER
 */
public class Setpriorityforthreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        child h=new child(Thread.NORM_PRIORITY+2);
        child l=new child(Thread.NORM_PRIORITY-2);
        h.start();
        l.start();
        try{
        Thread.sleep(10000);
        
        }
        catch(InterruptedException e){
        System.out.println("main thread interrupted");
        }
        h.stop();
        l.stop();
        try{
        h.t.join();
        l.t.join();        
        }
        catch(InterruptedException e){
        System.out.println("main thread interrupted");                
        }
        System.out.println(h.click);
        System.out.println(l.click);
    }
    
}
