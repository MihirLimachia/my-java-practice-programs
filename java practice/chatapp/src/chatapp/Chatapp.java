/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp;

/**
 *
 * @author ACER
 */
public class Chatapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        chatroom c1=new chatroom();
        user u1=new user(c1);
        user u2=new user(c1);
        for(int i=0;i<10;i++){
          u1.write_message();
          u2.write_message();
        }
        c1.printlog();
    }
}
