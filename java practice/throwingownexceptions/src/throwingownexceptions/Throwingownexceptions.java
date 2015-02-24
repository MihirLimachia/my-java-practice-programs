/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwingownexceptions;

/**
 *
 * @author ACER
 */
public class Throwingownexceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
try{
        comp(1);
        comp(20);
}
catch(MyException ex){
System.out.println(ex.tString());
}
    }
    static void comp(int p)throws MyException{
    if(p<10)
        try{
        throw new MyException(p);
        }
    finally{
            System.out.println(p);
            }
    }
    
}
