/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaBaiTap;

/**
 *
 * @author 84362
 */
public class NguoiC1 {
    private String ten;
    private int tuoi;
    private String sdt;
    private String diaChi;
    private int ngaySinh;
    private String quequan;
    private String trinhdo;

    public NguoiC1() {
    }

    public NguoiC1(String ten, int tuoi, String sdt, String diaChi, int ngaySinh, String quequan, String trinhdo) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.quequan = quequan;
        this.trinhdo = trinhdo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    @Override
    public String toString() {
        return "NguoiC1{" + "ten=" + ten + ", tuoi=" + tuoi + ", sdt=" + sdt + ", diaChi=" + diaChi + ", ngaySinh=" + ngaySinh + ", quequan=" + quequan + ", trinhdo=" + trinhdo + '}';
    }
    
}


