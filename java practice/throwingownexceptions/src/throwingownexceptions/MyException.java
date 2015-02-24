/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwingownexceptions;
import java.lang.Exception;
/**
 *
 * @author ACER
 */
public class MyException extends Exception{
    private int a;
    MyException(int b){
    a=b;
    }
 public String tString(){
    return ("the number"+a+"is less than 10");
    }
}
