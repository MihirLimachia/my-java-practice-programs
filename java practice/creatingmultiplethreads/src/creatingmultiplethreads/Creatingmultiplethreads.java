/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingmultiplethreads;

/**
 *
 * @author ACER
 */
public class Creatingmultiplethreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
      child c1=new child("dickson");
      child c2=new child("bart");
      child c3=new child("jack");
      System.out.println("status of thread c1:"+c1.t.isAlive());
      System.out.println("status of thread c2:"+c2.t.isAlive());
      System.out.println("status of thread c3:"+c3.t.isAlive());
       try{
        System.out.print("waiting for the other threads to complete exceution");
        c1.t.join();
        c2.t.join();
        c3.t.join();
        }
            
        catch(InterruptedException e){
        System.out.println("main thread interrupted");
        }
           
    for(int i=0;i<5;i++){
    System.out.println("mainthread: "+i);    
    }
     System.out.println("status of thread c1:"+c1.t.isAlive());
      System.out.println("status of thread c2:"+c2.t.isAlive());
      System.out.println("status of thread c3:"+c3.t.isAlive());
    
    System.out.println("exiting main thread");
    }
    }
