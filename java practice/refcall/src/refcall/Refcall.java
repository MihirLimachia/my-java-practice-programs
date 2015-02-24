/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refcall;

/**
 *
 * @author ACER
 */
public class Refcall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Objec o1=new Objec(10,20);
        o1.Turn(o1);
        System.out.print(o1.p+" "+o1.q);
    }
    
}
