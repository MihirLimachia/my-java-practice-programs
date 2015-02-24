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
public class Lab0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fuelstation f1=new fuelstation("petrol",6000,60);
        fuelstation f2=new fuelstation("diesel",7000,50);
        vehicle v1=new vehicle("petrol",40);
        vehicle v2=new vehicle("diesel",70);
        v1.ask(f1);
        v1.ask(f2);
           v2.ask(f2);
           v2.ask(f1);
    }
    
}
