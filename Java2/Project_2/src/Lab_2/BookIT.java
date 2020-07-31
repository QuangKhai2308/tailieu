/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

/**
 *
 * @author Khai
 */
public class BookIT extends Book{
    private String TheLoai;
    private int SoTrang;

    public BookIT(String TheLoai, int SoTrang) {
        this.TheLoai = TheLoai;
        this.SoTrang = SoTrang;
    }

    public BookIT() {
        super();
        TheLoai = "TIn Học";
        SoTrang = 0;
    }
    
    public BookIT( int ID, String Name, String author, double price,String TheLoai, int SoTrang) {
        super(ID, Name, author, price);
        this.TheLoai = TheLoai;
        this.SoTrang = SoTrang;
    }
    
    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String TheLoai) {
        this.TheLoai = TheLoai;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int SoTrang) {
        this.SoTrang = SoTrang;
    }

    @Override
    public String toString() {
        return "BookIT{" + "ID=" + this.getID()+ ", Name=" +this.getName()  + ", author=" + this.getAuthor() + 
                ", price=" + this.getPrice() + "TheLoai=" + TheLoai + ", SoTrang=" + SoTrang + '}';
    }
    
    
    
}
