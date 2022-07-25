/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_LamQuenVoiJava;

import java.util.Scanner;

/**
 *
 * @author h
 */
public class B4_NhapXuatDuLieuTuBanPhim {

    public static void main(String[] args) {
        //1. Xuất ra màn hình
        System.out.print("Tôi muốn học giỏi Java 1");
        System.out.println("tại ngành phát triển phần mềm");
        System.out.print("Năm 2022 \t FPOLY\n");

        // In theo Template
        String name = "Quyền Anh";
        System.out.printf("Tôi là: %s Sinh năm: %d sẽ không trở thành người chép code\n", name, 2003);
        System.out.println("Tôi là: " + name + " Sinh năm: " + 2003 + " Sẽ không trở thành ngưười chép code");

        //2. Nhập dữ liệu từ bàn phím
        // viết 1 chương trình nhập tên và in ra
        
        //Bước 1: Khai báo 1 thư viện Scanner
        Scanner sc = new Scanner(System.in);
        
        //Bước 2: Xác định số lượng biến cần sử dụng
        String name1;
        
        // Bước 3: Gán giá trị vào cho biến và hướng dẫn người dùng.
        System.out.println("Mời bạn nhập tên: ");
        name1 = sc.nextLine();//Gán giá trị do người dùng nhập vào
        
        //Phải sử dụng next đúng kiểu dữ liệu bên trái
        // Bước 4: Thực thi
        System.out.printf("Chào bạn:%s",name1);
        
    }
}
