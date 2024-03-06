package shapes;

import java.util.Scanner;

public class HinhChuNhat {
    public float dai;
    public float rong;
    public float cv;
    public float dt;
    Scanner sc = new Scanner(System.in);

    public void nhapThongTin(){
        System.out.println("Nhap chieu dai : ");
        dai = sc.nextFloat();
        System.out.println("Nhap chieu rong : ");
        rong = sc.nextFloat();
    }
    public void tinh(){
        cv = (dai + rong) * 2 ;
        dt = dai * rong ;
    }
    public void inThongTin(){
        System.out.println("Chu vi hinh CN la : " + cv );
        System.out.println("Dien tich hinh CN la : " + dt );
    }
}
