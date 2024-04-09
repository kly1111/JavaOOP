package shapes;

import java.util.Scanner;
import java.util.*;

public class HinhTron extends HinhHoc{
    public float r;
    
    Scanner sc = new Scanner(System.in);

    public HinhTron(){
        ten = "Hinh Tron ";
    }

    public void nhapBanKinh(){
        System.out.println("Nhap ban kinh cua hinh tron : ");
        r = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = 2 * PI * r;
    }
    public void tinhDienTich(){
        dienTich = PI * r * r;
    }
}


