ps/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai3_VongLap;

/**
 *
 * @author h
 */
public class B4_ThuatToanNoiBot {

    public static void main(String[] args) {
        int arrNumber[] = {99, 1, 0, 33};
        System.out.println("Trước khi sort");
        for (int x : arrNumber) {
            System.out.print(x + " ");
        }
        System.out.println("");
        // thuc thi thuat toan
        /*
        99, 1, 0, 33
        arrNumber[0] = 99 > arrNumber[1] = 1 = true
        1,99,0,33
        arrNumber[0] = 1 > arrNumber[2] = 0 = true
        
        
         */
        for (int i = 0; i < arrNumber.length; i++) {
            for (int j = i + 1; j < arrNumber.length; j++) {
                if (arrNumber[i] > arrNumber[j]) {
                    int temp = arrNumber[i];
                    arrNumber[i] = arrNumber[j];
                    arrNumber[j] = temp;

                }
            }
        }
        System.out.println("sau khi sort");
        for (int x : arrNumber) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }

}
