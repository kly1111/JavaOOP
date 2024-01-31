import java.util.*;

public class ngay31_1_slide74 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap so phan tu cua mang la : ");
            n = sc.nextInt();
        }while (n<0);
        int A[] = new int [n];
        System.out.println("Nhap cac phan tu cho mang ");
        for (int i = 0 ; i < n ; i++){
            System.out.println("Nhap phan tu thu " + i + " la : ");
            A[i] = sc.nextInt();
        }
        double tong = 0;
        for (int i = 0 ; i < n ; i++){
            if(A[i] % 2 == 0){
                tong += A[i];
            }
        }
        System.out.println("tong cac phan tu chan : " + tong );
    }
}