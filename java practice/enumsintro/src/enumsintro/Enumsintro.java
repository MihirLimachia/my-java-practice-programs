/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumsintro;

/**
 *
 * @author ACER
 */
enum  apple{
a(0),b(9),c(10),de(16);
private int price;
apple(int p){
this.price=p;
}
int getprice(){
return price;
}
}
public class Enumsintro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 apple ap;
 ap=apple.a;
 apple apq[]=apple.values();
 for(int i=0;i<apq.length;i++)
 System.out.println(apq[i]+" "+apq[i].getprice());
    }
 
 
        
}
