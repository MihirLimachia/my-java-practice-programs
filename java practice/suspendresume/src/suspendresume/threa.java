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
public class threa implements Runnable{
    String name;
    Thread t;
    threa(String th){
    name=th;
    t=new Thread(this,name);
    t.start();
    }
    public void run(){
    for(int i=15;i>=0;i--){
    System.out.println(t.getName()+" "+i);
    try{
    t.sleep(200);
    }
    catch(InterruptedException e){
    System.out.println("thread interrupted");
    }
    }   
    System.out.println("exitind thread"+t);
    }    
}
