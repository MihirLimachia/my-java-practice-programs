/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panagram;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Panagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       DataInputStream in=new DataInputStream(System.in);
        String a=null;
        try{
      a=in.readLine();
        }
        catch(Exception e){}
        panagramcheck(a);    
    }
  public static void panagramcheck(String s){
  for(int i=0;i<s.length();i++){
  if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
  StringBuffer s1=new StringBuffer(s);
  char c=s.charAt(i);
  c=(char)(c+32);
  s1.setCharAt(i,c);
  s=s1.toString();
  }
  }
  int i;
  for(i=97;i<=122;i++){
  int f=0;
  int j=0;
     for(j=0;j<s.length();j++){
     if(s.charAt(j)==(char)i){
       f=1;
         break;
     }
     else{
     continue;
     }
     } 
   if(j==s.length() && f==0)break;   
  }
  if(i==123){
  System.out.print("pangram");
  }
  else{
  System.out.print("not pangram");
  }
  }
}
