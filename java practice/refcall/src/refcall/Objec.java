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
public class Objec {
    int p,q;
    Objec(int a,int b){
      p=a;
      q=b;    
    }
  void Turn(Objec o){
    o.p*=2;
    o.q*=3;   
    }
}
