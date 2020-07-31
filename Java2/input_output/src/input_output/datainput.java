/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Khai2
 */
public class datainput {
    public static void main(String[] args) throws IOException{
        FileInputStream fileInput = new FileInputStream("a.txt");
        DataInputStream dataInput = new DataInputStream(fileInput);
        int items = dataInput.readInt();
        for (int i = 0; i < items; i++) {
            int n = dataInput.readInt();
            System.out.println(n + "");
        }
        System.out.println(dataInput.readUTF());
        System.out.println(dataInput.readDouble());
        dataInput.close();
    }
}
