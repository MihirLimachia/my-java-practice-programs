/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;
import java.util.*;
public class quicksort {
       
          static void quickSort(int[] ar) {
              int ni=ar[0];
             for(int k=0;k<ar.length;k++){
              int max[]=new int[ar.length];
                            int min[]=new int[ar.length];
               int m=0,p=0;
               int n=ar[k];
              for(int i=0;i<ar.length;i++){
                if(i==k)continue;
                  if(ar[i]>n)
              {
              max[m]=ar[i];
              m++;
              }
              else{
              min[p]=ar[i];
              p++;
              }
              }
              int i=0;
             for(i=0;i<p;i++){
             ar[i]=min[i];             
             }
             ar[i]=n;
             i++;
             for(int j=0;j<m;j++){
             ar[i]=max[j];
             i++;
             }
             }
             int i;
       for(i=0;i<ar.length;i++){
         if(ar[i]==ni)break;
           System.out.print(ar[i]);
       }
          
          System.out.println();
          for(int j=i+1;j<ar.length;j++)System.out.print(ar[j]);
       System.out.println();   
           for(i=0;i<ar.length;i++){
System.out.print(ar[i]);
}
          } 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           quickSort(ar);
       }    
  

}
    

