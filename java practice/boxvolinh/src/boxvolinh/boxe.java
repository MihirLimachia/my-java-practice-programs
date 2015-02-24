/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxvolinh;

/**
 *
 * @author ACER
 */
public class boxe extends box{
    double weight;
    boxe(double w,double l,double h,double we){
    
    width=w;
    length=l;
    height=h;
    weight=we;    
    }
  double dens(){
  return(weight/volume());
  
  }  
  double volume(){
  return(width*height*length);
  }
}
