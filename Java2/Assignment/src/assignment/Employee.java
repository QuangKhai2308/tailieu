/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.Serializable;

/**
 *
 * @author Khai
 */
public class Employee implements Serializable{
    private String MaNV;
    private String FullName;
    private int Age;
    private String Email;
    private double Salary;

    public Employee() {
    }

    public Employee(String MaNV, String FullName, int Age, String Email, double Salary) {
        this.MaNV = MaNV;
        this.FullName = FullName;
        this.Age = Age;
        this.Email = Email;
         this.Salary = Salary;
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

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Employee{" + "MaNV=" + MaNV + ", FullName=" + FullName + ", Age=" + Age + ", Email=" + Email + ", Salary=" + Salary +  '}';
    }
    
    
}
