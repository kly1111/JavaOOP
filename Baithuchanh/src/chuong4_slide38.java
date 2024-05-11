import java.util.LinkedList;

public class chuong4_slide38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("java");
        list.add("php");
        list.add("c++");
        list.add("oop");

        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("Tat ca cac phan tu trong list la : ");
        System.out.println(listA);

        LinkedList<String> listB = new LinkedList<String>();
        listB.add("java");
        listA.retainAll(listB);
        System.out.println("nhung phan tu sau khi duoc xoa bo la : ");
        System.out.println(listA);

        list.removeAll(listB);
        System.out.println("Xoa phan tu thuoc listB khoi list : ");
        System.out.println(list);
    }
}
