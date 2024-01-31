import java.util.*;

public class ngay31_1_slide95_b8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap so phan tu cua day : ");
            n = sc.nextInt();
        }while (n < 0);
        double tong = 0 ;
        for ( int i = 0 ; i < n ; i++){
            System.out.println("Nhap phan tu thu " + i + " cua day la : ");
            int ly = sc.nextInt();
            tong += ly;
        }
        System.out.println("Trung binh cong cua day la : " + tong/n );
    }
}
