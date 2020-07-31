/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSP;

import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author Khai2
 */
public class SanPham implements Serializable{
    protected int stt;
    protected String TenSP;
    protected String MaSP;
    protected Date NgayNhap;
    protected int SoLuong;
    protected int DanhMuc_ID;

    public SanPham() {
    }

    public SanPham(int stt, String TenSP, String MaSP, Date NgayNhap, int SoLuong, int DanhMuc_ID) {
        this.stt = stt;
        this.TenSP = TenSP;
        this.MaSP = MaSP;
        this.NgayNhap = NgayNhap;
        this.SoLuong = SoLuong;
        this.DanhMuc_ID = DanhMuc_ID;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setDanhMuc_ID(int DanhMuc_ID) {
        this.DanhMuc_ID = DanhMuc_ID;
    }

    public int getStt() {
        return stt;
    }

    public String getTenSP() {
        return TenSP;
    }

    public String getMaSP() {
        return MaSP;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public int getDanhMuc_ID() {
        return DanhMuc_ID;
    }

    

    
    
    
}
