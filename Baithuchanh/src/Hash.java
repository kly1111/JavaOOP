import java.util.Scanner;
import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        String  name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetString.add("kly");
        hashSetString.add("lenovo");
        hashSetString.add("dell");
        hashSetString.add("wilson");
        hashSetString.add("lenovo");
        System.out.println("Phan tu trong Hash la :");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu ban can xoa : ");
        name = sc.nextLine();
        if(hashSetString.contains(name)){
            hashSetString.remove(name);
            System.out.println("xoa thanh cong !");
            System.out.println("Cap nhat lai phan tu cua Hash la : ");
            System.out.println(hashSetString);
        }else{
            System.out.println("Xoa khong thanh cong ");
        }
    }
}
