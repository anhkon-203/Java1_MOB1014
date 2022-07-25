/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_LamQuenVoiJava;

import java.util.Scanner;

/**
 *
 * @author h
 */
public class BaiThucHanh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1,msv1;
        int namsinh1;
        
        System.out.println("Mời bạn nhập vào họ và tên: ");
        name1 = sc.nextLine();
        System.out.println("Mời bạn nhập năm sinh: ");
       //amsinh1 = sc.nextInt(); // trôi lệnh chỉ xảy ra sau khi nhập số mà tiếp theo nhập chuỗi sẽ bị.
        //cách 1:
        //sc.nextLine();
        //cách 2 không quan đếm đến các next số nữa. hãy coi tất cả các giá trị nhập vào là String.
        namsinh1 = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập mã sinh viên: ");
        msv1 = sc.nextLine();
        
        
        System.out.printf("Chào bạn: %s %d %s",name1,namsinh1,msv1);
        
        
    }
    
}
