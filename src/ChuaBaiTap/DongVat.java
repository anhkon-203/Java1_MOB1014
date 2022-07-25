/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaBaiTap;

/**
 *
 * @author 84362
 */
public class DongVat {

    private String MaDv;
    private String TenLoai;
    private String GiongLoai;
    private String KhuVucSong;
    private String ThucAn;

    public DongVat() {
    }

    public DongVat(String MaDv, String TenLoai, String GiongLoai, String KhuVucSong, String ThucAn) {
        this.MaDv = MaDv;
        this.TenLoai = TenLoai;
        this.GiongLoai = GiongLoai;
        this.KhuVucSong = KhuVucSong;
        this.ThucAn = ThucAn;
    }

    public String getMaDv() {
        return MaDv;
    }

    public void setMaDv(String MaDv) {
        this.MaDv = MaDv;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public String getGiongLoai() {
        return GiongLoai;
    }

    public void setGiongLoai(String GiongLoai) {
        this.GiongLoai = GiongLoai;
    }

    public String getKhuVucSong() {
        return KhuVucSong;
    }

    public void setKhuVucSong(String KhuVucSong) {
        this.KhuVucSong = KhuVucSong;
    }

    public String getThucAn() {
        return ThucAn;
    }

    public void setThucAn(String ThucAn) {
        this.ThucAn = ThucAn;
    }
    public void inRaManHinh5(){
        System.out.println("Mã Dv: " + getMaDv() );
        System.out.println("Tên loài: " + getTenLoai() );
        System.out.println("Giống loài: " + getGiongLoai() );
        System.out.println("Khu vực sống: " + getKhuVucSong() );
        System.out.println("Thức ăn: " +  getThucAn());
    }
}
