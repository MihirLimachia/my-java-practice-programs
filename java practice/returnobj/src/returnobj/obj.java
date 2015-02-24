/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returnobj;

/**
 *
 * @author ACER
 */
public class obj {
    int a,b;
    obj(int a,int b){
    this.a=a;
    this.b=b;   
    }
    obj change(obj o){
    obj t=new obj(a+10,b+20);
    return t;
    }
}
