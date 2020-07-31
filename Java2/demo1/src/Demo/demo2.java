/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.sql.Connection;
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
public class demo2 {

    public static void main(String[] args) {
        String UseName = "sa";
        String PassWord = "30082001H";
        String url = "jdbc:sqlserver://localhost\\DESKTOP-KFE677I:1433;databaseName=DEMO";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con =  DriverManager.getConnection(url, UseName, PassWord);
            Statement statement = con.createStatement();
            String query = "SELECT * FROM SINHVIEN";
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()){
                int Id = result.getInt("ID");
                String Name = result.getString("NAME");
                String MaSV = result.getString("MASV");
                String Email = result.getString("EMAIL");
                String Pass = result.getString("PASSWORD");
                
                System.out.println("ID: " + Id + "\n" + "Name: " + Name + "\n"
                + "MaSV: " + Name + "\n" + "Email: " + Email + "\n" + "Pass: " + Pass);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(demo2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(demo2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
