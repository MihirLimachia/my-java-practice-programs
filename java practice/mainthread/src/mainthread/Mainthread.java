/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainthread;

/**
 *
 * @author ACER
 */
public class Mainthread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  new childthread();
        for(int i=0;i<5;i++){
        try{
        System.out.println("main thread:"+i);
        Thread.sleep(100);
        }
        catch(InterruptedException e){
        
        System.out.println("interrupted exception caught");
        }
        
        }
    }
    
}
