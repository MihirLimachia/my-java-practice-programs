/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutday2;
interface a{
final int b=5;
public int give(int b);
}
/**
 *
 * @author ACER
 */
public class Tutday2 implements a{
    /**
     * @param args the command line arguments
     */
    public int give(int c){
    return (c*c*c);
    }    
}
