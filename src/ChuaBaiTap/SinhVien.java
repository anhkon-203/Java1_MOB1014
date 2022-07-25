/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaBaiTap;

/**
 *
 * @author 84362
 */
public class SinhVien {

    private String Ten;
    private String TenDem;
    private String HoTen;
    private String MaSv;
    private String Email;
    private String Sdt;
    private String SdtNguoiThan;
    private String NganhHoc;

    public SinhVien() {
    }

    public SinhVien(String Ten, String TenDem, String HoTen, String MaSv, String Email, String Sdt, String SdtNguoiThan, String NganhHoc) {
        this.Ten = Ten;
        this.TenDem = TenDem;
        this.HoTen = HoTen;
        this.MaSv = MaSv;
        this.Email = Email;
        this.Sdt = Sdt;
        this.SdtNguoiThan = SdtNguoiThan;
        this.NganhHoc = NganhHoc;
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

    public String getMaSv() {
        return MaSv;
    }

    public void setMaSv(String MaSv) {
        this.MaSv = MaSv;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
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

    public String getNganhHoc() {
        return NganhHoc;
    }

    public void setNganhHoc(String NganhHoc) {
        this.NganhHoc = NganhHoc;
    }
    public void InRaManHinh4(){
        System.out.println("Tên:       " + getTen());
        System.out.println("Tên đệm:     " + getTenDem());
        System.out.println("Họ Tên :    " + getHoTen());
        System.out.println("Mã Sv  :    " + getMaSv());
        System.out.println("Email  :      " + getEmail());
        System.out.println("Sdt    :    "+ getSdt());
        System.out.println("Sdt Người thân: "+ getSdtNguoiThan());
        System.out.println("Ngành học:      "+ getNganhHoc());
    }
}
