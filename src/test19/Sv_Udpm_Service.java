/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anhkon
 */
public class Sv_Udpm_Service {
    private Scanner _sc;
    private List<Sv_Udpm> _lstSVU;
    private Sv_Udpm _Svu;
    private String _input;
    public Sv_Udpm_Service(){
        _sc = new Scanner(System.in);
        _lstSVU = new ArrayList<>();
        fake2data();
    }
    private void fake2data(){
        _lstSVU.add( new Sv_Udpm(5.5d, 001, "Quyen Anh", 2003, 9d));
        _lstSVU.add( new Sv_Udpm(9d, 002, "Phuong Anh", 2003, 7d));
    }
    public void themMoi(){
        System.out.println("Mời bạn nhập số lượng");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _Svu = new Sv_Udpm();
            System.out.println("Nhập điểm c: ");
            _Svu.setDiemC(Double.parseDouble(_sc.nextLine()));
            System.out.println("Nhập msv: ");
            _Svu.setMaSv(Integer.parseInt(_sc.nextLine()));
            System.out.println("Nhập tên : ");
            _Svu.setTen(_sc.nextLine());
            System.out.println("Nhập năm sinh: ");
            _Svu.setNamSinh(Integer.parseInt(_sc.nextLine()));
            System.out.println("Nhập điểm java: ");
            _Svu.setDiemJava(Double.parseDouble(_sc.nextLine()));
            _lstSVU.add(_Svu);
        }
        System.out.println("Bạn có muốn nhập thêm không: ");
        _input = _sc.nextLine();
    }
    public void inDs(){
        for (Sv_Udpm x : _lstSVU) {
            System.out.println(x.toString());
        }
    }
    public void Sua(){
        System.out.println("Mời bạn nhập mã sinh viên : ");
       _input = _sc.nextLine();
        for (int i = 0; i < _lstSVU.size(); i++) {
            if (_lstSVU.get(i).getMaSv() == Integer.parseInt(_input)) {
                System.out.println("Mời bạn chọn đặc điểm cần sửa: ");
                System.out.println("1.Tên ");
                System.out.println("2.Năm sinh");
                
                _input = _sc.nextLine();
                switch (_input) {
                    case "1":
                        System.out.println("Nhập tên cần sửa: ");
                        _Svu.setTen(_sc.nextLine());
                        break;
                    case "2":
                        System.out.println("Nhập Năm sinh cần sửa");
                       _Svu.setNamSinh(Integer.parseInt(_sc.nextLine()));
                        break;
                 
                    default:
                        System.out.println("Chức năng không tồn tại");
                }
                return;
            }
            
        }
    }
    public void Xoa(){
        System.out.println("Mời bạn nhập mã sinh viên: ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstSVU.size(); i++) {
            if (_lstSVU.get(i).getMaSv() == Integer.parseInt(_input)) {
                _lstSVU.remove(i);
                System.out.println("Xoá thành công");
            }
        }
    }
       public void find(){
        System.out.println("Mời bạn nhập mã sinh viên: ");
        _input = _sc.nextLine();
           for (int i = 0; i < _lstSVU.size(); i++) {
               if (_lstSVU.get(i).getMaSv() == Integer.parseInt(_input)) {
                   _lstSVU.get(i).toString();
                   return;
                   
               }
               System.out.println("Không tìm thấy");
           }
}
}

