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
public class renameFile {
    public static void main(String[] args) {
        File oldFile = new File("E:/Java2/docfile/TempFile1319190060844801053.txt");
        File newFile = new File("E:/Java2/docfile/Rename.txt");
        if (oldFile.renameTo(newFile)) {
            System.out.println("Success");
        }else {
            System.out.println("Error");
        }
    }
}
