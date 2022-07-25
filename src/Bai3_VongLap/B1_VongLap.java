/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_VongLap;

/**
 *
 * @author h
 */
public class B1_VongLap {

    public static void main(String[] args) {
        /*
        Bí kíp dùng vòng lặp
        1. Điểm bắt đầu
        2. Điều kiện
        3. Bước nhảy
         */
        //1/Vòng lặp for = for + tab
        for (int i = 0; i < 5; i++) {
            System.out.println("Tôi không muốn học lại");
        }
        System.out.println("---------------");
        //2.Vòng lặp while = wh + tab
//        int i = 0;
//        while (i < 5) {
//            System.out.println("Tôi không muốn học lại");
//            i++;
//        }
        //3. Vòng lặp do while = do + tab
        int i = 0;
        do {
            System.out.println("Tôi không muốn học lại");
            i++;
        } while (i < 5);
    }
}
