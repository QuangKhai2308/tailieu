/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Khai
 */
public class XuLiNgayThang {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
//        int time = cal.get(Calendar.HOUR);
//        int date = cal.get(Calendar.DATE);
//        int month = cal.get(Calendar.MONTH) + 1;// trong java tháng được tính từ 0->11
//        int year = cal.get(Calendar.YEAR);
//        System.out.println("Giờ: "+time +"Ngày: "+ date +  "Tháng: " + month +  "Năm: " + year);
        Date t = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //dd: đại diện cho ngày
        //MM: đại diên cho tháng
        //yyyy: đại diện cho năm
        System.out.println("Hôm nay là: " +sdf.format(t));
        SimpleDateFormat sdf_1 = new SimpleDateFormat("hh:mm:ss aaa");
        System.out.println("Giờ hiện tại là: " + sdf_1.format(t));
    }
}
