/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ballapp;

/**
 *
 * @author ACER
 */
public class BallApp extends javax.swing.JFrame {

    /**
     * @param args the command line arguments
     */
    public BallApp(){
    new Demos.Bounce.BouncingBall();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new BallApp()
    }
    
}
