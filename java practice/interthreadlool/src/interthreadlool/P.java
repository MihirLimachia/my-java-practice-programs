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
public class P implements Runnable{
    Thread t;
    static int i=0;
    Q q;
P(Q q){
t=new Thread(this,"producer");    
this.q=q;
t.start();
}
public void run(){
while(true){
q.push(i++);
if(i==10)break;
}
}
    
    
}
