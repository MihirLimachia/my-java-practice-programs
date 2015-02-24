/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public  class Vehicles {   
    String FTR;
int FQR;
Vehicles(String ty,int qty){
FTR=ty;
FQR=qty;
}
void askforfuel(){
 Fuelstation.sell_fuel(FTR,FQR);
}
}


