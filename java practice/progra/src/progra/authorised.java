/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;

/**
 *
 * @author ACER
 */
public class authorised {
    private String name;
    private String sex;
    private int age;
    private String address;
    
    public void setname(String a){
    name =a;
    }
    
    public void setage(int a){
    age =a;
    }
    public void setsex(String a){
    sex =a;
    }
    public void setaddress(String a){
    address=a;
    }
    public String getname(){
    return(name);
    }
    public int getage(){
    return(age);
    }
    public String getaddress(){
    return(address);
    }
    public String getsex(){
    return(sex);
    }
    
    
    public int query1(person p[]){
    int c=0;
    for(int i=0;i<p.length;i++){
        
    if(p[i].getage()>this.age){
    c++;
    }
    }
    return c;
    
    
    }
    public int query2(person p[]){
    int max=this.getage();
      for(int i=0;i<p.length;i++){
      if(p[i].getage()>max){
      max=p[i].getage();
      }
      
      }  
        
       return max; 
    }
    public String query3(person p[],String a){
    String na="0";
    for(int i=0;i<p.length;i++){
    if(p[i].getaddress().compareTo(a)==0){
    na=p[i].getname();
    }    
    }
    if(na.compareTo("0")==0)return "not found";
    else return na;
    }
    
    
}
