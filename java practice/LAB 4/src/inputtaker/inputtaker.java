/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputtaker;
import java.io.DataInputStream;
/**
 *
 * @author ACER
 */
public class inputtaker {
    
    public static void main(String ar[]){
    DataInputStream a=new DataInputStream(System.in);
    String s[]=new String[5];
    String s1[]=new String[3];
    String s2[][]=new String[5][20];
    for(int i=0;i<5;i++){
    try{
    s[i]=a.readLine();
    }
    catch(Exception e){};
    }
    int m=0,p=0;   
 
          for(int j=0;j<s[0].length();j++){
          if(s[0].charAt(j)==' '){
          s1[m]=s[0].substring(p, j);
          p=j+1;
          m++;
          }
          if(j==s[0].length()-1){
          s1[m]=s[0].substring(p,j+1);
          m++;
          }     
          }            
     
    user u[]=new user[m];
      for(int i=0;i<m;i++)
      {
          u[i]=new user();
      u[i].name=s1[i];     
      }
    for(int i=1;i<5;i++)
    {  int count=0;
        for(int j=0;j<m;j++)
        for(int k=0;k<m;k++){
        if(k==j)continue;
        if(s[i].startsWith(u[j].name+" ") && s[i].contains(u[k].name+":"))
    {

       u[j].messagesent(s[i].replace(u[j].name+" ",""));
       s[i]=s[i].replace(u[j].name+" ",u[j].name+":");
       u[k].recievemessage(s[i].replace(u[k].name+":",""));
        count++;
             
    }
    }
    for(int k=0;k<m;k++){
     if(s[i].compareTo(u[k].name)==0){
    String sm[]= u[k].getsentmessages();
    String rm[]=u[k].getrecievedmessages();
    //int count=0;
    System.out.println(u[k].name+"'s sent messages");
     for(int h=0;h<sm.length;h++){
         if(sm[h]==null)continue;
     System.out.println(sm[h]); 
   //  System.out.print(count);
     }
         System.out.println(u[k].name+"'s recieved messages");
      for(int h=0;h<rm.length;h++){
      if(rm[h]==null)continue;
     System.out.println(rm[h]); 
   //  System.out.print(count);
     }
     }
    }   
}
}
}