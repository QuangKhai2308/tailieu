/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Khai2
 */
public class QLD {
    protected int ID;
    protected String TenSV;
    protected String MaSV;
    protected double TiengAnh;
    protected double TinHoc;
    protected double GDTC;

    public QLD() {
    }

    public QLD(int ID, String TenSV, String MaSV, double TiengAnh, double TinHoc, double GDTC) {
        this.ID = ID;
        this.TenSV = TenSV;
        this.MaSV = MaSV;
        this.TiengAnh = TiengAnh;
        this.TinHoc = TinHoc;
        this.GDTC = GDTC;
    }

    public int getID() {
        return ID;
    }

    public String getTenSV() {
        return TenSV;
    }

    public String getMaSV() {
        return MaSV;
    }

    public double getTiengAnh() {
        return TiengAnh;
    }

    public double getTinHoc() {
        return TinHoc;
    }

    public double getGDTC() {
        return GDTC;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public void setTiengAnh(double TiengAnh) {
        this.TiengAnh = TiengAnh;
    }

    public void setTinHoc(double TinHoc) {
        this.TinHoc = TinHoc;
    }

    public void setGDTC(double GDTC) {
        this.GDTC = GDTC;
    }
    
    
}
