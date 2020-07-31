/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SanPham;

import java.io.Serializable;

/**
 *
 * @author Khai2
 */
public class SanPham implements Serializable{
    protected int id;
    protected String TenSP;
    protected String NgayNhap;
    protected String MaSP;
    protected int SoLuong;

    public SanPham() {
    }

    public SanPham(int id, String TenSP, String MaSP, String NgayNhap, int SoLuong) {
        this.id = id;
        this.TenSP = TenSP;
        this.NgayNhap = NgayNhap;
        this.MaSP = MaSP;
        this.SoLuong = SoLuong;
    }

    public int getId() {
        return id;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    
}
