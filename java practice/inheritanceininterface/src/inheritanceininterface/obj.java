/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritanceininterface;
interface a{
public void  m1();
}
interface b extends a{
public void m2();
}
interface c extends b{
public void m3();
}
/**
 *
 * @author ACER
 */
public class obj implements c{

    /**
     *
     */
    @Override
 public void m1(){
 System.out.println("imp m1");
 }
    @Override
 public void m2(){
 System.out.println("imp m2");
 }

    /**
     *
     */
    @Override
  public void m3(){
 System.out.println("imp m3");
 }
}
