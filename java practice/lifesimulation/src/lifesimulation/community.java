/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifesimulation;

/**
 *
 * @author ACER
 */
public class community {

    String b[],c[];
  community(int n){
  c=b=new String[n];
  }     
  public void create(String a[]){
  for(int i=0;i<b.length;i++){
  c[i]=b[i]=a[i]; 
  } 
  }
  public void simulate(int k){
      int p=0,q=0,r=0,s=0,m=b.length,n=b[0].length(),e;
      for(e=0;e<k;e++){
      int countl[][]=new int[m][n];
  for(int i=0;i<m;i++){
      n=b[i].length();
      for(int j=0;j<n;j++){
          countl[i][j]=0;
      if(i==0){
      p=0;
      }
      else{
      p=i-1;
      }
      if(i==m-1){
      q=m-1;
      }
              
      else{
      q=i+1;
      }
      if(j==0){
      r=0;
      }
      else{
      r=j-1;
      }
      if(j==n-1){
      s=n-1;
      }
      else{
      s=j+1;
      }
   //   System.out.println(p+" "+q+" "+r+" "+s);
      for(int w=p;w<=q;w++){
      for(int u=r;u<=s;u++){
         if(w==i && u==j){continue;}
     if(b[w].charAt(u)=='*')countl[i][j]+=1;
      }
      }
        }
      }
  for(int i=0;i<m;i++)
      for(int j=0;j<b[i].length();j++)
      {   if(b[i].charAt(j)=='*'){
       if(countl[i][j]<=1){
 //          System.out.println(countl[i][j]);
      StringBuffer z=new StringBuffer(c[i]);
 //     for(int o=0;o<m;o++)
  //    System.out.println(c[o]);
      z.setCharAt(j,'-');
      c[i]=z.toString();
  //    for(int o=0;o<m;o++)
  //    System.out.println(c[o]);
           }
        if(countl[i][j]>=2 && countl[i][j]<=3){
  //          System.out.println(countl);
    StringBuffer z=new StringBuffer(c[i]);
//    for(int o=0;o<m;o++)
  //  System.out.println(c[o]);
      z.setCharAt(j, '*');
       c[i]=z.toString();
  //     for(int o=0;o<m;o++)
  //     System.out.println(c[o]);
    }
   }   
    if(b[i].charAt(j)=='-' && countl[i][j]==3){
 //       System.out.println(countl);
    StringBuffer z=new StringBuffer(c[i]);
  // for(int o=0;o<m;o++)
//    System.out.println(c[o]);
      z.setCharAt(j,'*');
      c[i]=z.toString();
   //   for(int o=0;o<m;o++)
   //   System.out.println(c[o]);
    }
      }      
  //    System.out.println(countl);
  
      
  for(int i=0;i<m;i++){
      b[i]=c[i];
  }    
      }
      
  for(int i=0;i<m;i++){
          System.out.println(b[i]);
  }
}
}
  
  

