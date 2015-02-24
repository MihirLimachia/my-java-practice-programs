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
public class callme {
   synchronized public void get(String a){
    System.out.print("["+a);
    try{
    Thread.sleep(1000);
    }
    catch(InterruptedException e){
    System.out.println("thread interrupted");
    }
    System.out.println("]");
    }
}
