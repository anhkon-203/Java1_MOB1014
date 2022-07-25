/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FINAL_ASSIGNMENT;

import BAI_MAU_CRUD_OOP.NguoiYeuMoi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anhkon
 */
public class GiaoVien_Service {
    // tất cả các biến toàn cục phải khai báo trên đầu

    private Scanner _sc;
    private List<GiaoVien> _lstGV;
    private GiaoVien _Gv;
    private String _input;

    public GiaoVien_Service() {
        _sc = new Scanner(System.in);
        _lstGV = new ArrayList<>();
        fake15Data();

    }


    public String getValue(String x) {
        System.out.println("Nhập vào " + x);
        return _sc.nextLine();
    }

    public void cn1() {
        int input;
        System.out.println("1.Thêm giáo viên");
        System.out.println("2.Sửa giáo viên");
        System.out.println("3.Xoá giáo viên");
        System.out.println("Hãy chọn chức năng:");
        input = Integer.parseInt(_sc.nextLine());
        switch (input) {
            case 1:
                themMoi();
                break;
            case 2:
                Sua();
                break;
            case 3:
                Xoa();
                break;
            default:
                System.out.println("Chọn sai chức năng:");
        }
    }

    public void themMoi() {
        System.out.print("Mời b nhập số lượng : ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _Gv = new GiaoVien();
            System.out.print("Nhập Họ đi : ");
            _Gv.setHo(_sc.nextLine());
            System.out.print("Nhập tên đi : ");
            _Gv.setTen(_sc.nextLine());
            System.out.print("Nhập tên đệm đi : ");
            _Gv.setTenDem(_sc.nextLine());
            System.out.print("Nhập năm sinh đi : ");
            _Gv.setNamSinh(Integer.parseInt(_sc.nextLine()));
            System.out.print("Nhập giới tính đi : ");
            _Gv.setGioiTinh(_sc.nextLine());
            System.out.print("Nhập Quê quán đi : ");
            _Gv.setQueQuan(_sc.nextLine());
            System.out.print("Nhập mã giáo viên đi : ");
            _Gv.setMaGv(_sc.nextLine());
            System.out.print("Nhập email đi : ");
            _Gv.setEmail(_sc.nextLine());
            System.out.print("Nhập số giờ dạy đi : ");
            _Gv.setSoGioDay(Integer.parseInt(_sc.nextLine()));
           
            _lstGV.add(_Gv);
        }
    }

