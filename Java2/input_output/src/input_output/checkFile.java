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
public class checkFile {
    public static void main(String[] args) {
        File file = new File("E:/Java2/docfile/myText.txt");
        System.out.println(file.exists());// true: là file đã được khởi tạo
    }
}
