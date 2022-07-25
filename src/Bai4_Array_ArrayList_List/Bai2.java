/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_Array_ArrayList_List;

import java.util.Scanner;

/**
 *
 * @author 84362
 */
public class Bai2 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số phần tử: ");
        int number = Integer.parseInt(sc.nextLine());
        int a[] = new int[number];
        String b[] = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Mời bạn nhập điểm: ");
            a[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 || a[i] > 10) {
                b[i] = "khong hop le";
            } else {
                if (a[i] >= 5) {
                    b[i] = " đỗ";
                } else {
                    b[i] = " trượt";
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print("Điểm: " + a[i] );
            System.out.print( b[i]);
            System.out.println("");
        }
    }
    
}
