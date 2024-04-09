package shapes;

import java.util.*;

public class HinhVuong extends HinhChuNhat {
    Scanner sc = new Scanner(System.in);

    public HinhVuong(){
        ten = "Hinh Vuong";
    }

    public void nhapCanh(){
        System.out.println("Canh hinh vuong = ");
        dai = rong = sc.nextFloat();
    }    
}
