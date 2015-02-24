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
public class chatroom {
    private static final int maxlogs=100;
    private String chatlogs[]=new String[maxlogs];
    private static int totchats=0;
    chatroom(){
    
    }
    public void write(String me){
    chatlogs[totchats]=me;
    totchats++;
    }
    public void printlog(){
    for(int i=0;i<totchats;i++){
    System.out.println(chatlogs[i]);
    }
    }
}
