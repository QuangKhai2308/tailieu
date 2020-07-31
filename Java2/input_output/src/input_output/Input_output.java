/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Khai
 */
public class Input_output {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File file = new File("E:/Java2/docfile/myfile.txt");
            if (file.createNewFile()) {
                System.out.println("Success!");
            } else {
                System.out.println("Error, File arready exitst");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
}
