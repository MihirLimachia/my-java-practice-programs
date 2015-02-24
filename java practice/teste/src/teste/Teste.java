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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      fuelstation f=new fuelstation("petrol",50,10000);
        vehicles v1=new vehicles("petrol",100);
        v1.askforfuel();
        vehicles v2=new vehicles("petrol",100);
        v2.askforfuel();
      fuelstation f2=new fuelstation("petrol",40,1000);
      // vehicles v1=new vehicles("petrol",100);
        v1.askforfuel();
      // vehicles v2=new vehicles("petrol",100);
       v2.askforfuel();
        
    
}
}