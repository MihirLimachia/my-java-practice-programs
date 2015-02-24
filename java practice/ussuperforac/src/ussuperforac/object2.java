/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ussuperforac;

/**
 *
 * @author ACER
 */
public class object2 extends object{
    int i;
    object2(int m,int j)
    {
    i=j;
    super.i=m;
    }
void show(){
System.out.print(i+" "+super.i);
}

}
