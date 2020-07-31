/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtra;

/**
 *
 * @author Khai2
 */
public class NhanVienTest {
    private String MaNV;
    private String FullName;
    private int Age;
    private String NgoaiNgu;
    private String TuoiLD;

    public NhanVienTest() {
    }

    public NhanVienTest(String MaNV, String FullName, int Age, String NgoaiNgu) {
        this.MaNV = MaNV;
        this.FullName = FullName;
        this.Age = Age;
        this.NgoaiNgu = NgoaiNgu;
        
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

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getNgoaiNgu() {
        return NgoaiNgu;
    }

    public void setNgoaiNgu(String NgoaiNgu) {
        this.NgoaiNgu = NgoaiNgu;
    }

    public String getTuoiLD() {
        if (Age < 18) {
            return "Chưa trưởng thành";
        } else if (Age < 40 ) {
            return "Tuổi trẻ";
        } else if ( Age < 60) {
            return "Tuổi sắp về hưu";
        } else {
            return "Tuổi già";
        }
    }

    @Override
    public String toString() {
        return "NhanVienTest{" + "MaNV=" + MaNV + ", FullName=" + FullName + ", Age=" + Age + ", NgoaiNgu=" + NgoaiNgu + ", TuoiLD=" + TuoiLD + '}';
    }

    
    
    
}
