/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_CRUD_OOP;

import java.util.Scanner;

/**
 *
 * @author anhkon
 */
public class Main {
    public static void main(String[] args) {
        //Nơi code menu
        Scanner sc = new Scanner(System.in);
        NguoiYeuMoi_Service nyms = new NguoiYeuMoi_Service();
        String input;
        
        do {
            System.out.println("Chươgn trình quản lí người yêu mới");
            System.out.println("1.Thêm mới người yêu: ");
            System.out.println("2. Sửa nyc:  ");
            System.out.println("3.Xoas người yêu:  ");
            System.out.println("4. Tìm kiếm người yêu:  ");
            System.out.println("5. Xuất danh sách người yêu:  ");
            System.out.println("6. Thoát: ");
            System.out.println("Mời bạn chọn chức năng: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    nyms.themMoi();
                    break;
                case "2":
                    nyms.Sua();
                    break;
                case "3":
                    nyms.Xoa();
                    break;
                case "4":
                    nyms.timKiem();
                    break;
                case "5":
                    nyms.inDs();
                    break;
                case "6":
                    System.out.println("Chào tạm biệt!");
                    break;
                case "0":
                    System.exit(0);;
                    break;
                default:
                    System.out.println("Mời bạn chọn lại chức năng: ");
            }
        } while (true);
    }
}
