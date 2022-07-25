/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_8_XuLyChuoi;

import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class S2_MotVaiViDu {
    //Bài 1: Viết 1 chương trình nhập vào Full Name sao đó viết hoa chữ cái đầu của từ lên.  nguyen thi hoa = Nguyen Thi Hoa
    //Bài 2: Viết 1 chương trình zen mã tự động như sinh viên tại FPOLY.  nguyễn thị hoa = HoaNTPHXXX
    //Giải quyết 2 bài trên dựa vào lý thuyết xử lý chuỗi thầy đã up.
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        do {
            String input;
            System.out.print("Mời bạn nhập đầy đủ họ tên: ");
            input = sc.nextLine();
            System.out.printf("Tên bạn là: %s ", vietHoaChuCaiDauFULLNAME(input));
                    System.out.println("");
            System.out.printf("Tên bạn là: %s ", zenMSV(input,"012999"));
        } while (true);
   
    }
    public static String zenMSV(String text, String number){
        String temp = text.trim().toLowerCase();
        String arrNames[] = temp.split("\\s+");
        String msv = vietHoaChuCaiDauFULLNAME(arrNames[arrNames.length-1]);
        for (int i = 0; i < arrNames.length-1; i++) {
            msv+=String.valueOf(arrNames[i].charAt(0)).toUpperCase();
        }
        return msv +"PH" +number;
    }
    public static String vietHoaChuCaiDauFULLNAME(String text){
      String temp = text.trim().toLowerCase();
        String arrNames[] = temp.split("\\s+");
        String fullName = "";
        for (String x :arrNames) {
            fullName+= vietHoaChuCaiDauCuaTu(x) +" ";
        }
        return fullName;
    }
    public static String vietHoaChuCaiDauCuaTu(String text){//nGUYEN
        String temp = text.trim().toLowerCase();//nguyen
        return String.valueOf(temp.charAt(0)).toUpperCase()+temp.substring(1);
    }
}
