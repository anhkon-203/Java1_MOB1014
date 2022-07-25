/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FINAL_ASSIGNMENT;

import java.util.Scanner;

/**
 *
 * @author anhkon
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien_Service gvs = new GiaoVien_Service();
        int input;
        do {
            System.out.println("---------------------Menu-------------------------");
            System.out.println("1.Thêm, sửa, xoá giáo viên                        ");
            System.out.println("2. Thêm 15 giáo viên tạo sẵn vào danh sách        ");
            System.out.println("3.Tìm kiếm giáo viên theo mã giáo viên            ");
            System.out.println("4.Load thông tin giáo viên                        ");
            System.out.println("5.Tìm kiếm theo tên giáo viên gần đúng            ");
            System.out.println("6.Load tất cả giáo viên có số giờ dạy lớn hơn 500 ");
            System.out.println("7.Load tất cả giáo viên và phân chia danh sách    ");
            System.out.println("0.Thoát                                           ");
            System.out.println("--------------------------------------------------");
            System.out.printf("Bạn hãy chọn chức năng: ");
            input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    gvs.cn1();
                    break;
                case 2:
                    gvs.fake15Data();
                    break;
                case 3:
                    gvs.timkiem();
                    break;
                case 4:
                    gvs.Load();
                    break;
                case 5:
                    gvs.timKiemGanDung();
                    break;
                case 6:
                    gvs.xuatGVgioi();
                    break;
                case 7:

                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn đã nhập sai, vui lòng chọn đúng các chức năng trên!");
            }
        } while (true);
    }

}
