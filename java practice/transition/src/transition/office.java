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
public class office {  
    private String name;
    private employees e[];
    office(String a){
    name=a;
    }
    public void setemployees(employees e[]){
    this.e=e;
    }
    public void getemployees(){
    System.out.println(this.name);
    for(int i=0;i<e.length;i++){
        System.out.println(e[i].getid());
    }    
    }
    
}
