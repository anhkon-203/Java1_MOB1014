/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaBaiTap;

/**
 *
 * @author 84362
 */
public class XeMay {

    private String MaXeMay;
    private String TenXeMay;
    private String HangXeMay;
    private String LoaiXeMay;
    private String NhienLieu;
    private String DongCo;
    private int GiaTien;

    public XeMay() {
    }

    public XeMay(String MaXeMay, String TenXeMay, String HangXeMay, String LoaiXeMay, String NhienLieu, String DongCo, int GiaTien) {
        this.MaXeMay = MaXeMay;
        this.TenXeMay = TenXeMay;
        this.HangXeMay = HangXeMay;
        this.LoaiXeMay = LoaiXeMay;
        this.NhienLieu = NhienLieu;
        this.DongCo = DongCo;
        this.GiaTien = GiaTien;
    }

    public String getMaXeMay() {
        return MaXeMay;
    }

    public void setMaXeMay(String MaXeMay) {
        this.MaXeMay = MaXeMay;
    }

    public String getTenXeMay() {
        return TenXeMay;
    }

    public void setTenXeMay(String TenXeMay) {
        this.TenXeMay = TenXeMay;
    }

    public String getHangXeMay() {
        return HangXeMay;
    }

    public void setHangXeMay(String HangXeMay) {
        this.HangXeMay = HangXeMay;
    }

    public String getLoaiXeMay() {
        return LoaiXeMay;
    }

    public void setLoaiXeMay(String LoaiXeMay) {
        this.LoaiXeMay = LoaiXeMay;
    }

    public String getNhienLieu() {
        return NhienLieu;
    }

    public void setNhienLieu(String NhienLieu) {
        this.NhienLieu = NhienLieu;
    }

    public String getDongCo() {
        return DongCo;
    }

    public void setDongCo(String DongCo) {
        this.DongCo = DongCo;
    }

    public double getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(int GiaTien) {
        this.GiaTien = GiaTien;
    }

    @Override
    public String toString() {
        return "XeMay{" + "MaXeMay=" + MaXeMay + ", TenXeMay=" + TenXeMay + ", HangXeMay=" + HangXeMay + ", LoaiXeMay=" + LoaiXeMay + ", NhienLieu=" + NhienLieu + ", DongCo=" + DongCo + ", GiaTien=" + GiaTien + '}';
    }

}
