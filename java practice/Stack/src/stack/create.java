/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author ACER
 */
public class create {
    int tos;
   int stack[]=new int[10];
    create(){
    tos=-1;
    }
 void push(int k){
     if(tos==9)return;
     stack[++tos]=k;
 } 
 void pop(){
     if(tos==-1)return;     
    System.out.print(stack[tos]+" ");
    tos--;
 }   
}
