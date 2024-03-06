package shapes;

import java.util.Scanner;

public class HinhTron {
    final float pi = 3.14f;
    public float r;
    public float cv;
    public float dt;
    Scanner sc = new Scanner(System.in);

    public void nhapBanKinh(){
        System.out.println("Nhap ban kinh cua hinh tron : ");
        r = sc.nextFloat();
    }
    public void tinhChuVi(){
        cv = 2 * pi * r;
    }
    public void tinhDienTich(){
        dt = pi * r * r;
    }
    public void inKetQua(){
        System.out.println("Chu vi cua hinh tron la : " + cv);
        System.out.println("Dien tich cua hinh tron la : " + dt);
    }
}


