/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaBaiTap;

/**
 *
 * @author 84362
 */
public class GiaoVien {
   private String Ten;
   private String TenDem;
   private String HoTen;
   private String MaGv;
   private String Email1;
   private String Email2;
   private String Sdt;
   private String SdtNguoiThan;
   private int SoGioDay;
   private String ChucVu;

    public GiaoVien() {
    }

    public GiaoVien(String Ten, String TenDem, String HoTen, String MaGv, String Email1, String Email2, String Sdt, String SdtNguoiThan, int SoGioDay, String ChucVu) {
        this.Ten = Ten;
        this.TenDem = TenDem;
        this.HoTen = HoTen;
        this.MaGv = MaGv;
        this.Email1 = Email1;
        this.Email2 = Email2;
        this.Sdt = Sdt;
        this.SdtNguoiThan = SdtNguoiThan;
        this.SoGioDay = SoGioDay;
        this.ChucVu = ChucVu;
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

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getMaGv() {
        return MaGv;
    }

    public void setMaGv(String MaGv) {
        this.MaGv = MaGv;
    }

    public String getEmail1() {
        return Email1;
    }

    public void setEmail1(String Email1) {
        this.Email1 = Email1;
    }

    public String getEmail2() {
        return Email2;
    }

    public void setEmail2(String Email2) {
        this.Email2 = Email2;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getSdtNguoiThan() {
        return SdtNguoiThan;
    }

    public void setSdtNguoiThan(String SdtNguoiThan) {
        this.SdtNguoiThan = SdtNguoiThan;
    }

    public int getSoGioDay() {
        return SoGioDay;
    }

    public void setSoGioDay(int SoGioDay) {
        this.SoGioDay = SoGioDay;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

  
   public void InRaManHinh(){
       System.out.println("Ten: " + getTen());
       System.out.println("Ten Dem: " + getTenDem());
       System.out.println(" Ho Ten: " + getHoTen());
       System.out.println("Ma Giao Vien: " + getMaGv());
       System.out.println("Email1: " + getEmail1());
       System.out.println("Email2: " + getEmail2());
       System.out.println("So Dien Thoai: " + getSdt());
       System.out.println("So Gio Day: " + getSoGioDay());
       System.out.println("Chuc Vu: " + getChucVu());
      
   }
}
