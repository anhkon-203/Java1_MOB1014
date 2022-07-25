/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_Array_ArrayList_List;

/**
 *
 * @author h
 */
public class B1_Array {
    public static void main(String[] args) {
        // Phần 1: Khai báo biến - <Kiểu dữ liêu> <Tên Biến> = <Giá trị>;
        int a = 5;
        
        // Phần 2: Khai Báo mảng
        int[] arrNumbers;//Khai báo mảng và chưa sử dụng được 
        arrNumbers = new int[5]; // khởi tạo mảng 5 phần tử
        
        String arrNumber1[] = new String[9];
        String arrNumber2[] = {"JAVA1","JAVA2","JAVA3"};
        String arrnumber3[] = new String[] {"JAVA1","JAVA2","JAVA3"};
        
        var arrTemp1 = new String[] {"JAVA1","JAVA2","JAVA3"};
        var arrTemp2 = new Double[] {5.6,7.2};
        int arrTemp3[],arrTemp4[] = new int[5];
        
        //Phần 3: Gán giá trị thôg qua index
        //arrNumber = 5; Bên trái là kiểu dữ liệu mảng bên phải là gtri đơn
        arrNumbers[0] = 9; // gán gtri vào index 0
        arrNumbers[1] = 91;
        arrNumbers[2] = 92;
        arrNumbers[3] = 93;
        arrNumbers[4] = 94;//ghi đè gtri vào index 0
        
        // Phần 4: Lấy gtri - lưu gtri vào index nào thì lấy ra ở index đó
        System.out.println((arrNumbers[2] + 1000));
        // In Mảng 
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.println(arrNumbers[i]+" ");          
        }
        System.out.println("");
        //foreach
        for (int x : arrNumbers) {
            if (x%2==0) {
                System.out.println(x+"");
        }
        }
        System.out.println("");
        for (int x :arrNumbers) {
            if (x%2==0) {
                continue;
            }
            System.out.println(x+"");
        }
        System.out.println("");
        for (int x : arrNumbers) {
            System.out.print(((x % 2 != 0) ? x : "")+ " ");
    }
    }
}

 
