/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingthread;

/**
 *
 * @author ACER
 */
public class child extends Thread{
    child(){
    System.out.println("child created");
    start();
    }
    public void run(){
   for(int i=0;i<5;i++){
       try{
   System.out.println("child thread: "+i);
   Thread.sleep(500);
       }
       catch(InterruptedException e){
       System.out.println("child interrupted");
       }
       }   
    
    }
    
}
