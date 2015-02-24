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
public class fuelstation {
   static  String name;
   static String type;
   static int qty;
   static int price;
fuelstation(String na,int p,int qt)
{
name=na;
price=p;
qty=qt;
}
public static void sellfuel(String nae,int qt){
if(name.compareTo(nae)==0 && qty>qt){
qty-=qt;
invoice(qt);
}
else{
System.out.println("fuel not available");
}
}
static void invoice(int qt){
    System.out.println("fuel quantity left:"+qty);
    System.out.println("amount payable:"+qt*price);
}










}
