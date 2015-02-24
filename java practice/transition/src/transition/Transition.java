/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transition;
import java.io.*;
import java.util.*;
/**
 *
 * @author ACER
 */
public class Transition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       File a=new File("C:\\Users\\ACER\\Desktop\\lab5.dat"); 
       int m=0,k=0;
       int id[]=null;
       String p[]=null;
       try{
       Scanner s=new Scanner(a);
       int y=(int)Integer.parseInt(s.nextLine());
       p=new String[y];
       for(int i=0;i<y;i++){
       p[i]=s.nextLine();
       }
   
       m=s.nextInt();
       k=s.nextInt();
       id=new int[m];
       for(int j=0;j<m;j++){
       id[j]=s.nextInt();
       }
       }
       catch(Exception e){
       e.printStackTrace();
       }
       office HQ=new office("HQ");
       office NEW=new office("NEW");
       handler h=new handler(p,m,k,id,HQ,NEW);
       h.deal();
       HQ.getemployees();
       NEW.getemployees();
    }
    
}
