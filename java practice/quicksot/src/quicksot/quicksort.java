/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksot;

import java.util.*;
public class quicksort {
       
          static void partition(int[] ar) {
          int b[]=new int[ar.length];
          int c[]=new int[ar.length];
          int n=ar[0];
          int n1=0,n2=0;  
          for(int i=1;i<ar.length;i++){
          if(ar[i]>n){
          b[n1]=ar[i];
          n1++;
          }
          else{
          c[n2]=ar[i];
          n2++;
          }             
          } 
          int m=0;
          int f;
          for(f=0;f<n2;f++){
          ar[f]=c[f];
          }
          ar[f]=n;
          f++;
          for(int j=0;j<n1;j++){
          ar[f]=b[j];
          f++;
          }
          for(int i=0;i<ar.length;i++){
          System.out.print(ar[i]+" ");
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
           partition(ar);
       }    
   }

