/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingabstractclass;

/**
 *
 * @author ACER
 */
public class usingabstractclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        defa o1;
        rec o2=new rec(10,20);
        tria o3=new tria(10,20);
        o1=o2;
        System.out.println(o1.vol());
        o1=o3;
        System.out.print(o1.vol());
    }
    
}
