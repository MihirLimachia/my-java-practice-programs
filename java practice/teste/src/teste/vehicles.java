/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author ACER
 */
public class vehicles {
    
static String name;
static int qt;
//static fuelstation f=new fuelstation("petrol",50,10000);
//static fuelstation f2=new fuelstation("petrol",40,1000);
vehicles(String nae,int q){
    name=nae;
    qt=q;
}
void askforfuel(){
fuelstation.sellfuel(name,qt);
//fuelstation.sellfuel(name,qt);
}



}
