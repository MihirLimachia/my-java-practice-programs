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
public class firm {
    private String name;
    private employees employee_list[];
    firm(String name,int k){
    this.name=name;
    employee_list=new employees[k]; 
    }
    int i=0;
    public void add(employees e){
        employee_list[i]=new employees(e);
    i++;
    }
    public void getemployeelist(){
        for(int i=0;i<employee_list.length;i++)
         System.out.println(employee_list[i].getid());    
    }
}
