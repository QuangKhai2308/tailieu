
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
public class StudentNS  extends  Student{
    Scanner sc = new Scanner(System.in);
    private double diemNS;
    private double diemIT;

    public StudentNS() {
        
    }
    public StudentNS(double diemNS, double diemIT, String id, String name, int age) {
        super(id, name, age);
        this.diemNS = diemNS;
        this.diemIT = diemIT;
    }
    @Override
     public void input() {
         super.input();
         System.out.println("Nhập diemNS: ");
         diemNS = Double.parseDouble(sc.nextLine());
         System.out.println("Nhập diemIT: ");
         diemIT = Double.parseDouble(sc.nextLine());
         
    }

    @Override
    public void output() {
        super.output();
        System.out.println("diemNS: " + diemNS);
        System.out.println("diemNS: " + diemIT);
    }
    
    public double getDiemNS() {
        return diemNS;
       
    }

    public void setDiemNS(double diemNS) {
        this.diemNS = diemNS;
    }

    public double getDiemIT() {
        return diemIT;
    }

    public void setDiemIT(double diemIT) {
        this.diemIT = diemIT;
    }
    @Override
    public double getDiemTB() {
        return (diemNS + diemIT)/2;
    }
    
    @Override
    public String toString() {
        return "StudentNS{"+ "id=" +this.getId()+ ", name=" + this.getName()+ ", age=" + this.getAge() + "diemNS=" + diemNS + ", diemIT=" + diemIT +"diemTB="+ getDiemTB() + '}';
    }

    
}
