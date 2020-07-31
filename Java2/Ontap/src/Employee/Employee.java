/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.io.Serializable;

/**
 *
 * @author Khai2
 */
public class Employee implements Serializable{
    private String MaNV;
    private String FullName;
    private int Age;
    private String NgoaiNgu;
    private String AgeLaoDong;
    public Employee() {
    }

    public Employee(String MaNV, String FullName, int Age, String NgoaiNgu) {
        this.MaNV = MaNV;
        this.FullName = FullName;
        this.Age = Age;
        this.NgoaiNgu = NgoaiNgu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getNgoaiNgu() {
        return NgoaiNgu;
    }

    public void setNgoaiNgu(String NgoaiNgu) {
        this.NgoaiNgu = NgoaiNgu;
    }

    public String getAgeLaoDong(int Age) {
        if (Age < 16) {
            return "Chưa trưởng thành";
        } else if (Age < 40) {
            return "Tuổi trẻ";
        } else if (Age < 60) {
            return "Tuổi sắp về hưu";
        } else {
            return "Tuổi già";
        }
    }

    @Override
    public String toString() {
        return "Employee{" + "MaNV=" + MaNV + ", FullName=" + FullName + ", Age=" + Age + ", NgoaiNgu=" + NgoaiNgu + ", AgeLaoDong=" + AgeLaoDong + '}';
    }
    
    
    
    
    
}
