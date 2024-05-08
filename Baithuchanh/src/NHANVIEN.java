import java.util.Scanner;

public class NHANVIEN {
    public Scanner sc = new Scanner(System.in);
    public String id;
    public String name;
    public double dola;
    public void nhapThongTin(){
        System.out.print("id nhan vien : ");
        id = sc.nextLine();
        System.out.print("Nhap ten : ");
        name = sc.nextLine();
        System.out.print("Luong : ");
        dola = sc.nextDouble();
    }
    
    public void xuatThongTin(){
        System.out.println("id ----- " + id );
        System.out.println("Name ----- " + name);
        System.out.println("Luong ----- " + dola);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So nhan vien can nhap : ");
        int n = sc.nextInt();
        sc.nextLine();
        NHANVIEN[] nv = new NHANVIEN[n];
        for(int i = 0 ; i < n ; i++){
            NHANVIEN nhanvien = new NHANVIEN();
            nhanvien.nhapThongTin();
            nv[i] = nhanvien;
        }
        
        double max_luong = -1;
        for(int i = 0; i < n ; i++){
            if ( nv[i].dola > max_luong){
                max_luong = nv[i].dola;
            }
        }
        System.out.println("nhan vien co luong cao nhat : " + max_luong);

        double tong = 0 ;
        for(int i = 0 ; i < n ; i++){
            tong += nv[i].dola;
        }
        System.out.println("tong so luong cua nhan vien cong ty la : " + tong);
    }
}