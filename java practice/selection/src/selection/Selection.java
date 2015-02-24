/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Selection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner q=new Scanner(System.in);
        int a[]={1,2,3,4,5,6};
       int g=q.nextInt();
       int n=fac(a.length)/(fac((a.length)-g)*(fac(g)));
       int s[][]=new int[n][4];
       int m=0;
       for(int i=0;i<6;i++){         
            for(int j=i+1;j<6;j++){
                for(int k=j+1;k<6;k++){
                    for(int l=k+1;l<6;l++){
                        s[m][0]=a[i];
                        s[m][1]=a[j];
                        s[m][2]=a[k];
                        s[m][3]=a[l];              
                    m++;
                    }
                }
            }
          
       }
    
    for(int i=0;i<n;i++){
     for(int j=0;j<4;j++ ){
     System.out.print(s[i][j]);
     }
   System.out.println();
         }
    }
static int fac(int k){
int s=1;
    for(int l=1;l<k;l++)
    s=s*l;
return s;
}
}
