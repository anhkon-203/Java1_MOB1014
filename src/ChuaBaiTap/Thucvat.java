/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaBaiTap;

/**
 *
 * @author 84362
 */
public class Thucvat {

    private String MaTV;
    private String TenLoai;
    private String KhuVuc;

    public Thucvat() {
    }

    public Thucvat(String MaTV, String TenLoai, String KhuVuc) {
        this.MaTV = MaTV;
        this.TenLoai = TenLoai;
        this.KhuVuc = KhuVuc;
    }

    public String getMaTV() {
        return MaTV;
    }

    public void setMaTV(String MaTV) {
        this.MaTV = MaTV;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public String getKhuVuc() {
        return KhuVuc;
    }

    public void setKhuVuc(String KhuVuc) {
        this.KhuVuc = KhuVuc;
    }
   public void Inramanhinh(){
       System.out.println("Mã Tv: " + getMaTV() );
       System.out.println("Tên loài: " + getTenLoai());
       System.out.println("Khu Vực: " + getKhuVuc());
   }
}
