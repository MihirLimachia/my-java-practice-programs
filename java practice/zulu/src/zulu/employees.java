/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zulu;

/**
 *
 * @author ACER
 */
public class employees {
  private int id;
  private String name;
  private int tenure;
  private int salary;
public String  getname(){
return name;
}
public int getid(){
return id;
}
public int gettenure(){
return tenure;
}
  employees(int a,String b,int c,int d){
  id=a;
  name=b;
  tenure=c;
  salary=d; 
  } 
  employees(employees e){
  this.id=e.id;
  this.name=e.name;
  this.tenure=e.tenure;
  this.salary=e.salary;
  }
  
  
  
}
