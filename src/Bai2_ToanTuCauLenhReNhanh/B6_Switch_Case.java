/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_ToanTuCauLenhReNhanh;

import java.util.Scanner;

/**
 *
 * @author h
 */
public class B6_Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println("1. Menu gọi món");
            System.out.println("2. Phở bò");
            System.out.println("3. cơm");
            System.out.println("4. bún");
            System.out.println("5. thoát");
            System.out.println("Mời bạn chọn món: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Mời bạn chọn món Phở");
                    break;
                case "2":
                    System.out.println("Mời bạn chọn món Cơm");
                    break;
                case "3":
                    System.out.println("Mời bạn chọn món Bún");
                    break;
                case "4":
                    System.out.println("Hẹn bạn lần sau");
                    //System.exit(0);
                    break;
                default:
                  System.out.println("Món bạn chọn không tồn tại ");
                    break;
            }
        } while (input.equals("4"));

    }
    
}

