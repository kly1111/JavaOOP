package shapes;

import java.util.Scanner;
import java.util.*;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    Scanner sc = new Scanner(System.in);

    public HinhChuNhat(){
        ten = "Hinh ChU Nhat";
    }

    public void NhapChieuDai(){
        System.out.println("Nhap chieu dai : ");
        dai = sc.nextFloat();
    }
    public void NhapChieuRong(){
        System.out.println("Nhap chieu rong : ");
        dai = sc.nextFloat();
    }

    public void tinhChuVi(){
        chuVi = (dai + rong) * 2 ;
    }
    public void tinhDienTich(){
        dienTich = dai * rong ;
    }
}
