/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import java.io.Serializable;

/**
 *
 * @author Khai2
 */
public class SinhVien implements Serializable{
    protected int id;
    protected String Name, MaSV, Email, Password;
    protected float Marks;

    public SinhVien() {
        
    }

    public SinhVien(int id,String Name, String MaSV, String Email, String Password, float Marks) {
        this.id = id;
        this.Name = Name;
        this.MaSV = MaSV;
        this.Email = Email;
        this.Password = Password;
        this.Marks = Marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMaSV() {
        return MaSV;
    }

    public int getId() {
        return id;
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public float getMarks() {
        return Marks;
    }

    public void setMarks(float Marks) {
        this.Marks = Marks;
    }
    
    
}
