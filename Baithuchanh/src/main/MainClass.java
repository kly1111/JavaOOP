package main;

import shapes.HinhChuNhat;
import shapes.HinhTron;

public class MainClass {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        HinhChuNhat HCN = new HinhChuNhat();

        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inKetQua();

        HCN.nhapThongTin();
        HCN.tinh();
        HCN.inThongTin();
    }
}
