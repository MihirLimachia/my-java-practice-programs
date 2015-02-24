/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputtaker;

/**
 *
 * @author ACER
 */
public class substringenerate{ 
     String fl;
     String f3[]=new String[3];
    String f2[]=new String[3];
    substringenerate(String f){
    fl=f;
    }
    
    public String[] generate(){
       
        int j=0,k=0,m=0,count=0;
      for(int i=0;i<fl.length();i++){
      if(fl.charAt(i)==' ')count++;
      }
      String f2[]=new String[count+1];
      for(int i=0;i<fl.length();i++){
      if(fl.charAt(i)==' '){          
      f2[j]=fl.substring(m, i);
      if(i!=fl.length()-1) m=i+1;
       j++;
      }
      if(i==fl.length()-1){
      f2[j]=fl.substring(m,fl.length());
      j++;
      }
      }
     
     return this.f2;
    }
    

}
