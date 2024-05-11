import java.util.LinkedList;
import java.util.Scanner;

public class chuong4_slide41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("month 1");
        linkedList.add("month 2");
        linkedList.add("month 3");
        linkedList.add("month 4");
        linkedList.add("month 5");
        linkedList.add("month 6");
        linkedList.add("month 7");
        linkedList.add("month 8");
        linkedList.add("month 9");
        linkedList.add("month 10");
        linkedList.add("month 11");
        linkedList.add("month 12");

        System.out.println("Nhap chi so phan tu can lay :");
        int index = sc.nextInt();
        if(index < 0 || (index > linkedList.size() - 1 )){
            System.out.println("Chi so can lay phai lon hon khong va nho hon " + ( linkedList.size()-1 ) );
        }else{
            String node = linkedList.get(index);
            System.out.println("Phan tu co chi so = " + index + " trong linkedList la : " + node);
        }

        String firtNode = linkedList.getFirst();
        String lastNode = linkedList.getLast();
        System.out.println("Phan tu dau tien trong danh sach la : " + firtNode);
        System.out.println("Phan tu cuoi cung trong danh sach la : " + lastNode);

    }
}
