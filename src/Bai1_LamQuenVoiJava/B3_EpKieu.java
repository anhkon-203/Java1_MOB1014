/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_LamQuenVoiJava;

/**
 *
 * @author h
 */
public class B3_EpKieu {
    /*
    1. Ép kiểu từ String về số
    2. ép kiểu giữa các số với nhau
    */
    public static void main(String[] args) {
        //1. ép kiểu tuừ String về số
        String year1 = "2022";
        int year2 = 1;
        //không thực hiện dc phép toán bởi là 2 dữ kiệu khác nhau
        System.out.println("Cộng chuỗi + year1 + year2");
        //=2021
        //Gỉai quyế bằng ép kiểu
        System.out.println("Cộng chuỗi + (Integer.parseInt(year1)+ year2");
       // Väy thì các kiểu dữ liệu còn lại ép thế nào? phải thuộc kiểu dữ liệu 
       Double.parseDouble(year1);
       Float.parseFloat(year1);
       Long.parseLong(year1);
       //2. ép kiểu giữa các số với nhau
       int a = 5;
       double b = 9.9;
       //a = b;
       b = a; // ép kiểu tự động
        
    }
    
}
