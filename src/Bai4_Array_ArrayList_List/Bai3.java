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
public class Bai3 {
        public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
            System.out.println("nhập số phần tử: ");
            int number = Integer.parseInt(sc.nextLine());

            int yearBirth[] = new int[number];
            String name[] = new String[number];
            String id[] = new String[number];
            int age[] = new int[number];
            for (int i = 0; i < number; i++) {
                System.out.println("nhập thông tin sinh viên "+i);
                System.out.print("nhập tên sinh viên: ");
                name[i] = sc.nextLine();
                System.out.print("nhập năm sinh: ");
                yearBirth[i] = Integer.parseInt(sc.nextLine());
                System.out.println("nhập mã sinh viên: ");
                id[i] = sc.nextLine();
            }

            for (int i = 0; i < number; i++) {
                age[i] = 2022 - yearBirth[i];
            }

             for (int i = 0; i < number; i++) {
                 System.out.println("sinh viên thứ "+i);
                 System.out.println("tên sinh viên: "+name[i]);
                 System.out.println("năm sinh: "+ yearBirth[i]);
                 System.out.println("mã sinh viên: "+id[i]);
                 System.out.println("tuổi cửa sinh viên là : "+age[i]);
            }

        }
    }
    
