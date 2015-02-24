/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingthrowa;

/**
 *
 * @author ACER
 */
public class Usingthrows{

    /**
     * @throws java.lang.IllegalAccessException
     */
    public static void met()throws IllegalAccessException
   {
    throw new IllegalAccessException("erre");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a=5;
        try{
       met();
        }
        catch (IllegalAccessException ex){
        System.out.print(ex);
        }
    }
   
}
