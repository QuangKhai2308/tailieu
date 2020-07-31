
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
public class Laptop implements Serializable{
    private String NameSP;
    private String LoaiSP;
    private double Gia;
    private String NgayNhap;

    public Laptop() {
    }

    public Laptop(String NameSP, String LoaiSP, double Gia, String NgayNhap) {
        this.NameSP = NameSP;
        this.LoaiSP = LoaiSP;
        this.Gia = Gia;
        this.NgayNhap = NgayNhap;
    }

    public String getNameSP() {
        return NameSP;
    }

    public void setNameSP(String NameSP) {
        this.NameSP = NameSP;
    }

    public String getLoaiSP() {
        return LoaiSP;
    }

    public void setLoaiSP(String LoaiSP) {
        this.LoaiSP = LoaiSP;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    @Override
    public String toString() {
        return "Laptop{" + "NameSP=" + NameSP + ", LoaiSP=" + LoaiSP + ", Gia=" + Gia + ", NgayNhap=" + NgayNhap + '}';
    }
    
    
}
