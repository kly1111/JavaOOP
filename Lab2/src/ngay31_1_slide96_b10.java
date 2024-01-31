import java.util.*;
public class ngay31_1_slide96_b10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi cua ban la : ");
        String chuoi = sc.nextLine();
        System.out.println("Nhap ky tu can ktra : ");
        char kyTu = sc.next().charAt(0);
        int dem = 0;
        for (int i = 0 ; i < chuoi.length() ; i++){
            char tmp = chuoi.charAt(i);
            if (tmp == kyTu){
                ++dem;
            }
        }
        System.out.println("So lan xuat hien cua " + kyTu + " la : " + dem);
    }
}
