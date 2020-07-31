/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pair;

/**
 *
 * @author Khai2
 */
public class demopair {
    public static void main(String[] args) {
        pairtype<String, Integer> type1 = new pairtype<>();
        type1.setK("Nguyễn Quang Khải");
        type1.setT(19);
        pairtype<String, Integer> type2 = new pairtype<>();
        type2.setK("Bùi Xuân Sáng");
        type2.setT(19);
        
        System.out.println("Họ Tên" + "\t" + "Tuổi");
        System.out.println(type1.getK() + "\t" + type1.getT());
        System.out.println(type2.getK() + "\t" + type2.getT());
        
        
    }
}
