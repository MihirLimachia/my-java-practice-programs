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
public class C implements Runnable{
Thread t;
    Q q;
C(Q q){
t=new Thread(this,"customer");    
this.q=q;
t.start();
}
public void run(){
while(true){
int p=q.get();
System.out.println("got "+p);
}
}
}

