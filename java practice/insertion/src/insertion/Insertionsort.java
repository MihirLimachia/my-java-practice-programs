



package insertion;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
  class insertion{  
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
        
   }
    public static void insertIntoSorted(int[] ar) {
        // Fill up this function 
        for(int k=1;k<ar.length;k++){
        int f=0;
        int n=ar[k];
        int i=k;
        for(;i>0;i--){
        if(ar[i-1]>n){
        ar[i]=ar[i-1];
        }
        if(ar[i-1]<=n){
        ar[i]=n;   
        break;
        }
       /* for(int j=0;j<ar.length;j++){
        System.out.print(ar[j]+" ");
        
        }
        */
       // System.out.println();
        }
        if(f==0 && i==0){
          ar[0]=n;
        }
        for(int j=0;j<ar.length;j++){
        System.out.print(ar[j]+" ");
        }       
        System.out.println();
        }
        }
      }