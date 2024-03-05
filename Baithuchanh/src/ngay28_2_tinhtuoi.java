import java.time.Year;
import java.util.Scanner;

public class ngay28_2_tinhtuoi {

    String name;
    int id;
    int birthYear;
    int age;

    void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        name = sc.nextLine();

        System.out.print("Nhap ma so sinh vien: ");
        id = sc.nextInt();

        System.out.print("Nhap nam sinh: ");
        birthYear = sc.nextInt();

        sc.close();
    }

    void tinhTuoi() {
        int currYear = Year.now().getValue();
        age = currYear - birthYear;
    }

    void inThongTin() {
        System.out.println("Ho ten: " + name);
        System.out.println("Ma so sinh vien: " + id);
        System.out.println("Nam sinh: " + birthYear);
        System.out.println("Tuoi: " + age);
    }

    public static void main(String[] args) {
        ngay28_2_tinhtuoi p = new ngay28_2_tinhtuoi();
        p.nhapThongTin();
        p.tinhTuoi();
        p.inThongTin();
    }
}