    public void Xoa() {
        System.out.print("Nhập Mã giáo viên  : ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstGV.size(); i++) {
            if (_lstGV.get(i).getMaGv().equals(_sc)) {
                _lstGV.remove(i);
                System.out.println("Xóa thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy giáo viên ");
    }

    public void Sua() {
        System.out.print("Nhập mã giáo viên   : ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstGV.size(); i++) {
            if (_lstGV.get(i).getMaGv().equals(_sc)) {
                System.out.println("Mời bạn chọn đặc điểm cần sửa");
                System.out.println("1. Họ");
                System.out.println("2. Tên");
                System.out.println("3. Tên đệm");
                System.out.println("4. Năm sinh");
                System.out.println("5. Giới tính");
                System.out.println("6. Quê quán");
                System.out.println("7.Mã giáo viên");
                System.out.println("8. Email");
                System.out.println("9. Số giờ dạy");
                System.out.println("Chọn đi :");
                _input = _sc.nextLine();
                switch (_input) {
                    case "1":
                        System.out.println("Nhập Họ cần sửa  :  ");
                        _Gv.setHo(_sc.nextLine());

                        break;
                    case "2":
                        System.out.println("Nhập tên cần sửa  :  ");
                        _Gv.setTen(_sc.nextLine());
                    case "3":
                        System.out.println("Nhập tên đệm cần sửa  :  ");
                        _Gv.setTenDem(_sc.nextLine());
                    case "4":
                        System.out.println("Nhập năm sinh cần sửa  :  ");
                        _Gv.setNamSinh(Integer.parseInt(_sc.nextLine()));
                    case "5":
                        System.out.println("Nhập giới tính cần sửa  :  ");
                        _Gv.setGioiTinh(_sc.nextLine());
                    case "6":
                        System.out.println("Nhập quê quán cần sửa  :  ");
                        _Gv.setQueQuan(_sc.nextLine());
                    case "7":
                        System.out.println("Nhập mã giáo viên cần sửa  :  ");
                        _Gv.setMaGv(_sc.nextLine());
                    case "8":
                        System.out.println("Nhập email cần sửa  :  ");
                        _Gv.setEmail(_sc.nextLine());
                    case "9":
                        System.out.println("Nhập số giờ dạy cần sửa  :  ");
                        _Gv.setSoGioDay(Integer.parseInt(_sc.nextLine()));
                        break;
                    default:
                        System.out.println("Chức năng không tồn tại ");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy giáo viên");
    }
    

    public void fake15Data() {
        GiaoVien[] list15 = new GiaoVien[15];
        list15[0] = (new GiaoVien("Ngô", "Hoàng", "Đức", 1999, "Nam", "Bắc Ninh", "GV001", "Hoangngo@fe.edu.fpt", 520));
        list15[1] = (new GiaoVien("Vũ", "Ngọc", "Minh", 1988, "Nam", "Hải Phòng", "GV002", "Vungoc@fe.edu.fpt", 501));
        list15[2] = (new GiaoVien("Phạm", "Hương", "Thị", 1991, "Nữ", "Bắc Giang", "GV003", "Huongpham@fe.edu.fpt", 490));
        list15[3] = (new GiaoVien("Võ", "Đức", "Trung", 1992, "Nam", "Hà Nội", "GV004", "Ducvo@fe.edu.fpt", 501));
        list15[4] = (new GiaoVien("Nguyễn", "Huyền", "Thị", 1996, "Nữ", "Hưng Yên", "GV005", "Huyennguyen@fe.edu.fpt", 450));
        list15[5] = (new GiaoVien("Nguyễn", "Linh", "Thị", 1984, "Nữ", "Hà Nội", "GV006", "Linhnguyen@fe.edu.fpt", 555));
        list15[6] = (new GiaoVien("Nguyễn", "Khánh", "Văn", 1985, "Nam", "Hà Nội", "GV007", "Khanhnguyen@fe.edu.fpt", 901));
        list15[7] = (new GiaoVien("Lâm", "Minh", "Thị", 1986, "Nữ", "Hưng Yên", "GV008", "Minhlam@fe.edu.fpt", 789));
        list15[8] = (new GiaoVien("Hoàng", "Hào", "Văn", 1987, "Nam", "Hưng Yên", "GV009", "Haohoang@fe.edu.fpt", 567));
        list15[9] = (new GiaoVien("Đỗ", "Hồng", "Thị", 1988, "Nữ", "Thái Nguyên", "GV010", "Hongdo@fe.edu.fpt", 689));
        list15[10] = (new GiaoVien("Đặng", "Hà", "Văn", 1987, "Nam", "Hải Dương", "GV011", "Hadang@fe.edu.fpt", 420));
        list15[11] = (new GiaoVien("Võ", "Chung", "Ngọc", 1989, "Nữ", "Yên Bái", "GV012", "Chungvo@fe.edu.fpt", 700));
        list15[12] = (new GiaoVien("Trần", "Trung", "Văn", 1991, "Nam", "Hà Giang", "GV013", "Trungtran@fe.edu.fpt", 680));
        list15[13] = (new GiaoVien("Vũ", "Lâm", "Thị", 1992, "Nữ", "Bắc Giang", "GV014", "Lamvu@fe.edu.fpt", 560));
        list15[14] = (new GiaoVien("Nguyễn", "Nga", "Thị", 1983, "Nữ", "Hải phòng", "GV015", "Nganguyen@fe.edu.fpt", 430));
        Collections.addAll(_lstGV, list15);

    }

    public void timkiem() {
        int index = getIndex1("Mã giáo viên cần tìm là: ");
        if (index == -1) {
            System.out.println("Không tìm thấy");
        } else {
            System.out.println("Thông tin người cần tìm là: ");
            _lstGV.get(index).inRaManHinh();
        }

    }

    public int getIndex1(String x) {
        String str = getValue(x);
        _input = _sc.nextLine();
        for (int i = 0; i < _lstGV.size(); i++) {
            if (_lstGV.get(i).getMaGv().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public void Load() {
        if (_lstGV.isEmpty()) {
            System.out.println("danh sách thông tin giáo viên trống ");
        } else {
            System.out.println("Danh sách giáo viên là");
            int i = 1;

            for (GiaoVien giaoVien : _lstGV) {
                System.out.println("Người thứ :" + i);
                giaoVien.inRaManHinh();
                i++;
                System.out.println("------------------");
            }
        }
    }

    public void timKiemGanDung() {
        String ten = getValue("Tên gần đúng: ").replaceAll("\\s+", "");
        int i = 0;
        for (GiaoVien giaoVien : _lstGV) {
            if (giaoVien.getTen().toLowerCase().contains(ten)) {
                i++;
                System.out.println("Người thứ " +i);
                giaoVien.inRaManHinh();
            }
        }
        if (i == 0) {
            System.out.println("Không tìm thấy!");
        }
    }

    public void xuatGVgioi() {
        int count = 0;
        System.out.println("Các giáo viên dạy hơn 500 giờ là : ");
        for (int i = 0; i < _lstGV.size(); i++) {
            if (_lstGV.get(i).getSoGioDay()> 500) {
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
}

