/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_VongLap;

/**
 *
 * @author h
 */
public class B2_FOREACH {

    public static void main(String[] args) {
        int[] arrNumbers = {99,88,22,1,11};
        //C1.Xuất mảng dùng for
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.print(arrNumbers[i] + " ");
            System.out.println("");
        }
        //C2. foreach
        for (var x : arrNumbers) {
            System.out.print(x + " ");

        }
        // In bảng cửu chương bằng 3 vòng lặp.
    }

}
