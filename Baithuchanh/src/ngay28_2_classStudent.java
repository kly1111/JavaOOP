import java.util.Scanner;

public class ngay28_2_classStudent {
    public String hoTen;
    public String gioiTinh;
    public int tuoi;
    public String MSV ;

public void nhapHoten(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ho Ten : ");
    hoTen = sc.nextLine();
    }
public void nhapGioitinh(){
    Scanner sc = new Scanner(System.in);
    System.out.print("gioi tinh : ");
    gioiTinh = sc.nextLine();
    }
public void  nhapTuoi(){
    Scanner sc = new Scanner(System.in);
    System.out.println("tuoi:");
    tuoi = sc.nextInt();
    }
public void nhapMSV(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ma sinh vien : ");
    MSV = sc.nextLine();
    }
public int tinhTuoi(){
    tuoi = 2024-tuoi;
    return tuoi;
    }
public void inthongtin(){
    System.out.println("Ho ten : " + hoTen);
    System.out.println("Gioi tinh: " + gioiTinh);
    System.out.println("So tuoi:" + tuoi);
    System.out.println("Ma sinh vien: " + MSV);
    }
    public static void main(String[] args) {
        ngay28_2_classStudent hs  = new ngay28_2_classStudent();
        System.out.println("nhap vao thong tin sinh vien:");
        hs.nhapHoten();
        hs.nhapGioitinh();
        hs.nhapTuoi();
        hs.nhapMSV();
        hs.inthongtin();
    }
}