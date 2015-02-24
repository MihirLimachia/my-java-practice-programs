/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuhsj;

/**
 *
 * @author ACER
 */
public class engine {
    private int piston;
    private int strokes;
    private boolean oilCondiion;
    private boolean pistonCondition;
    private boolean overAllCondiion;
    public engine(boolean oil,boolean piston,int noOfPiston,int noOfStroke){
    this.oilCondiion=oil;
    this.pistonCondition=piston;
    this.piston=noOfPiston;
    this.strokes=noOfStroke;
    }
    
}
