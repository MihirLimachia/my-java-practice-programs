/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrpb1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hrpb1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner a=new Scanner(System.in);
    String n1=a.next();
    int m=0;
    int n=0;
    int count[]=new int[100000];
    String n2=a.next();
    for(int k=0;k<n1.length();k++){
    for(int i=k;i<n1.length();i++){
    for(int j=m;j<n2.length();j++){
    if(n1.charAt(i)==n2.charAt(j)){m=j+1;count[n]++;break;}    
    }    
    }
    m=0;
    n++;
    }
    m=0;
     for(int k=0;k<n2.length();k++){
    for(int i=k;i<n2.length();i++){
    for(int j=m;j<n1.length();j++){
    if(n2.charAt(i)==n1.charAt(j)){m=j+1;count[n]++;break;}    
    }    
    }
    m=0;
    n++;
    }
     int max=0;
     for(int i=0;i<count.length && count[i]!=0;i++)if(count[i]>max)max=count[i];
    System.out.println(max);
    }
}
