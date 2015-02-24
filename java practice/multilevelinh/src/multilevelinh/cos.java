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
public class cos extends boxe{
    double cost;
    cos(double w,double h,double l,double we,double c){
    super(w,h,l,we);
    cost=c;
    }
    void show(){
    System.out.println(vol());
    System.out.println(weight);
    System.out.println(cost);
    
    }
}
