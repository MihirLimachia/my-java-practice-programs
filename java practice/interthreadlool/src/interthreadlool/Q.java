/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interthreadlool;

/**
 *
 * @author ACER
 */
public class Q {
  int a;
  int i=0;
  boolean valueset=true;
  synchronized public void push(int p){
      while(!valueset){
      try{
          wait();
      }
      catch(InterruptedException e){
      }
      }
          a=p;
  System.out.println("put"+p);
  valueset=false;
  notify();
  }
  synchronized public int  get(){
      while(valueset){
      try{
          wait();
      }
      catch(InterruptedException e){
      }
      }
      valueset=true;
       notify();
      return a;
  
  }
}
