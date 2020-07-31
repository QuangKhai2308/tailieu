
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
public class Student implements Serializable{
    private int ID;
    private String FullName;
    private int Age;
    private String Address;
    private double AvgMarks;

    public Student() {
    }

    public Student(int ID, String FullName, int Age, String Address, double AvgMarks) {
        this.ID = ID;
        this.FullName = FullName;
        this.Age = Age;
        this.Address = Address;
        this.AvgMarks = AvgMarks;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getAvgMarks() {
        return AvgMarks;
    }

    public void setAvgMarks(double AvgMarks) {
        this.AvgMarks = AvgMarks;
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", FullName=" + FullName + ", Age=" + Age + ", Address=" + Address + ", AvgMarks=" + AvgMarks + '}';
    }
    
    
}
