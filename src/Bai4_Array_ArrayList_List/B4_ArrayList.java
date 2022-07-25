/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_Array_ArrayList_List;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author 84362
 */
public class B4_ArrayList {

    public static void main(String[] args) {
        //Phần 1: có loại định kiểu và không định kiểu
        //cách gõ : ArrayL
        //1.1 Không định kiểu
        ArrayList arrLstKhongDinhKieu1;// khai báo
        arrLstKhongDinhKieu1 = new ArrayList(); //Khởi tạo mới sử dụng được

        //1.2: Có định kiểu
        // ArrayList<int> arr; // Không được phép sử dụng dữ liệu nguyên thủy
        ArrayList<Integer> arrlstInteger = new ArrayList<Integer>(); //khai báo tường minh
        ArrayList<String> arrlstString = new ArrayList<>(); // khai báo kh tường minh
        ArrayList<Double> arrlstDouble = new ArrayList<Double>();

        //Phần 2: Gán giá trị sử dụng phương thức add()
        arrLstKhongDinhKieu1.add(1);
        arrLstKhongDinhKieu1.add(true);
        arrLstKhongDinhKieu1.add("abc");
        arrLstKhongDinhKieu1.add(8.5);
        arrLstKhongDinhKieu1.add('a');

        arrlstString.add("A");
        arrlstString.add("B");
        arrlstString.add("C");
        arrlstString.add("D");
        arrlstString.add(0, "W");

        //Phần 3 : Truy xuất phần tử trong ArrayList với phương thức get(index)
        System.out.println(arrlstString.get(0));
        System.out.println(arrlstString.get(1));

        //arslstKhongĐinhKieu.size() = số lượng phần tử trong tập giá trị
        for (int i = 0; i < arrLstKhongDinhKieu1.size(); i++) {
            System.out.println(arrLstKhongDinhKieu1.get(i));

        }
        for (var x : arrlstString) {
            System.out.println(x);

        }
        //Phần 4: 1 vài phương thức hay sử dụng
        arrlstString.remove(1); //Xóa chữ A trong danh sách
        arrlstString.clear(); // xóa toàn bộ các phần tử trong danh sách
        arrlstString = new ArrayList<>(); // khởi tạo lại danh sách đồng nghĩa mất hết cách dữ liệu bên trong

        // sắp xếp
        Collections.sort(arrlstString);//sắp xếp xuôi và k có sắp xếp ngưpcj
        Collections.reverse(arrlstString); // đảo ngược danh sách

        //để tiến hành chạy in các phần tử thì cần check xem danh sách rỗng hay ko
        if (arrlstString.isEmpty()) {
            System.out.println("Danh sách Empty");
            return;
        }
        for (var x : arrlstString) {
            System.out.println("x");
        }
    }
    
    }

