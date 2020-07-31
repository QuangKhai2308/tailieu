/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exlab5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Khai2
 */
public class helper {
    public static void writeObject(String path, Object object) {
        try {
            //B1: Tạo đối tượng đọc/ghi
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            
            //B2: Thực hiện đọc ghi
            os.writeObject(object);

            os.flush();
            fos.flush();
            os.close();
            fos.close();
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
