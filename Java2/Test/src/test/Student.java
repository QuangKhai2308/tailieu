/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;

/**
 *
 * @author Khai2
 */
public class Student implements Serializable{
    private String MaSV;
    private String FullName;
    private String Grender;
    private double MarksAvg;

    public Student() {
    }

    public Student(String MaSV, String FullName, String Grender, double MarksAvg) {
        this.MaSV = MaSV;
        this.FullName = FullName;
        this.Grender = Grender;
        this.MarksAvg = MarksAvg;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getGrender() {
        return Grender;
    }

    public void setGrender(String Grender) {
        this.Grender = Grender;
    }

    public double getMarksAvg() {
        return MarksAvg;
    }

    public void setMarksAvg(double MarksAvg) {
        this.MarksAvg = MarksAvg;
    }
    
    public String getRank(double Marks) {
        if (Marks >= 5) {
            return "Đạt" ;   
        } else {
            return "Trượt";
        }
    }

    @Override
    public String toString() {
        return "Student{" + "MaSV=" + MaSV + ", FullName=" + FullName + ", Grender=" + Grender + ", MarksAvg=" + MarksAvg + '}';
    }
    
    
}
