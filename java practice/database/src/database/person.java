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
public class person {
 private String name;
 private String authority;
 private String sex;
 private int age;
 public static int members;
 private String address;

 person(String name,String authority,String sex,int age,String address){
 this.name=name;
 this.authority=authority;
 this.sex=sex;
 this.age=age;
 this.address=address;
 members++;
 } 
boolean requestaccess(){
if(authority.equalsIgnoreCase("yes")) {   
return true;
    }
else return false;
}
String  accessname(){
return name;    
}
String accessadress(){
return address;
}
int  accessage(){
return age;
}
String accesssex(){
return sex;
}
}
