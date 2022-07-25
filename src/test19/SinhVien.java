/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test19;

/**
 *
 * @author anhkon
 */
public class SinhVien {
    private int maSv;
    private String ten;
    private int namSinh;
    private double diemC;

    public SinhVien() {
    }

    public SinhVien(int maSv, String ten, int namSinh, double diemC) {
        this.maSv = maSv;
        this.ten = ten;
        this.namSinh = namSinh;
        this.diemC = diemC;
    }

    public int getMaSv() {
        return maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemC() {
        return diemC;
    }

    public void setDiemC(double diemC) {
        this.diemC = diemC;
    }

    @Override
    public String toString() {
        return  "maSv=" + maSv + ", ten=" + ten + ", namSinh=" + namSinh + ", diemC=" + diemC + ',';
    }
    
}
