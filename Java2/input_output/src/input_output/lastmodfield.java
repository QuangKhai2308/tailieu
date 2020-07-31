/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Khai
 */
public class lastmodfield {
    public static void main(String[] args) {
        File file = new File("E:/Java2/docfile/myfile.txt");
        Long lastModifield = file.lastModified();
        Date date = new Date(lastModifield);
        System.out.println(date);
    }
    
}
