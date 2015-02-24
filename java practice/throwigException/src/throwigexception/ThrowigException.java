/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwigexception;

/**
 *
 * @author ACER
 */
public class ThrowigException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        nest();
        }
        catch(NullPointerException ex){
        System.out.print("caught in main");
        }
    }
  static void nest(){
  try{
  throw new NullPointerException("demo"); 
  }
  catch(NullPointerException ex){
  System.out.print(ex.getMessage());
  }
  }  
}
