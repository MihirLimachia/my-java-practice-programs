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
public class Database {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        person o[]=new person[5];
        o[0]=new person("marry robinson","yes","female",32,"B-14 JAMES AVENUE");
        o[1]=new person("Dorothy Dickson","no","female",53,"C/34, Reed Street");
        o[2]=new person("Charles Crusoe","no","male",39,"B-19 James, Avenue");
     o[3]=new person("Peter Jackson","yes","male",14,"17/24, Park Street");
    o[4]=new person("Joe Robinson","yes","male",24,"B-14 James, Avenue");    
    for(int j=0;j<5;j++){ 
    System.out.println("ACCESSING FOR:"+o[j].accessname());    
    boolean state=o[j].requestaccess();
    authority a=new authority();
    a.getaccess(state, o,j);
    }
    }    
}
