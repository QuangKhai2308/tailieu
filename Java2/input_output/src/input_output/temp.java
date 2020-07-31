/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.io.File;

/**
 *
 * @author Khai
 */
public class temp {
    public static void main(String[] args) {
        File file = null;
        try {
            file = File.createTempFile("TempFile",".txt", new File("E:/Java2/docfile"));
            System.out.println("File path: " + file.getAbsolutePath());
            file.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        File dir = new File("E:/");
    
    }
}
