/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author ACER
 */
public class vehicle {
    
    String FTR;
   int FQR;
   fuelstation f;
   vehicle(String a,int b){
  
   FTR=a;
   FQR=b; 
   }
   public void ask(fuelstation e){
   f=e;
   f.sellfuel(FTR,FQR);
   }
}
