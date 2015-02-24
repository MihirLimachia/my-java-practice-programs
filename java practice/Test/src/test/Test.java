/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ACER
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fuelstation.FP=20000;
        Fuelstation.FQ=100000;
        Fuelstation.FN="TURBO";
        Fuelstation.FT="petrol";
        Vehicles v1=new Vehicles("petrol",50);
   Vehicles v2=new Vehicles("deisel",100);
        v1.askforfuel();
        v2.askforfuel();
        
   
    }
    
}
