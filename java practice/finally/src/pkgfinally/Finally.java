/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinally;

/**
 *
 * @author ACER
 */
public class Finally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   try{
        exe();
   }
   catch(Exception e){
   System.out.println("caught exception");
   }
   exe2();
   exe3(); 
    }
   static void exe(){
       try{
       System.out.println("entering exe");
       throw new RuntimeException("err");
       }
       finally{
    System.out.println("inside exe");
   }
   } 
   static void exe3(){
       try{
       System.out.println("entering exe3");
       return ;
       }
       finally{
    System.out.println("inside exe3");
   }
   } 
   static void exe2(){
       try{
       System.out.println("entering exe2");
       return ;
       }
       finally{
    System.out.println("inside exe2");
   }
   } 
}   
  
    

