/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainthread;

/**
 *
 * @author ACER
 */
public class childthread implements Runnable{
    Thread t;
    childthread(){
    t=new Thread(this,"child");
    System.out.println("child thread created");
    t.start();
    }
    
    
    @Override
    public void run(){
    for(int i=0;i<5;i++){
    try{
        System.out.println("child thread:"+i);
    Thread.sleep(500);
    }
    catch(InterruptedException e){
    System.out.println("thread interrupted");
    }
    }
    }
}
