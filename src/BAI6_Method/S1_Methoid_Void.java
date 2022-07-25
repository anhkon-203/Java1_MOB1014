/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI6_Method;

/**
 *
 * @author anhkon
 */
class S1_Methoid_Void {
        public static void main(String[] args) {
        
    }
    // Trả Về K tham số
    public void tinhTong(){
        int a = 5,b = 9;
            System.out.printf("%d + %d = %d",a,b,a+b);
    }
    //Trả Về Có Tham Số
    // phương thức dưới đây là nạp chồng ( Overloading ): Trùng tên, cùng kiểu phương thức nhung phải khác ts truyền vào sẽ use đc
    public void tinhTong(int a, int b){
        System.out.printf("%d + %d = %d",a,b,a+b);
    }
    public void tinhTong(int a, int b, int c ){
        System.out.printf("%d + %d + %d = %d",a,b,c,a+b+c);
    }
    public void tinhTong(int a, int b, String c){
        System.out.printf("%d + %d = %d",a,b,a+b);
    }
    public void tinhTong(int a, int b, int c, int d ){
        System.out.printf("Phương Thức Đang Code");
        //Ngoài ra có rất nhièue kiểu dữ liệu khác nhau
        
        //Kinh nghiệm: Khi nào thì nên tách phương thức để tái sử dụng - Khi nhìn thấy những đoạm code giống nhau được lặp lại trên nhiều phương thức hoặc trên nhiều file thì nên nhóm đoạn code gióng nhau đó thành 1 phương thức chung.
        
    }
}

