package test;

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
   static String FT;
   static String FN;
   static int FP;
   static int FQ;
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
