/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnu;

/**
 *
 * @author ACER
 */
import java.util.Random;
interface m{
public final int NO=4;
public final int YES=5;
public final int MAYBE=0;
public final int SURE=1;
public final int LATER=2;
public final int FUCKYO=3;
}
public class obj implements m{
int a=4;
Random r=new Random();
int p=(int)(100*r.nextDouble());
int ask(){
    if(p>0 && p<30)return YES;
    else  if(p>30 && p<40)return NO;
    else if(p>40 && p<50)return LATER;
    else if(p>50 && p<60)return FUCKYO;
    else if(p>60 && p<70)return SURE;
    else if(p>70)return MAYBE;
    else return 0;
}   
void answer(int k){
 switch(k){
     case YES:
     System.out.print("YES");break;
     
     case NO:
     System.out.print("NO");break;
     
 case LATER:
     System.out.print("LATER");break;
 case FUCKYO:
     System.out.print("FUCK YOU");break;
 case SURE:
     System.out.print("SURES");break;
     case MAYBE:
     System.out.print("MAYBE");break;
     default:
         System.out.print("default");break;
 }

}
}
