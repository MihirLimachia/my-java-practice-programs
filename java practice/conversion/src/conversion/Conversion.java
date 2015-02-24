/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

/**
 *
 * @author ACER
 */
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int a=5137,k,i=0;
      int b[]=new int[4];
      while(a>0){
   k=a%10;
   b[i]=0;
          if(k>6 || k==6)
        {
            b[i]=1000;    
            k=k-6;   
                }
          if(k>3 || k==3){
            b[i]=b[i]+100;        
           k=k-3;
          }
          if(k>1 || k==1){
          b[i]=b[i]+1;
          k=k-1;
          }
          if(k==1 || k>1){
              k=k-1;
          b[i]+=10;
          }
     a=a/10;  
     i++;
      }
      for(int l=3;l>-1;l--){
          if(b[l]>0 && b[l]<10){System.out.print("000");}
       else if(b[l]>9 && b[l]<100){System.out.print("00");}
                  else {
                          if(b[l]>99 && b[l]<1000){System.out.print("0");
                          }
                          }
      System.out.print(b[l]+" ");
      }
    }    
}
