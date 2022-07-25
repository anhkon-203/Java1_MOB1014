/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_CRUD_OOP;

/**
 *
 * @author anhkon
 */
public class DongVat {
    private int Id;
    private float canNang;
    int gioiTinh;
     

    public DongVat() {
    }

    public DongVat(int Id, float canNang, int gioiTinh) {
        this.Id = Id;
        this.canNang = canNang;
        this.gioiTinh = gioiTinh;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

 
 
        
    public int getGioiTinh() {
        return gioiTinh;
    }

    @Override
    public String toString() {
        return  "Id=" + Id + ", canNang=" + canNang +  ", ";
    }

    
}
