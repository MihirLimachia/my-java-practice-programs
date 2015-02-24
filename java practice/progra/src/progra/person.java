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
public class person {
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
}
