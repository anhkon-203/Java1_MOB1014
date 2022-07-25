/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_CRUD_OOP;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anhkon
 */
// Sẽ code các chức năng của đối tượng vào đây
public class NguoiYeuMoi_Service {

    // tất cả các biến toàn cục phải khai báo trên đầu
    private Scanner _sc;
    private List<NguoiYeuMoi> _lstNYM;
    private NguoiYeuMoi _Nym;
    private String _input;

    public NguoiYeuMoi_Service() {
        _sc = new Scanner(System.in);
        _lstNYM = new ArrayList<>();
        fake5Data(); // Khi lớp này khởi tạo sẽ đổ 5 đối tượng vào trong List
    }

    private void fake5Data() {
        _lstNYM.add(new NguoiYeuMoi("Chơi game", 50, "A", 0, "001"));
        _lstNYM.add(new NguoiYeuMoi("GTHT", 60, "B", 0, "002"));
        _lstNYM.add(new NguoiYeuMoi("Yêu đời", 70, "C", 0, "003"));
        _lstNYM.add(new NguoiYeuMoi("Đọc não", 80, "D", 0, "004"));
        _lstNYM.add(new NguoiYeuMoi("Đi ẻ", 90, "E", 0, "005"));
    }

    public void themMoi() {
        System.out.print("Mời b nhập số lượng : ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _Nym = new NguoiYeuMoi(); // Khởi tạo đối tượng để đổ giá trị do ng dùng nhập
            System.out.print("Nhập tên đi : ");
            _Nym.setTen(_sc.nextLine());
            System.out.print("Nhập sở thích đi đi : ");
            _Nym.setSoThich(_sc.nextLine());
            System.out.print("Nhập cân nặng đi : ");
            _Nym.setCanNang(Double.parseDouble(_sc.nextLine()));
            System.out.print("Nhập giới tính đi : ");
            _Nym.setGioiTinh(Integer.parseInt(_sc.nextLine()));
            System.out.print("Nhập sđt đi : ");
            _Nym.setSdt(_sc.nextLine());
            // Sau khi nhập xong 1 đối tượng
            _lstNYM.add(_Nym);
        }
    }

    public void inDs() {
        for (NguoiYeuMoi x : _lstNYM) {
            System.out.println(x.toString());
        }
    }

    //Đã làm được chức năng tìm kiếm thì Xoá, Sửa như 
    public void timKiem() {
        System.out.println("Mời bạn nhập sdt: ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstNYM.size(); i++) {
            if (_lstNYM.get(i).getSdt().equals(_input)) {

                System.out.println("Mời bạn nhập thuộc tính cần sửa");
                System.out.println("Mời bạn nhập thuộc tính cần sửa");
                System.out.println("Mời bạn nhập thuộc tính cần sửa");
                System.out.println("Mời bạn nhập thuộc tính cần sửa");
                // vì sao phải break
                //In cả thông báo không tìm thấy
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }

    public void Sua() {
        System.out.print("Nhập sđt đi  : ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstNYM.size(); i++) {
            if (_lstNYM.get(i).getSdt().equals(_sc)) {
                System.out.println("Mời bạn chọn đặc điểm cần sửa");
                System.out.println("1. Tên");
                System.out.println("2. Cân nặng");
                System.out.println("Chọn đi :");
                _input = _sc.nextLine();
                switch (_input) {
                    case "1":
                        System.out.println("Nhập tên cần sửa  :  ");
                        _Nym.setTen(_sc.nextLine());

                        break;
                    case "2":
                        System.out.println("Nhập Cân nặng cần sửa  :  ");
                        _Nym.setCanNang(Integer.parseInt(_sc.nextLine()));
                        break;
                    default:
                        System.out.println("Chức năng không tồn tại ");
                }
                return;
            }
        }
        System.out.println("Máy KHÔNG Xóa đc");
    }

 public void xuatGVgioi() {
        int count = 0;
        System.out.println("Các giáo viên dạy hơn 500 giờ là : ");
        for (int i = 0; i < _lstNYM.size(); i++) {
            if (_lstNYM.get(i).getSoGioDay()> 0) {
                System.out.println(_lstGV.get(i).toString());
                count++;
            }
            if (count == 0) {
                System.out.println("Không có giáo viên dạy hơn 500 giờ");
            } else {
                System.out.println("Hoàn thành");
            }
        }
    }

    public void Xoa() {
        System.out.print("Nhập sđt đi  : ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstNYM.size(); i++) {
            if (_lstNYM.get(i).getSdt().equals(_sc)) {
                _lstNYM.remove(i);
                System.out.println("Xóa thành công");
                // break; // Vì sap ơh break
                // in cả thông báo không tìm thấy
                return;
            }
        }
        System.out.println("Máy KHÔNG Xóa đc");
    }
}
