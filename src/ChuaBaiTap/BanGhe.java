/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaBaiTap;

/**
 *
 * @author 84362
 */
public class BanGhe {

    private String MaBanGhe;
    private String TenBanGhe;
    private String LoaiBanGhe;
    private String ChatLieu;
    private Double ChieuCao;
    private Double ChieuRong;

    public BanGhe() {
    }

    public BanGhe(String MaBanGhe, String TenBanGhe, String LoaiBanGhe, String ChatLieu, Double ChieuCao, Double ChieuRong) {
        this.MaBanGhe = MaBanGhe;
        this.TenBanGhe = TenBanGhe;
        this.LoaiBanGhe = LoaiBanGhe;
        this.ChatLieu = ChatLieu;
        this.ChieuCao = ChieuCao;
        this.ChieuRong = ChieuRong;
    }

    public String getMaBanGhe() {
        return MaBanGhe;
    }

    public void setMaBanGhe(String MaBanGhe) {
        this.MaBanGhe = MaBanGhe;
    }

    public String getTenBanGhe() {
        return TenBanGhe;
    }

    public void setTenBanGhe(String TenBanGhe) {
        this.TenBanGhe = TenBanGhe;
    }

    public String getLoaiBanGhe() {
        return LoaiBanGhe;
    }

    public void setLoaiBanGhe(String LoaiBanGhe) {
        this.LoaiBanGhe = LoaiBanGhe;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String ChatLieu) {
        this.ChatLieu = ChatLieu;
    }

    public Double getChieuCao() {
        return ChieuCao;
    }

    public void setChieuCao(Double ChieuCao) {
        this.ChieuCao = ChieuCao;
    }

    public Double getChieuRong() {
        return ChieuRong;
    }

    public void setChieuRong(Double ChieuRong) {
        this.ChieuRong = ChieuRong;
    }

    @Override
    public String toString() {
        return "BanGhe{" + "MaBanGhe=" + MaBanGhe + ", TenBanGhe=" + TenBanGhe + ", LoaiBanGhe=" + LoaiBanGhe + ", ChatLieu=" + ChatLieu + ", ChieuCao=" + ChieuCao + ", ChieuRong=" + ChieuRong + '}';
    }
  
}
