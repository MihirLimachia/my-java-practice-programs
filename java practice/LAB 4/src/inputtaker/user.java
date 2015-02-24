/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputtaker;

/**
 *
 * @author ACER
 */
public class user {
    String name;
    String handle;
    String messagerecieved[]=new String[10];
    String messagesent[]=new String[10];
    static int i=0,j=0;
 /*   user(String a,String b){
    name=a;
    handle=b;    
    }
    */
            void recievemessage(String message){              
    messagerecieved[i]=message;
    i++;
    }
    void messagesent(String message){
    messagesent[j]=message;
    j++;
    }
    String[] getrecievedmessages(){       
    return messagerecieved;
    }
    String[] getsentmessages(){          
    return messagesent;
    }
}
