import java.util.Scanner;

class HinhTron{
     public final float PI = 3.14f;
     public float r;
     public float chuVi;
     public float dienTich;

    public void nhapBanKinh(){
        System.out.print("Nhap ban kinh hinh tron la : ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = 2 * PI * r;
    }
    public void tinhDienTich(){
        dienTich = PI * r * r;
    }
    public void HienThi(){
        System.out.println("Chu vi cua hinh tron la : " + chuVi);
        System.out.println("Dien tich hinh tron la :  " + dienTich);
    }
}

public class ngay28_2_classHinhTron {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HinhTron tron = new HinhTron();
    tron.nhapBanKinh();
    tron.tinhChuVi();
    tron.tinhDienTich();
    tron.HienThi();
    }
}
