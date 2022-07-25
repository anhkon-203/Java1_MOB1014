/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_CRUD_OOP;

/**
 *
 * @author anhkon
 */
public class Meo extends DongVat{
    private String mauSac;
    private int giongMeo;
   private String giong;
   private String gt;
  
   

    public Meo(String mauSac, int giongMeo, int Id, float canNang, int gioiTinh) {
        super(Id, canNang, gioiTinh);
        this.mauSac = mauSac;
        this.giongMeo = giongMeo;
    }

    public Meo() {
    }


    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getGiongMeo() {
        return giongMeo;
    }

    public void setGiongMeo(int giongMeo) {
        this.giongMeo = giongMeo;
    }

    public String getGiong() {
        return giongMeo == 1 ? "Việt Nam" : giongMeo == 2 ? "Úc" : giongMeo == 3 ?"MỸ": "Không xác định";
    }

   public String getGt() {
        return gioiTinh ==0 ? "Cái" : gioiTinh ==1 ? "Đực": "Không xác định";
    }
    

    @Override
    public String toString() {
        return "Meo{" + super.toString() + "mauSac=" + mauSac + ", giongmeo=" + getGiong()+ ", gioitinh=" + getGt()+'}';
    }

   
    }

  
  

  
    

