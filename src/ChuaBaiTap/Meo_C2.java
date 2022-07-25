/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaBaiTap;

import java.io.PrintStream;

/**
 *
 * @author 84362
 */
public class Meo_C2 {
    private String Ten;
    private int Tuoi;
    private String DiaChi;
    private int GioiTinh;
    private int Ngaysinh;

    public Meo_C2() {
    }

    public Meo_C2(String Ten, int Tuoi, String DiaChi, int GioiTinh, int Ngaysinh) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.Ngaysinh = Ngaysinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(int Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }
    
    void in(){
       System.out.printf("%s | %d | %s | %d | %d |\n",Ten,Tuoi,DiaChi,GioiTinh,Ngaysinh);
    }
}
