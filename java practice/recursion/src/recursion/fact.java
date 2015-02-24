/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author ACER
 */
public class fact {
    int facto(int n){
    if(n==1)return 1;    
    return(facto(n-1)*n);
    }
}
