/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varags;

/**
 *
 * @author ACER
 */
public class Varags {
  static void test(int ...v){
    
    System.out.println(v.length);
   for(int x:v)
    System.out.println(x);
    }    
    public static void main(String[] args) {
        // TODO code application logic here
      
        test(10);
        test(10,20);
}
}