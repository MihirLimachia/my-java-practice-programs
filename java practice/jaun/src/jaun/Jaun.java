/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaun;
import com.jaunt.*;
/**
 *
 * @author ACER
 */
public class Jaun {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
/*        try{
  UserAgent userAgent = new UserAgent();     
  userAgent.visit("http://oracle.com");      
  System.out.println("Response:\n" + userAgent.response);  //print response data
  System.out.println(userAgent.doc.innerHTML());
        }
catch(ResponseException e){                                //catch HTTP/Connection error
  HttpResponse response = e.getResponse();                 //or check userAgent.response
  if(response != null){                                    //print response data field by field
    System.err.println("Requested url: " + response.getRequestedUrlMsg()); //print the requested url
    System.err.println("HTTP error code: " + response.getStatus());        //print HTTP error code
    System.err.println("Error message: " + response.getMessage());         //print HTTP status message
  }
  else{
    System.out.println("Connection error, no response!");
  }
}
 */       
                
        try{
  UserAgent userAgent = new UserAgent();  
  userAgent.settings.checkSSLCerts=false;
  userAgent.visit("https://10.100.56.55:8090");
            System.out.println("INNER HTML -\n\n");
  System.out.println(userAgent.doc.innerHTML());
   /*
  Element anchor = userAgent.doc.findFirst("<a href>");            //find 1st anchor element with an href attribute
  System.out.println("anchor element: " + anchor);                 //print the anchor element
  System.out.println("anchor's tagname: " + anchor.getName());     //print the anchor's tagname
  System.out.println("anchor's href attribute: " + anchor.getAt("href"));  //print the anchor's href attribute
  System.out.println("anchor's parent Element: " + anchor.getParent());    //print the anchor's parent element
   
  Element meta = userAgent.doc.findFirst("<head>").findFirst("<meta>");    //find 1st meta element in head section.
  System.out.println("meta element: " + meta);                     //print the meta element
  System.out.println("meta's tagname: " + meta.getName());         //print the meta's tagname
  System.out.println("meta's content attribute: " + meta.getAt("content"));//print the meta's content attribute
  System.out.println("meta's parent Element: " + meta.getParent());        //print the meta's parent element
}
  
  
  
 Element a=userAgent.doc.findFirst("<script language=\"JavaScript\">");
        a.innerHTML("var message = \"\";\n" +
"var status = \"LOGIN\";\n" +
"var ack = \"\";\n" +
"var userName = \"201401456\";\n" +
"userName = userName.replace(new RegExp(\"''\", 'g'),\"'\")\n" +
"var password = \"Mili2697@#\";\n" +
"var timer=\"\";\n" +
"var liveReqTimeInJS=180;");
       */

     //   System.out.println(userAgent.doc.innerHTML());
       
            System.out.println("\n\nTrying to login\n\n");
     userAgent.doc.fillout("userName","201456");
  userAgent.doc.fillout("password","Mi");
  userAgent.doc.submit("Login");
  System.out.println(userAgent.getLocation());
        }
         
catch(JauntException e){             
  System.err.println(e);         

         
}
    }
 
    
}


 
    