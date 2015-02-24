/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.3
5

 */
package lifesimulation;
import java.io.*;
import java.util.*;
/**
 *
 * @author ACER
 */
public class Lifesimulation {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m=0,n=0;
        String b[]=null;
        try{
        File f=new File("C:\\Users\\ACER\\Desktop\\lab4.dat");
        Scanner a=new Scanner(f);
        m=a.nextInt();
        n=a.nextInt();
        a.nextLine();
       b=new String[m];
        for(int i=0;i<m;i++){
        b[i]=a.nextLine();            
        }
        }
        catch(FileNotFoundException e){
        e.printStackTrace();
        }
        
        community g=new community(m);        
       g.create(b);
      g.simulate(99);
}
}