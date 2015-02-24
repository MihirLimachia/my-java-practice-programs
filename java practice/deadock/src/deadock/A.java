/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadock;

/**
 *
 * @author ACER
 */
public class A {
    
    synchronized public void foo(B b)   
    {
  String a=Thread.currentThread().getName();
  System.out.println("entered thread"+a+"a.foo");
  try {
Thread.sleep(1000);
} catch(Exception e) {
System.out.println("A Interrupted");
}
  b.last();
    }
    
 synchronized public void last(){
 System.out.println("inside a.last()"); 
 }
    
}