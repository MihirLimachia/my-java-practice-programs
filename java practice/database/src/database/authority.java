/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author ACER
 */
public class authority {
   
   public void getaccess(boolean state,person o[],int j){
   
   
   if(state==true){   
    if(o[j].accesssex().compareTo("male")==0 && o[j].accessage()>19){
        int x=0;
    for(int i=0;i<5;i++){
    if(o[i].accessage()>x && o[i].accesssex().equalsIgnoreCase("male")){
    x=o[i].accessage();
    }   
    }
    System.out.println("the oldest male's age is :"+x);
    }
    if(o[j].accesssex().compareTo("female")==0 && o[j].accessage()>19){
        int x=0;
    for(int i=0;i<5;i++){
if(i==j)continue;
        if(o[i].accessage()>o[j].accessage()){++x;}
    }
    System.out.println("people who are elder than you:"+x);
    }    
    if(o[j].accessage()<20){
    int x=0;
    String checknameforaddress="B-14 James, Avenue";
        for(int i=0;i<5;i++){
         if(o[i].accessadress().compareTo(checknameforaddress)==0){
         System.out.println(o[i].accessname());        
         }
         } 
    }
    }
    else{
    System.out.println("you are not authorised to access database");
    }
   
    }
   } 
    
    
    
    
    
    
    
    
    
    
    
    

