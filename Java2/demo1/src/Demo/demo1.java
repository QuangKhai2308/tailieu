/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Khai2
 */
public class demo1 {
    Connection con;
    String hosting = "jdbc:sqlserver://localhost\\DESKTOP-KFE677I:1433;databaseName=QLNT";
    String username = "sa";
    String password = "30082001H";
    private void ketnoi() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(hosting, username, password);
    }
    public static void main(String[] args) {
        demo1 main = new demo1();
        try {            
            main.ketnoi();
            main.updata();
            System.out.println("Successfully");
        } catch (ClassNotFoundException ex) {
            System.out.println("False: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("False: " + ex.getMessage());
        }
        
    }
    private void updata() throws SQLException {
        String sql = "SELECT * FROM NHATRO";
        Statement stt = con.createStatement();
        ResultSet rs = stt.executeQuery(sql);
        
        while(rs.next()) {
            String id = rs.getString("MaNT");
            int dienTich = rs.getInt("DienTich");
            double giaPhong = rs.getDouble("GiaPhong");
            String DiaChi_NT = rs.getString("DiaChi_NT");
            String Quan = rs.getString("Quan");
            String NgayDang = rs.getString("NgayDang");
            String MaLN = rs.getString("MaLN");
            String MaND = rs.getString("MaND");
            System.out.println("ID: " + id + "\n" + "Diện tích: " + dienTich + "\n" + 
                    "Giá phòng: " + giaPhong + "\n" + "Địa chỉ: " + DiaChi_NT + 
                    "\n" + "Quận: " + Quan + "\n" + "Ngày đăng: " + NgayDang + "\n" +
                    "Mã loại nhà: " + MaLN + "\n" + "Mã người dùng: " + MaND);
        }
    }
}
