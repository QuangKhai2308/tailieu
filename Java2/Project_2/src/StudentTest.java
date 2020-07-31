
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khai
 */
public class StudentTest implements Serializable{
    private String FullName;
    private int Age;
    private String Lop;

    public StudentTest() {
    }

    public StudentTest(String FullName, int Age, String Lop) {
        this.FullName = FullName;
        this.Age = Age;
        this.Lop = Lop;

    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "StudentTest{" + "FullName=" + FullName + ", Lop=" + Lop + ", Age=" + Age + '}';
    }

    
    
    
    
    
}
