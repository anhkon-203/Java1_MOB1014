/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5_OOP;

import ChuaBaiTap.NguoiC1;

/**
 *
 * @author 84362
 */
public class S1_LyThuyet {
    /*
    // Trong thế giới thực
        1.Đối tượng: bàn, ghế , bàn phím, dộng vật, người ...
        2. Thông tin:  Dùng miêu tả đối tượng dễ phân biệt
        3. Hành động: Sẽ luôn đi với động từ để miêu tả hành động cho đới tượng.
        
        //OOP
        1. Đối tượng: Sử dụng từ khóa Class để tạo đối tượng, đối tượng phải là danh từ, viết hoa chữ cái đầu của từ là bắt buộc.
        2. Thông tin: Thay đổi tên gọi của THÔNG TIN thành THUỘC TÍNH và được biểu diễn dưới dạng BIẾN.
        3.Hành động: Biểu diễn dưới dạng Method(Phương thức) và luôn có động từ đứng trước.
        
    */
    public static void main(String[] args) {
        /*
        Lưu thông tin người yêu cũ
        
        Người yêu cũ 1:
        Tên: Phạm Thị A
        Năm sinh: 2003
        Sdt: 0912534JQk
        Sở thích: Ngủ
        Giới tính Nữ
        Vòng1 80
        Vòng 2: 65
        Vòng 3: 85
        Cân nặng: 45kg
        */
        
        /*
        // Phần 1: Khai báo và khởi tạo
        // Phải biết tên đối tượng đang nằm trong package nào.
        
        */
        NguoiYeuCu nyc; // Khai báo
        nyc = new NguoiYeuCu(); // Khởi tạo đói tượng thì mới dùng được.
        // Đối với contructor không tham số thì không có giá trị ban đầu
            // Để gán giá trị cần dùng phương thức setter
            nyc.setTen("Phương");
            nyc.setSoThich("Ăn");
            nyc.setTruongHoc("Fpoly");
            nyc.inRaManHinh();
            //Để lấy giá trị thì dùng getter
            System.out.println( nyc.getTen() + " " + nyc.getTruongHoc());
            //Sử dụng contructor có tham số để gán giá trị cho đối tượng ngay khi khởi tạo
            NguoiC1 n1 = new NguoiC1("Anh", 18, "121312", "BG", 13, "Luc Nam", "Cao Dang");
    }
}
