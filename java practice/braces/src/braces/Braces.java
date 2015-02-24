/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package braces;
import java.io.DataInputStream;
/**
 *
 * @author ACER
 */
public class Braces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0;
        DataInputStream b=new DataInputStream(System.in);
        try{
        a=Integer.parseInt(b.readLine());
        }
        catch(Exception e){};
        
    for(int i=0;i<a;i++){
 String in="";
        try{
    
  in=b.readLine();
 }
 catch(Exception ex){};
  Stack s=new Stack(in.length()); 
  for(int k=0;k<in.length();k++){
  s.push(in.charAt(k));
  
  }
   
    
    
    
    }    

    
    
    
    
    }
}