/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FINAL_ASSIGNMENT;

/**
 *
 * @author anhkon
 */
public class Person {
    private String Ho;
    private String Ten;
    private String TenDem;
    private int NamSinh;
    private String GioiTinh;
    private String QueQuan;
    private String ThayCo;
    

    public Person() {
    }

    public Person(String Ho, String Ten, String TenDem, int NamSinh, String GioiTinh, String QueQuan) {
        this.Ho = Ho;
        this.Ten = Ten;
        this.TenDem = TenDem;
        this.NamSinh = NamSinh;
        this.GioiTinh = GioiTinh;
        this.QueQuan = QueQuan;
        
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getTenDem() {
        return TenDem;
    }

    public void setTenDem(String TenDem) {
        this.TenDem = TenDem;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }
//
    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getThayCo() {
        return GioiTinh == "Nam"?"Thầy":GioiTinh == "Nữ"?"Cô": "Không xác định";
    }
    
    
    public void inRaManHinh(){
        System.out.println("Họ và Tên: " +getHo()+" " +getTenDem()+" " +getTen());
        System.out.println("Năm Sinh: "   + getNamSinh());
        System.out.println("Giới Tính: "  + getGioiTinh()  + "("+ getThayCo() + ")");
        System.out.println("Quê Quán: "   + getQueQuan());
        
    }
    
}
