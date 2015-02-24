/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceandabstractclass;

/**
 *
 * @author ACER
 */
interface p{
public void show();
void call();
}
abstract public class object implements p {
    int a=2,b=4;
    @Override
    public void show(){ 
    System.out.print(a+" "+b);
    }    
}
