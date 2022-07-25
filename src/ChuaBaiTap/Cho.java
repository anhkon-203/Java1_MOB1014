/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaBaiTap;

/**
 *
 * @author 84362
 */
public class Cho {
    private String MaCho;
    private String TenCho;
    private String GioiTinh;
    private String ThucAnYeuThich;
    private int Ngaysinh;

    public Cho() {
    }

    public Cho(String MaCho, String TenCho, String GioiTinh, String ThucAnYeuThich, int Ngaysinh) {
        this.MaCho = MaCho;
        this.TenCho = TenCho;
        this.GioiTinh = GioiTinh;
        this.ThucAnYeuThich = ThucAnYeuThich;
        this.Ngaysinh = Ngaysinh;
    }

    public String getMaCho() {
        return MaCho;
    }

    public void setMaCho(String MaCho) {
        this.MaCho = MaCho;
    }

    public String getTenCho() {
        return TenCho;
    }

    public void setTenCho(String TenCho) {
        this.TenCho = TenCho;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getThucAnYeuThich() {
        return ThucAnYeuThich;
    }

    public void setThucAnYeuThich(String ThucAnYeuThich) {
        this.ThucAnYeuThich = ThucAnYeuThich;
    }

    public int getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(int Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    @Override
    public String toString() {
        return "Cho{" + "MaCho=" + MaCho + ", TenCho=" + TenCho + ", GioiTinh=" + GioiTinh + ", ThucAnYeuThich=" + ThucAnYeuThich + ", Ngaysinh=" + Ngaysinh + '}';
    }
    
}
  
