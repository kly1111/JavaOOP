package person;

import java.util.Scanner;

public class NhanVien {
    Scanner sc = new Scanner(System.in);
    public String hoTen;
    public int id;
    public String chucVu;

    public void NhapThongTin(){
        System.out.println("Ho va Ten : " );
        hoTen = sc.nextLine();
        System.out.println("Ma Nhan Vien : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Chuc Vu : ");
        chucVu = sc.nextLine();
    }

    public void NhapThongTin(String name, int id, String chucVu){
        System.out.println("Ho va Ten : " );
        hoTen = name;
        System.out.println("Ma Nhan Vien : ");
        this.id = id;
        System.out.println("Chuc Vu : ");
        this.chucVu = chucVu ;
    }

    public NhanVien(){
        hoTen = "Tran Thi Kieu Ly";
        id = 4869;
        chucVu = "Tester";
    }

    public void XuatThongTin(){
        System.out.println(hoTen + " ----- " + id + "\n" + chucVu);
    }

    public static void main(String[] args) {
        NhanVien kly = new NhanVien();
        kly.NhapThongTin();
        kly.XuatThongTin();
    }
}