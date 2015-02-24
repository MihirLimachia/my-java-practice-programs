/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackv;

/**
 *
 * @author ACER
 */
public class Stackv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack o1=new Stack(3);
        for(int i=0;i<3;i++){
        o1.push(i);
        }
        for(int i=0;i<3;i++){
        System.out.print(o1.pop()+" ");
        }
    }
    
}
