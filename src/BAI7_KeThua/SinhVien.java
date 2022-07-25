/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI7_KeThua;

/**
 *
 * @author anhkon
 */
public class SinhVien extends Nguoi{
    // Lớp con chỉ có các thuộc tính đặc trưng riêng để miêu tả đối tượng
    private String msv;
    private String nganhHoc;

    public SinhVien() {
    }

    public SinhVien(String msv, String nganhHoc, String ten, String temDem, String ho, String sdt, String cmt) {
        super(ten, temDem, ho, sdt, cmt);
        this.msv = msv;
        this.nganhHoc = nganhHoc;
    }
    
    //Kế thừa phương thức trong lập trình hướng đối tượng chính là ghi đè phương thức(overide)
    //alt + Insert => Overide Method và chọn phương thức cần

    @Override
    public void method2(int a) {
        super.method2(a); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void method1(int a, int b, int c) {
        super.method1(a, b, c); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
