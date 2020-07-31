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
public class sizeFile {
    public static long getFileSize(String fileName){
        File file = new File(fileName);
        if (!file.exists() || !file.isFile()) {
            System.out.println("File does exitst");
            return -1;
        }
        return file.length();
    }
    public static void main(String[] args) {
        long checkSize = getFileSize("E:/Java2/docfile/demo1.txt");
        System.out.println("FileSize in bytes: " + checkSize);
    }
}
