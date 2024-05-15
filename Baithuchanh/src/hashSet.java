import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashSetInteger.add(11);
        hashSetInteger.add(9);
        hashSetInteger.add(7);
        hashSetInteger.add(27);
        hashSetInteger.add(5);
        System.out.println("Cac phan tu trong HashSet la : ");
        System.out.println(hashSetInteger);
        System.out.println("nhap phan tu ban can them vao hashset : ");
        int number = sc.nextInt();
        if(!hashSetInteger.contains(number)){
            hashSetInteger.add(number);
            System.out.println("them thanh cong phan tu cua ban !");
            System.out.println("Phan tu trong hashset sau khi them la : ");
            System.out.println(hashSetInteger);
        }
        else{
            System.out.println("Phan tu " + number + " da ton tai !");
        }
    }
}
