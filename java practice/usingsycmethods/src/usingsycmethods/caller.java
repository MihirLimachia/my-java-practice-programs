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
public class caller implements Runnable{
   Thread t;
   callme s;
    caller(String a,callme b){
      t=new Thread(this,a);
    s=b;
    t.start();
    }
   @Override
    public void run(){
    s.get(t.getName());
    }
}
