/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithu3;

import java.io.Serializable;

/**
 *
 * @author Khai2
 */
public class SinhVien implements Serializable{
    private String FullName;
    private String Majors;
    private double Marks;
    private String Date;

    public SinhVien() {
    }

    public SinhVien(String FullName, String Majors, double Marks, String Date) {
        this.FullName = FullName;
        this.Majors = Majors;
        this.Marks = Marks;
        this.Date = Date;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String Majors) {
        this.Majors = Majors;
    }

    public double getMarks() {
        return Marks;
    }

    public void setMarks(double Marks) {
        this.Marks = Marks;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "FullName=" + FullName + ", Majors=" + Majors + ", Marks=" + Marks + ", Date=" + Date + '}';
    }
    
    
}
