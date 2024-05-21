import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();
        System.out.println("So phan tu can nhap la : ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.println("Phan tu thu " + (i+1)  + " :");
            int number = sc.nextInt();
            arr.add(number);
        }
        System.out.println("Phan tu trong arr ban vua nhap la :");
        System.out.println(arr);

        int smax = - (int) Math.pow(10,9);
        for(int value : arr){
            smax = Math.max(smax , value);
        }
        System.out.println("Gia tri lon nhat trong arr la " + smax);

        System.out.println("Nhap gia tri ban can xoa : ");
        int tmp = sc.nextInt();
        if( arr.contains(tmp)){
            arr.remove(Integer.valueOf(tmp));
            System.out.println("Xoa thanh cong ! ");
            System.out.println("Arr sau khi xoa la : ");
            System.out.println(arr);
        }else {
            System.out.println("Xoa khong thanh cong ! ");
        }

        Collections.sort(arr);
        System.out.println(arr);
    }
}
