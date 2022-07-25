/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaBaiTap;

/**
 *
 * @author 84362
 */
public class Oto {
    private String MaOto;
    private String Hangoto;
    private String DongCo;
    private String nhienLieu;
    private int GiaTien;

    public Oto() {
    }

    public Oto(String MaOto, String Hangoto, String DongCo, String nhienLieu, int GiaTien) {
        this.MaOto = MaOto;
        this.Hangoto = Hangoto;
        this.DongCo = DongCo;
        this.nhienLieu = nhienLieu;
        this.GiaTien = GiaTien;
    }

    public String getMaOto() {
        return MaOto;
    }

    public void setMaOto(String MaOto) {
        this.MaOto = MaOto;
    }

    public String getHangoto() {
        return Hangoto;
    }

    public void setHangoto(String Hangoto) {
        this.Hangoto = Hangoto;
    }

    public String getDongCo() {
        return DongCo;
    }

    public void setDongCo(String DongCo) {
        this.DongCo = DongCo;
    }

    public String getNhienLieu() {
        return nhienLieu;
    }

    public void setNhienLieu(String nhienLieu) {
        this.nhienLieu = nhienLieu;
    }

    public int getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(int GiaTien) {
        this.GiaTien = GiaTien;
    }
public void inRaManHinh5(){
            System.out.println("Mã oto: " + getMaOto());
            System.out.println("Hãng oto: " + getHangoto() );
            System.out.println("Động cơ: " + getDongCo() );
            System.out.println("Nhiên liệu: " + getNhienLieu());
            System.out.println("Giá tiền : " +  getGiaTien());
    }

}
