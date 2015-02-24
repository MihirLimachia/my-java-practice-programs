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
public class child implements Runnable{
    long click=0;
    Thread t;
    private volatile boolean running=true;
    child(int p){
    t=new Thread(this);
    t.setPriority(p);
    }
    public void run(){
    while(running)
    {    
    click++;
    }
    }
    public void stop(){
    running=false;    
    }
    public void start(){
    t.start();
    }

}
