/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test19;

/**
 *
 * @author anhkon
 */
public class Sv_Udpm extends SinhVien{
    private double diemJava;

    public Sv_Udpm() {
    }

    public Sv_Udpm(double diemJava, int maSv, String ten, int namSinh, double diemC) {
        super(maSv, ten, namSinh, diemC);
        this.diemJava = diemJava;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    @Override
    public String toString() {
        return "Sv_Udpm{" + super.toString() + "diemJava=" + diemJava + '}';
    }

 
    
}
