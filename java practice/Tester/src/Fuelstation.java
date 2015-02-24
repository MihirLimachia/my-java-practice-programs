/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
   public class Fuelstation {
   static String FT="petrol";
   static String FN="turbo";
   static int FP=300;
   static int FQ=50000;
   
 Fuelstation(String ty,String na,int price,int qty){
   FT=ty;
   FN=na;
   FP=price;
   FQ=qty;
   }
   
   static void sell_fuel(String type,int qty ){
   if(type.compareTo(FT)==0){
   FQ-=qty;
   invoice(qty);
   }
   else{
   System.out.println("requsted fuel not avaialable");
   }
   }
  static void invoice(int qty){
   System.out.println("amount payable:"+qty*FP);
   }
}
