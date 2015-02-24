/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilevelinh;

/**
 *
 * @author ACER
 */
public class box {
 private double length,height,width;
   box(){
    length=height=width=-1;    
    }
    
    box(double w,double l,double h){
    width=w;
    height=h;
    length=l;    
    }
    box(box o){
    this.height=o.height;
    this.width=o.width;
    this.length=o.length;  
    }  
    
    double vol(){
    return(width*height*length);
    }
}
