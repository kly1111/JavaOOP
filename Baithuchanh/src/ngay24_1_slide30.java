import java.util.Scanner;

public class ngay24_1_slide30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap so n : ");
           n = sc.nextInt();
        }while (n < 0);
        int tong = 0;
        while (n != 0){
            int x = n % 10;
            tong += x;
            n /= 10;
        }
        System.out.println(tong);
    }
}
