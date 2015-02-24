/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transition;

/**
 *
 * @author ACER
 */
public class divider {
    private employees e[];
    private employees etr[];
    private employees eh[];
    employees en[];
    int id[];
    int tobetransfered;
    divider(employees e[],int id[],int m,int k){
    this.e=e;
    etr=new employees[m];
    eh=new employees[e.length-k];
    en=new employees[k];
    this.id=id;
    this.tobetransfered=k;
    }
    public void getpeoplesorted(office HQ,office NEW){
  int m=0,n=0,l=0;
  
        for(int i=0;i<e.length;i++){
        for(int j=0;j<id.length;j++){ 
        if(e[i].getid()==id[j]){
         etr[m]=new employees();
            etr[m].getcopyofemployee(e[i]);
        m++;
        }
        }
        }       
        for(int i=0;i<etr.length;i++){
        for(int j=0;j<etr.length-i-1;j++)
        {
            if(etr[j].gettenure()<etr[j+1].gettenure()){
            employees t;
            t=etr[j+1];
                etr[j+1]=etr[j];
                etr[j]=t;
            }
            if(etr[j].gettenure()==etr[j+1].gettenure() && etr[j].getsalary()<etr[j+1].getsalary()){
            employees t;
            t=etr[j+1];
                etr[j+1]=etr[j];
                etr[j]=t;
            }
            
        }
        }
        for(int i=0;i<etr.length;i++){
        
    //    System.out.println(etr[i].gettenure());
        }
       
       for(int i=0;i<tobetransfered;i++)
       {
         en[n]=new employees();
         en[n].getcopyofemployee(etr[i]);
         n++;
       }
        
       for(int i=0;i<e.length;i++){
       int j=0;
           for(j=0;j<en.length;j++){
           if(e[i].getid()==en[j].getid())break;         
           }
           if(j==en.length){
           eh[l]= new employees();
           eh[l].getcopyofemployee(e[i]);
           l++;
           }       
       }
       HQ.setemployees(eh);
       NEW.setemployees(en);
       
       
    }
    
    
    
}
