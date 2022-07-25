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
public class B5_If_Else_ElseIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diemthi;
        System.out.println("Mời bạn nhập điểm thi Java1:");
        diemthi = Double.parseDouble(sc.nextLine());
        if (diemthi >= 9 && diemthi <= 10) {
            System.out.println("Xuất sắc");
        } else if (diemthi >= 8 && diemthi <= 9) {
            System.out.println("Giỏi");
        } else if (diemthi >= 7 && diemthi < 8) {
            System.out.println("Khá");
        } else if (diemthi >= 5 && diemthi < 7) {
            System.out.println("TB");
        } else if (diemthi >=0 && diemthi < 5) {
            System.out.println("Học lại");
        } else {
            System.out.println("Bạn vui lòng nhập điểm theo hướng dẫn");
        }
    }

}
