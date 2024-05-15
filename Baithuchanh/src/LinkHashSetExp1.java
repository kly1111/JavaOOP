import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkHashSetExp1 {
    public static void main(String[] args) {
        LinkedHashSet<String> link = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        link.add("tran");
        link.add("thi");
        link.add("kieu");
        link.add("ly");
        link.add("java");
        link.add("c++");
        System.out.println("Cac phan tu trong link la : ");
        System.out.println(link);
        System.out.println("Nhap phan tu ban can xoa : ");
        String obj = sc.nextLine();
        if(link.contains(obj)){
            link.remove(obj);
            System.out.println("xoa thanh cong !");
            System.out.println("Phan tu con lai sau khi xoa la : ");
            System.out.println(link);
        }else{
            System.out.println("xoa khong thanh cong");
        }
    }
}
