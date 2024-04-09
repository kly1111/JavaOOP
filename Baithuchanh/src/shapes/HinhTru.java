package shapes;

import java.util.Scanner;
import java.util.*;

public class HinhTru extends HinhTron {
    public float chieuCao;
    Scanner sc = new Scanner(System.in);

    public HinhTru(){
        ten = "Hinh Tru ";
    }

    public void nhapChieuCao(){
        nhapBanKinh();

        System.out.println("Chieu cao la : " );
        chieuCao = sc.nextFloat();
    }

    public void tinhTheTich(){
        tinhDienTich();

        theTich = dienTich * chieuCao;
    }

}
