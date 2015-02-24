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
public class handler {
    private String a[];
    private int m,k;
    private int id[]; 
    private office HQ;
    private office NEW;
    handler(String p[],int m,int k,int id[],office HQ,office NEW){
    this.a=p;
    this.m=m;
    this.k=k;
    this.id=id;
    this.HQ=HQ;
    this.NEW=NEW;
 //  System.out.println(a.length);
  // System.out.println(id.length);
    }
    
    public void deal(){
    employees e[]=new employees[a.length];
    String t[][]=new String[a.length][4];
    for(int i=0;i<a.length;i++){
       e[i]=new employees();
        t[i]=a[i].split(", ");
        for(int j=0;j<t[i].length;j++)
        {   
       //System.out.println(t[i][j]);
       
          if(j==0)e[i].setid(Integer.parseInt(t[i][j]));
          if(j==1)e[i].setname(t[i][j]);
          if(j==3)e[i].setsalary(Integer.parseInt(t[i][j]));
          if(j==2)e[i].settenure(Integer.parseInt(t[i][j]));
        }  
        
        
    }
      
      divider d=new divider(e,id,m,k);
      d.getpeoplesorted(HQ,NEW);
        
        
    }
   
    
}
