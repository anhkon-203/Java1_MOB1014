/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI7_KeThua;

/**
 *
 * @author anhkon
 */
public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.setTen("A");
        sv1.setCmt("1234242");
        sv1.setHo("Pham");
        // ....có thể sử dụng được các thuộc tính của cha
        //đối với contructor của lớp con cũng có thể sử dụng truyền giá trị đã
        //bao gồm các thuộc tính của cha
        
        
        // ghi đè phương thức (override)
        Nguoi n1 = new Nguoi();
        SinhVien sv2 = new SinhVien();
        n1.method2(0);
        sv2.method2(0);;
     
    }
}
