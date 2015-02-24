/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;
interface b{
public void callme(int a);
final int a=4;
} 
/**
 *
 * @author ACER
 */
public class object implements b {

    /**
     *
     * @param a
     */
    @Override
public void callme(int a){
    System.out.println("call me at:"+a);
    }
}
