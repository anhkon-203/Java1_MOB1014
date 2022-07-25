/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_Array_ArrayList_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 84362
 */
public class B4_List {

    public static void main(String[] args) {
        //Phần 1: có loại định kiểu và không định kiểu
        //cách gõ : ArrayL
        //1.1 Không định kiểu
        List LstKhongDinhKieu1;// khai báo
        LstKhongDinhKieu1 = new ArrayList(); //Khởi tạo mới sử dụng được

        //1.2: Có định kiểu
        // ArrayList<int> arr; // Không được phép sử dụng dữ liệu nguyên thủy
        List<Integer> lstInteger = new ArrayList<Integer>(); //khai báo tường minh
        List<String> lstString = new ArrayList<>(); // khai báo kh tường minh
        List<Double> lstDouble = new ArrayList<Double>();

        //Phần 2: Gán giá trị sử dụng phương thức add()
        LstKhongDinhKieu1.add(1);
        LstKhongDinhKieu1.add(true);
        LstKhongDinhKieu1.add("abc");
        LstKhongDinhKieu1.add(8.5);
        LstKhongDinhKieu1.add('a');

        lstString.add("A");
        lstString.add("B");
        lstString.add("C");
        lstString.add("D");
        lstString.add(0, "W");

        //Phần 3 : Truy xuất phần tử trong ArrayList với phương thức get(index)
        System.out.println(lstString.get(0));
        System.out.println(lstString.get(1));

        //arslstKhongĐinhKieu.size() = số lượng phần tử trong tập giá trị
        for (int i = 0; i < LstKhongDinhKieu1.size(); i++) {
            System.out.println(LstKhongDinhKieu1.get(i));

        }
        for (var x : lstString) {
            System.out.println(x);

        }
        //Phần 4: 1 vài phương thức hay sử dụng
        lstString.remove(1); //Xóa chữ A trong danh sách
        lstString.clear(); // xóa toàn bộ các phần tử trong danh sách
        lstString = new ArrayList<>(); // khởi tạo lại danh sách đồng nghĩa mất hết cách dữ liệu bên trong

        // sắp xếp
        Collections.sort(lstString);//sắp xếp xuôi và k có sắp xếp ngưpcj
        Collections.reverse(lstString); // đảo ngược danh sách

        //để tiến hành chạy in các phần tử thì cần check xem danh sách rỗng hay ko
        if (lstString.isEmpty()) {
            System.out.println("Danh sách Empty");
            return;
        }
        for (var x : lstString) {
            System.out.println("x");
        }
    }

}
