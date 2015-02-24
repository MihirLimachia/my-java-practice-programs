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
public class fuelstation {
    private String FT;
    private int FQ;
    private int FP;
    fuelstation(String nme,int a,int b){
    FT=nme;
    FQ=a;
    FP=b;
    }
    public void sellfuel(String a,int q){
    if(a.compareTo(FT)!=0){
    System.out.println("fuel type not available");
    }
    else if(q>FQ){
    System.out.println("FUEL NOT AVAILABLE IN THESE AMOUNTS");
    }
    else{
    FQ-=q;
    invoice(q); 
    }     
    }
    public void invoice(int q){
    System.out.println("AMOUNT PAYABLE:"+q*FP); 
    }
}
