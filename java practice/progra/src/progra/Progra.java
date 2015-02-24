/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;
import java.io.*;
import java.util.*;
/**
 *
 * @author ACER
 */
public class Progra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File  f=new File("C:\\Users\\ACER\\Desktop\\pir.dat");
       person p[]=new person[100];
       authorised ap[]=new authorised[100];
       int i=0,j=0;
       boolean isauthority=false;
        try{
        Scanner a=new Scanner(f);
        while(a.hasNextLine()){
        p[i]=new person();
        p[i].setname(a.nextLine());
        String w=a.nextLine();
        if(w.endsWith("yes"))isauthority=true;
        p[i].setsex(a.nextLine());
        p[i].setage(Integer.parseInt(a.nextLine()));
        p[i].setaddress(a.nextLine());
        if(isauthority){
        ap[j]=new authorised();    
        ap[j].setname(p[i].getname());
        ap[j].setage(p[i].getage());
        ap[j].setsex(p[i].getsex());
        ap[j].setaddress(p[i].getaddress());
        j++;
        }
        i++;
        }
        
        }
        catch(FileNotFoundException e){
        System.out.println("file not found");
        }
        for(int k=0;k<ap.length;k++){
        if(ap[k].getsex().compareTo("female")==0){
        System.out.println(ap[k].query1(p));
        }
        if(ap[k].getsex().compareTo("male")==0){
        System.out.println(ap[k].query2(p));
        }
        if(ap[k].getage()<21){
        System.out.println(ap[k].query3(p,"B-19 James, Avenue"));
        }
        }
        
    }
    
}
