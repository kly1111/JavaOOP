import java.util.*;
//bai6
public class ngay31_1_slide95_b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap so nguyen duong la : ");
            n = sc.nextInt();
        }while(n < 0);
        if (n == 0 ){
            System.out.println("0! = " + n);
        }
        int gt = 1;
        for (int i = 1 ; i <= n ; i++){
            gt *= i;
        }
        System.out.println(n +"! = " + gt);
    }
}
