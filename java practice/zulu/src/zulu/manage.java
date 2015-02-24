/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zulu;
import java.io.DataInputStream;
/**
 *
 * @author ACER
 */
public class manage {
    
   DataInputStream a=new DataInputStream(System.in); 
   public void sort(int m,int k,employees e[],firm HQ,firm NEW){
   employees trc[]=new employees[m];    
   int reqid[]=new int[m],t=e.length;
       for(int i=0;i<m;i++){
           try{
   reqid[i]=Integer.parseInt(a.readLine());
           }
           catch(Exception ex){}
   }
       int l=0; 
   for(int i=0;i<t;i++){
    for(int j=0;j<m;j++){
     if(e[i].getid()==reqid[j]){     
     trc[l]=e[i];
     l++;
     }
    }
   }
 
   for(int o=0;o<trc.length;o++){
   for(int u=0;u<trc.length-1;u++)
   {
    employees temp;
    if(trc[u].gettenure()<trc[u+1].gettenure()){
   
    temp=trc[u];
    trc[u]=trc[u+1];
    trc[u+1]=temp;
    }       
   }
   }
   
   employees tremp[]=new employees[k];
   for(int i=0;i<k;i++)
   {
         NEW.add(trc[i]);
         tremp[i]=trc[i];
   }
   int p;
   for(int i=0;i<t;i++){
 for(p=0;p<tremp.length;p++)
 { if(e[i]==tremp[p]){break;}
     }
 if(p==tremp.length){
 HQ.add(e[i]);
 
 }
   }
   
   } 
    
}
