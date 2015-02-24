/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package create;

/**
 *
 * @author ACER
 */
public class Nesting {

    /**
     * @param args the command line arguments
     */
    int a=10;
 //   void square(int k){System.out.print(k*k);}
    void test(){
  inn o1=new inn();
  o1.display();
    }
    class inn{ 
    int l=10; 
    void display(){
    System.out.println(a);
    System.out.println(l);
    }
    }
}