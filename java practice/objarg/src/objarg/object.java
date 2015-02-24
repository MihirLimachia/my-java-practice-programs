/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objarg;

/**
 *
 * @author ACER
 */
public class object {
    int a,b,c,volo;
    object(int a,int b,int c){
     this.a=a;
     this.b=b;
     this.c=c;
    }
    object(object o){
    a=o.a;
    b=o.b;
    c=o.c;
    }
    void vol(){
    this.volo=a*b*c;
}
    
   boolean check(object o){
        return o.volo==volo;
   } 
}
