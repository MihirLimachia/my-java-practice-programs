/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingshpaes;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;        
/**
 *
 * @author ACER
 */
public class Drawingshpaes extends JComponent {

    /**
     * @param args the command line arguments
     */    
    void paintR(Graphics g){
         Rectangle a=new Rectangle(10,20,30,40);
    Graphics2D b=(Graphics2D)g;
    b.draw(a);
    }
}
