import java.util.ArrayList;
import java.util.Scanner;

public class chuong4_slide23 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Nhap so phan tu cua ArrayList : ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhap phan tu thu " + i + " :");
            number = sc.nextInt();
            arrList.add(number);
        }

        int max = arrList.get(0);
        for(int i = 1 ; i < arrList.size() ; i++){
            if(arrList.get(i).compareTo(max) > 0){
                max = arrList.get(i);
            }
        }

        System.out.println("Phan tu lon nhat trong ArrayList la : " + max);
    }
}
