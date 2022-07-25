/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_CRUD_OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anhkon
 */
public class Meo_Service {
    private Scanner _sc;
    private List<Meo> _lstMEO;
    private Meo _Meo;
    private String _input;
    private int _input1;
    public Meo_Service(){
        _sc = new Scanner(System.in);
        _lstMEO = new ArrayList<>();
        fake5Data();
    }

    private void fake5Data() {
        _lstMEO.add( new Meo("Vàng", 1, 002, 20.1f,0 ));
        _lstMEO.add( new Meo("Đỏ", 2, 003, 22.2f,1 ));
        _lstMEO.add( new Meo("Trắng", 2, 004, 23.1f,1 ));
        _lstMEO.add( new Meo("Tím", 3, 005, 25.2f,0 ));
        _lstMEO.add( new Meo("Xanh", 2, 006, 26.3f,0 ));
    }
    public void themMoi(){
        System.out.println("Mời bạn nhập số lượng: ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _Meo = new Meo();
            System.out.println("Mời bạn nhập màu sắc: ");
            _Meo.setMauSac(_sc.nextLine());
            System.out.println("Mời bạn nhập giới tính: ");
            _Meo.setGioiTinh(Integer.parseInt(_sc.nextLine()));
            System.out.println("Mời bạn nhập ID: ");
            _Meo.setId(Integer.parseInt(_sc.nextLine()));
            System.out.println("Mời bạn nhập cân nặng: ");
            _Meo.setCanNang(Float.parseFloat(_sc.nextLine()));
            System.out.println("Mời bạn nhập Giống mèo: ");
            _Meo.setGiongMeo(Integer.parseInt(_sc.nextLine()));
            _lstMEO.add(_Meo);
        }
    }
    public void inDs(){
        for (Meo x : _lstMEO) {
            System.out.println(x.toString());
        }
    }
     public void timKiem() {
        System.out.print("Mời bạn nhâp ID : ");
        _input1 = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < _lstMEO.size(); i++) {
            if (_lstMEO.get(i).getId() == _input1) {
                System.out.println(_lstMEO.get(i).toString());
                return; // vì sao phải break
                // in cả thông báo ko tìm thấy
            }
        }
        System.out.println("không tìm thấy");
    }
    public void Sua(){
        System.out.print("Nhập Id đi  : ");
        _input1 = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < _lstMEO.size(); i++) {
            if (_lstMEO.get(i).getId() == _input1) {
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

    
    
}

    

    
    

