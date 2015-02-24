/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staircaseprinter;

/**
 *
 * @author ACER
 */
public class Staircaseprinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0;i<4;i++)
        {
            for(int l=0;l<2;l++){
              for(int k=0;k<3-i;k++)
            {
              System.out.print("    ");
            } 
           if(l==0){
              for(int j=0;j<i+1;j++)
              {
                  System.out.print("+---");
                  
              }
                  System.out.print("+\n");
           } 
           else{
                for(int j=0;j<i+1;j++)
                { System.out.print("|   ");
           
                        }
                System.out.print("|\n");
                        
              }
                     
            }                  
        }
        
        for(int i=0;i<4;i++){
        System.out.print("+---");        
        }
        System.out.print("+");
            }
    
}
