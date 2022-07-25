/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaBaiTap;

import java.util.Scanner;

/**
 *
 * @author 84362
 */
public class ASM_Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println("-------------MENU-------------");
            System.out.println("1. Phở");
            System.out.println("2. Cơm");
            System.out.println("3. Bánh mì");
            System.out.println("4. Nước");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");

            input = sc.nextLine();
            switch (input) {
                case "0":
                    System.exit(0);
                    break;
                case "1":
                    System.out.println("Bạn đã chọn phở\n");
                    break;
                case "2":
                    System.out.println("Bạn đã chọn cơm\n");
                    break;
                case "3":
                    System.out.println("Bạn đã chọn bánh mì\n");
                    break;
                case "4":
                    System.out.println("Bạn đã chọn nước\n");
                    break;
                default:
                    System.out.println("Không tồn tại, mời nhập lại: \n");
                    break;
            }
        } while (true);
    }
}
