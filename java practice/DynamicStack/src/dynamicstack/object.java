/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicstack;

/**
 *
 * @author ACER
 */
interface Stack{
public void push(int k);
public void pop();
}
public class object implements Stack {
private int tos;
public  int Stck[];
    object(int size){
 Stck=new int[size];
 tos=-1;
 }
@Override
    public void push(int k)
    {
     if(tos==Stck.length){
     }
     else Stck[++tos]=k;      
    }
@Override
    public void pop(){
    
    if(tos<0){
    System.out.print("Stack empty");
    }
    else{
    System.out.print(Stck[tos--]);
    }
    }
}
