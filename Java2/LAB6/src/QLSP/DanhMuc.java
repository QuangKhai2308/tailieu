/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSP;

/**
 *
 * @author Khai2
 */
public class DanhMuc {
    protected int id;
    protected String ten_sp;

    public DanhMuc() {
    }

    public DanhMuc(int id, String ten_sp) {
        this.id = id;
        this.ten_sp = ten_sp;
    }

    public String getTen_sp() {
        return ten_sp;
    }

    public void setTen_sp(String ten_sp) {
        this.ten_sp = ten_sp;
    }

    public int getId() {
        return id;
    }
    
    
}
