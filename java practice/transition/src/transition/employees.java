/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transition;

/**
 *
 * @author ACER
 */
public class employees {
    private String name;
    private int id;
    private int tenure;
    private int salary;
    private office o;
    public void getcopyofemployee(employees e){
    this.name=e.getname();
    this.id=e.getid();
    this.tenure=e.gettenure();
    this.salary=e.getsalary();
    }
    public void setname(String a){
    name=a;
    }
    public void setid(int a){
    id=a;
    }
    public void settenure(int a){
    tenure=a;
    }
    public void setsalary(int a){
    salary=a;
    }
    public String getname(){
    return name;
    }
    public int getid(){
    return id;
    }
    public int gettenure(){   
     return tenure;   
    } 
    public int getsalary(){    
    return salary;
    }
    public void setoffice(office o){
    this.o=o;
    }
    
}
