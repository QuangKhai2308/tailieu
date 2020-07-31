
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khai
 */
public abstract class Student implements studentExamole{
    Scanner sc = new Scanner(System.in);
    private String id;
    private String name;
    private int age;
    
    public Student() {
        
    }
    
    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    abstract public double getDiemTB();
    
     @Override
    public void input() {
         System.out.print("Nhập Id: ");
         id = sc.nextLine();
         System.out.println("Nhập tên: ");
         name = sc.nextLine();
         System.out.println("Nhập tuổi: ");
         age = Integer.parseInt(sc.nextLine());
         
    }

    @Override
    public void output() {
        System.out.println("Id: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }

    
}
