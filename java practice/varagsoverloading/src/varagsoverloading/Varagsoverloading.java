/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varagsoverloading;

/**
 *
 * @author ACER
 */
public class Varagsoverloading {

    /**
     * @param args the command line arguments
     */
    void test(int ...v){
      System.out.println(v.length);
      for(int x:v)
      { System.out.println(x);
              }     
    }
     void test(boolean ...v){
      System.out.println(v.length);
      for(boolean x:v)
      { System.out.println(x);
              }     
    }
      void test(String ...v){
      System.out.println(v.length);
      for(String x:v)
      { System.out.println(x);
              }     
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Varagsoverloading o1=new Varagsoverloading();
        o1.test(10);
        o1.test(10,20);
        o1.test("mihir","sarthak","ram");
    }
    
}
