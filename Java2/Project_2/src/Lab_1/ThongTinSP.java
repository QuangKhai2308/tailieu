/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khai
 */
public class ThongTinSP {
    ArrayList<product> ListPr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void NhapTT(){
        System.out.println("-----Nhập Thông Tin Đơn Hàng-----");
        while(true){
        System.out.printf("Mời bạn nhập Tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.printf("Mời bạn nhập đơn giá: ");
        double donGia = Double.parseDouble(sc.nextLine());
        ListPr.add(new product(name, donGia));
        System.out.printf("Bạn có muốn nhập tiếp không? Yes/No : ");
        if(sc.nextLine().equalsIgnoreCase("No")){
            break;
        }
    }
}
    public void XuatTT(){
        for(product pr : ListPr){
            System.out.println(pr.toString());
        }
    }
}
