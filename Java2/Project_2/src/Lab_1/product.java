/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_1;

;
/**
 *
 * @author Khai
 */
public class product implements DAO{
    private String name;
    private double price;

    public product() {
    }
    
    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void insert() {
        System.out.println("Thêm mời thành công!!");
    }

    @Override
    public String toString() {
        return "+ Tên sản phẩm: " + name + "\n+ Đơn giá: " + price + "\n+ Thuế: " + getImportTax();
    }

    @Override
    public void update() {
        System.out.println("Thêm mời thành công!!");
    }

    @Override
    public void delete() {
        System.out.println("Thêm mời thành công!!");
    }

    @Override
    public void select() {
        System.out.println("Thêm mời thành công!!");
    }
   public double getImportTax(){
       return getPrice()*0.1;
   }
}
    
