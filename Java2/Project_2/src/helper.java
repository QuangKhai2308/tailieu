
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    public static Object readObject(String path) {
        try {
             FileInputStream fis = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(fis);
             Object obj = ois.readObject();
             ois.close();
             fis.close();
             
             return obj;
             
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
