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
public class B {
    
   synchronized public void bar(A a){
   System.out.println("enetered thread:"+Thread.currentThread().getName()+"through b.bar");
   a.last();
   try {
Thread.sleep(1000);
} catch(Exception e) {
System.out.println("A Interrupted");
}
   }
   
  synchronized public void last(){
   System.out.println("inside b.last");
   }
}
