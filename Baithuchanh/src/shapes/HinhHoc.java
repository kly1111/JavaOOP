package shapes;

import java.util.Scanner;
import java.util.*;

public class HinhHoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
    final float PI = 3.14f;
        public String ten;
        public float chuVi;
        public float dienTich;
        public float theTich;

        public HinhHoc(){
        }

        public void xuatTen(){
            System.out.println("\n\n===== " + ten + " =====" );
        }

        public void inChuVi(){
            System.out.print("Chu vi cua hinh la : " + String.format("%.2f", chuVi) + "\n");
        }
        public void inDienTich(){
            System.out.print("Dien tich cua hinh la : " + String.format("%.2f",dienTich) + "\n");
        }
        public void inTheTich(){
            System.out.print("The tich cua hinh la : " + String.format("%.2f",theTich));
           
        }
}

