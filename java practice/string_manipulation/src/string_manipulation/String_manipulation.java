/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_manipulation;

/**
 *
 * @author ACER
 */
public class String_manipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name="mihir";
        String name2="sarthak";
        String name3=name;
        System.out.println("s1==s2:"+name.equals(name2));
         System.out.println("s1==s3:"+name.equals(name3));
        System.out.println("s1's length:"+ name.length());
      String a[]={"mhir","mir","ja","sa","r"};
        for(int i=0;i<5;i++)
            System.out.println(a[i]);
  
    }
}