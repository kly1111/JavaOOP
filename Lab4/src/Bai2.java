import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua linkedList : ");
        int n = sc.nextInt();
        int tmp = 0;
        int sum = 0;
        for (int i = 0 ; i < n ; i++){
            System.out.println("Nhap phan tu thu " + (i+1) + ":");
            int num = sc.nextInt();
            linkedList.add(num);
            if(num % 2 == 0){
                ++tmp;
                sum += num;
            }
        }
        System.out.println("Phan tu trong linkedList la : ");
        System.out.println(linkedList);
        double tbc = (double)sum/tmp;
        System.out.println("Trung binh cong cua cac so chan trong linkedList la : " + tbc);
    }
}
