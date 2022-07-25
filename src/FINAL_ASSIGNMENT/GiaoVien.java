/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FINAL_ASSIGNMENT;

/**
 *
 * @author anhkon
 */
public class GiaoVien extends Person{
    private String MaGv;
    private String Email;
    private int SoGioDay;

    public GiaoVien() {
    }

    public GiaoVien( String Ho, String Ten, String TenDem, int NamSinh, String GioiTinh, String QueQuan,String MaGv, String Email, int SoGioDay) {
        super(Ho, Ten, TenDem, NamSinh, GioiTinh, QueQuan);
        this.MaGv = MaGv;
        this.Email = Email;
        this.SoGioDay = SoGioDay;
    }

    public String getMaGv() {
        return MaGv;
    }

    public void setMaGv(String MaGv) {
        this.MaGv = MaGv;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getSoGioDay() {
        return SoGioDay;
    }

    public void setSoGioDay(int SoGioDay) {
        this.SoGioDay = SoGioDay;
    }

    @Override
    public void inRaManHinh() {
        super.inRaManHinh();
        System.out.println("Mã Giáo Viên: " + getMaGv());
        System.out.println("Email: " + getEmail());
        System.out.println("Số giờ dạy: " + getSoGioDay());
    }

    @Override
    public String toString() {
        return "GiaoVien{" + "MaGv=" + MaGv + ", Ten=" + getTen() +  ", Email=" + Email + ", SoGioDay=" + SoGioDay + '}';
    }
    
    
}

