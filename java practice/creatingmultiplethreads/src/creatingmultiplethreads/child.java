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
public class child implements Runnable {
   Thread t;
    child(String name){
    t=new Thread(this,name);
    t.start();
    }
    @Override
    public void run(){
    for(int i=0;i<5;i++){
try{
        System.out.println(t.getName()+" "+i);
    Thread.sleep(500);
    }
    
    catch(InterruptedException e){
    System.out.println(t.getName()+"caught");
    }
        }
    System.out.println("exiting"+this.t.getName());    
    }
}
