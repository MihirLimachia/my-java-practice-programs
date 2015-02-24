/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triali;

import com.jaunt.UserAgent;
import com.jaunt.*;
/**
 *
 * @author ACER
 */
public class Triali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        try{
  UserAgent userAgent = new UserAgent();                       //create new userAgent (headless browser).
  System.out.println("SETTINGS:\n" + userAgent.settings);      //print the userAgent's default settings.
  userAgent.settings.autoSaveAsHTML = true;  //change settings to autosave last visited page.
 userAgent.settings.checkSSLCerts=false;
  userAgent.visit("https://10.100.56.55:8090");                        //visit a url.
 // String title = userAgent.doc.findFirst("<title>").getText();//get child text of title element.
//  System.out.println("\nOracle's website title: " + title);
  //print the title
//  System.out.println(userAgent.doc.innerHTML()); 
     String a=userAgent.doc.findFirst("<script language=\"JavaScript\">").getText();
System.out.println(a);
  
        }
        
catch(JauntException e){   //if title element isn't found or HTTP/connection error occurs, handle JauntException.
  System.err.println(e);         
}     

  /*      
        try{
  UserAgent userAgent = new UserAgent();                       
                                                                //open HTML from a String.
  userAgent.openContent("<html><body>WebPage <div>Hobbies:<p>beer<p>skiing</div> Copyright 2013</body></html>");
  Element body = userAgent.doc.findFirst("<body>");
  Element div = body.findFirst("<div>");
   
  System.out.println("body's text: " + body.);         //join child text of body element
  System.out.println("body's innerText: " + body.innerText());  //join all text within body element
  System.out.println("div's text: " + div.getText());           //join child text of div element
  System.out.println("div's innerText: " + div.innerText());    //join all text within the div element
}
catch(JauntException e){                         
  System.err.println(e);         
}
}
*/
    
}
}