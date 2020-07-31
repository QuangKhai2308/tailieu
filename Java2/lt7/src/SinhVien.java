/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khai2
 */
public class SinhVien {
    private String MaNV, FullName;
    private Majors Majors;
    private Double Marks;
    
    public SinhVien() {
    }

    public SinhVien(String MaNV, String FullName, Majors Majors, Double Marks) {
        this.MaNV = MaNV;
        this.FullName = FullName;
        this.Majors = Majors;
        this.Marks = Marks;
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

    public Majors getMajors() {
        return Majors;
    }

    public void setMajors(Majors Majors) {
        this.Majors = Majors;
    }

    public Double getMarks() {
        return Marks;
    }

    public void setMarks(Double Marks) {
        this.Marks = Marks;
    }

    


    public void xuatTT() {
        System.out.println("SinhVien{" + "MaNV=" + MaNV + ", FullName=" + FullName );
         
        switch(Majors) {
            case UD: {
                System.out.println("Ngành Công Nghệ Thông Tin");
                break;
            }
            case MOB: {
                System.out.println("Ngành Lập Trình Mobile");
                break;
            }
            case KT: {
                System.out.println("Ngành Kế Toán");
                break;
            }
            case DL: {
                System.out.println("Ngành Du Lịch");
                break;
            }
        }
    }
    
    
}
