/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingthread;

/**
 *
 * @author ACER
 */
public class Creatingthread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new child();
        for(int i=0;i<5;i++){
            try{
        System.out.println("main thread: "+i);
        Thread.sleep(1000);
            }
            catch(Exception e){
            System.out.print("main ine=terpted");
            }
            }
    }
    
}
