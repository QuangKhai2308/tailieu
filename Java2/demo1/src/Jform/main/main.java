/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jform.main;

/**
 *
 * @author Khai2
 */
public class main {
    public static void main(String[] args) 
    { 
        // Printing Name of the system property 
        System.out.println("user.dir: "+System.getProperty("user.dir")); 
  
        // Fetches the property set with 'home' key 
        System.out.println("home: "+System.getProperty("home")); 
        // Resulting in Null as no property is present 
  
        // Printing 'name of Operating System' 
        System.out.println("os.name: "+System.getProperty("os.name")); 
  
        // Printing 'JAVA Runtime version' 
        System.out.println("version: "+System.getProperty("java.runtime.version" )); 
  
        // Printing 'name' property 
        System.out.println("name: "+System.getProperty("name" )); 
        // Resulting in Null as no property is present 
    } 
}
