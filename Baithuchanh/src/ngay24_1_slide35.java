package Baithuchanh;

import java.util.Scanner;

public class ngay24_1_slide35 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a la : ");
        double a = sc.nextDouble();
        
        System.out.println("Nhap so b la : ");
        double b = sc.nextDouble();
        
        if (a > b ){
            System.out.println("So nho hon la so : " + b);
        }
        else if ( b > a){
            System.out.println("So nho hon la so : " + a);
        }
        else {
            System.out.println("Hai so ban vua nhap bang nhau ! ");
        }
    }
}
