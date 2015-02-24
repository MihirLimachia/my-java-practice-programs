/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec2;

/**
 *
 * @author ACER
 */
public class obj {
    int a[]=new int[10];
    void create(){
    for(int i=0;i<10;i++){
    a[i]=i;
    }    
    }
    void traverse(int k){
     if(k==0)return;
     traverse(--k);
    System.out.print(a[k]);
     
    }
}
