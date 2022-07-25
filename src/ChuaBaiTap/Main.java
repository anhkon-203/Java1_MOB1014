/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaBaiTap;



/**
 *
 * @author 84362
 */
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.GanGiaTri();
        
    }
    void GanGiaTri(){
        NguoiC1 n1 = new NguoiC1("Anh", 18, "012346653", "Bac Giang", 13, "Bac Giang", "Cao Dang");
        System.out.println(n1.toString());
        //
        System.out.println("-------------------------");
        Meo_C2 mc2 = new Meo_C2("meo", 10, "hn", 1, 3);
        mc2.in();
        System.out.println("-----------------------");
        //
        GiaoVien gv = new GiaoVien("Dung", "Anh", "Nguyen Anh Dung", "Dungna29"," dungna29@gmail.com", "dungna29@fe.edu.vn", "091237343343", "012234445453", 8, "Giang Vien");
        gv.InRaManHinh();
        System.out.println("---------------------");
        // 
        SinhVien sv = new SinhVien("Quyền Anh", "Quyền", "Phạm Lê Quyền Anh", "PH27863", "Anhplqph27863@fpt.edu.vn", "0582434619", "0362750854", "UDPM");
        sv.InRaManHinh4();
        System.out.println("----------------------");
        //
        DongVat dv = new DongVat("T113", "Trau", "Động vật", "Rừng", "Cỏ");
        dv.inRaManHinh5();
        System.out.println("--------------");
        //
        Oto o = new Oto("Vf03", "Vinfast", "4.0", "Xăng", 550000000);
        o.inRaManHinh5();
        System.out.println("----------------");
        //
        Thucvat tv = new Thucvat("C01", "Cỏ", "Rừng,ruộng");
        tv.Inramanhinh();
        System.out.println("------------------");
        //
        BanGhe bg = new BanGhe("BG01", "Hòa Phát", "Sofa", "Vải", 50.5, 40.5);
        System.out.println(bg.toString());
        System.out.println("-------------------");
        //
        XeMay xm = new XeMay("X001", "Wave", "Honda", "Xe số", " Xăng", "3.0",18000000);
        System.out.println(xm.toString());
        System.out.println("--------------------");
        //
        Cho ch= new Cho("Cho01", "Bun", "Đực", "Xương", 01);
        System.out.println(ch.toString());
    }
}
