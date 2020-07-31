
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khai2
 */
public class Product_Info implements Serializable{
    private String Computer_ID;
    private String Computer_Name;
    private String Email_Suport;
    private String YearMark;

    public Product_Info() {
    }

    public Product_Info(String Computer_ID, String Computer_Name, String Email_Suport, String YearMark) {
        this.Computer_ID = Computer_ID;
        this.Computer_Name = Computer_Name;
        this.Email_Suport = Email_Suport;
        this.YearMark = YearMark;
    }

    public String getComputer_ID() {
        return Computer_ID;
    }

    public void setComputer_ID(String Computer_ID) {
        this.Computer_ID = Computer_ID;
    }

    public String getComputer_Name() {
        return Computer_Name;
    }

    public void setComputer_Name(String Computer_Name) {
        this.Computer_Name = Computer_Name;
    }

    public String getEmail_Suport() {
        return Email_Suport;
    }

    public void setEmail_Suport(String Email_Suport) {
        this.Email_Suport = Email_Suport;
    }

    public String getYearMark() {
        return YearMark;
    }

    public void setYearMark(String YearMark) {
        this.YearMark = YearMark;
    }

    @Override
    public String toString() {
        return "Product_Info{" + "Computer_ID=" + Computer_ID + ", Computer_Name=" + Computer_Name + ", Email_Suport=" + Email_Suport + ", YearMark=" + YearMark + '}';
    }
    
    
}
