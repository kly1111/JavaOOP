import java.util.*;

public class ngay31_1_slide90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char kyTu;
        System.out.println("Nhap vao ky tu bat ky trong chuoi : ");
        chuoi = sc.nextLine();
        System.out.println("Cac ky tu co trong chuoi la : ");
        for (int i = 0 ; i < chuoi.length() ; i++){
            kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
        }
    }
}
