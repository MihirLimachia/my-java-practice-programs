/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwarithexception;

/**
 *
 * @author ACER
 */
public class object {
    int a=5,c;
    int v=0;
    void div(){
    try{
        c=a/v;
    }
    catch(Exception e)
    {    System.out.println("triyng division by zero "+e);
         c=0;        
    }
    
    System.out.println(c);
            }
}
