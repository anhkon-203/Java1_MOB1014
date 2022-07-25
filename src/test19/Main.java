/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test19;

import java.util.Scanner;

/**
 *
 * @author anhkon
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sv_Udpm_Service sus = new Sv_Udpm_Service();
        int input;
        do {
            System.out.println("---------------------Menu-------------------------");
            System.out.println("1.Thêm Sinh viên                      ");
            System.out.println("2. Xuất danh sách sinh viên       ");
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
                sus.inDs();
                break;
            case 2:
                sus.themMoi();
                break;
            case 3:
                sus.Sua();
                break;
            case 4:
                sus.Xoa();
                break;
            case 5:
                sus.find();
                break;
            default:
                throw new AssertionError();
        }
        } while (input != 0);
      
    }
}
