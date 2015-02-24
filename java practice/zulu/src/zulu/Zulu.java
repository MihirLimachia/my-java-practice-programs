/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zulu;
import java.io.DataInputStream;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Zulu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     DataInputStream a=new DataInputStream(System.in);
     Scanner b=new Scanner(System.in);   
     
     int n=0,x=0,k=0;
        try{
        n=Integer.parseInt(a.readLine());
        }
        catch(Exception e){
        System.out.print("enter an integer");            
                };
                int id[]=new int[n];
                String names[]=new String[n];
                int tenure[]=new int[n];
                int salary[]=new int[n];
                String inputs[]=new String[n];
        for(int i=0;i<n;i++){
        try{
        inputs[i]=a.readLine();
        }
        catch(Exception e){};        
        }        
        for(int i=0;i<n;i++)
        { int m=0,c=0;
           for(int j=0;j<inputs[i].length();j++){
            if(inputs[i].charAt(j)==','){
               if(c==0){
               id[i]=Integer.valueOf(inputs[i].substring(m,j));
               c++;
               m=j+2;
               continue;
               }
              if(c==1){
             names[i]=inputs[i].substring(m,j);
               c++;               
               m=j+2;
               continue;
               }               
               if(c==2){
              tenure[i]=Integer.valueOf(inputs[i].substring(m,j));
               c++;
               m=j+2;
               continue;
               }
            }
               if(c==3 && j==inputs[i].length()-1){
               salary[i]=Integer.valueOf(inputs[i].substring(m,j+1));
               c++;
               }
                       
           }
        }
         try{
         x=b.nextInt();
         k=b.nextInt();         
         }  
          catch(Exception e){
                   
          };    
         employees e[]=new employees[n];
         for(int h=0;h<n;h++){
         e[h]=new employees(id[h],names[h],tenure[h],salary[h]); 
       
         }
      manage m1=new manage();
      int t=e.length;
      firm HQ=new firm("HQ",t-k);
   firm NEW=new firm("new",k);
      m1.sort(x,k,e,HQ,NEW);
      System.out.println("HQ");
      HQ.getemployeelist();
      System.out.println("NEW");
      NEW.getemployeelist();
               
    }    
}
