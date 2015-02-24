/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trial;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/**
 *
 * @author ACER
 */
public class Trial {

    /**
     * @param args the command line arguments
     */
   
       static ArrayList<person> l1=new ArrayList<>(); 
        public static void main(String ap[]){
        for(int i=0;i<4;i++){
            person a=new person();
                a.setname("turameremome");
                a.setage(10);
            l1.add(a);
        }
        for(int i=0;i<l1.size();i++)
        { System.out.println(l1.get(i).getname());
          System.out.println(l1.get(i).getage());
        }
          List l2=l1.subList(1,3);
        for(int i=0;i<l2.size();i++){
        System.out.println(l1);
        }
            
    
    
}
}