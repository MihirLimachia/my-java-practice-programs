/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp;
import java.util.Random;
/**
 *
 * @author ACER
 */
public class user {
    private static int autoid=0;
    private int id;
    private chatroom assignedchatroom;
    private static final int MAXMESSAGELENGTH=100;
    user(chatroom c){
    id=autoid;
    autoid++;
    assignedchatroom=c;
    }
    
    public void write_message(){
    String message="["+id+"]";
    Random a=new Random();
    String alphabet="abcdefghijklmnopqrstuvwxyz";
    int l=a.nextInt(MAXMESSAGELENGTH);
    for(int i=0;i<l;i++){     
    message+=alphabet.charAt(a.nextInt(alphabet.length()));
    }
    assignedchatroom.write(message);
    }

}
