import java.util.*;

class person{
    Scanner sc = new Scanner(System.in);
    public String name;
    public int age;
    public double gpa;

    public void nhapThongTin(){
        System.out.println("Nhap ten sinh vien :");
        name = sc.nextLine();
        System.out.println("Nhap tuoi sinh vien : ");
        age = sc.nextInt();
        System.out.println("Nhap diem he 4 cua sinh vien : ");
        gpa = sc.nextDouble();
    }
    public void xuatThongTin(){
        System.out.println("Ten Sinh Vien -- " + name);
        System.out.println("Tuoi Sinh Vien -- " + age);
        System.out.println("GPA -- " + gpa);
    }
}
public class TTKL637Person_cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
