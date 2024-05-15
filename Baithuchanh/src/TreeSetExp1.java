import java.util.TreeSet;
import java.util.Scanner;

public class TreeSetExp1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        treeSetInteger.add(0);
        treeSetInteger.add(11);
        treeSetInteger.add(5);
        treeSetInteger.add(22);
        treeSetInteger.add(9);
        System.out.println("Phan tu trong treeSet la :");
        System.out.println(treeSetInteger); 
        System.out.println("Nhap phan tu ban can them vao treeSet : ");
        int number = sc.nextInt();
        if(!treeSetInteger.contains(number)){
            treeSetInteger.add(number);
            System.out.println("Them thanh cong !");
            System.out.println("Phan tu cua treeSet sau khi them la : ");
            System.out.println(treeSetInteger);
        } else{
            System.out.println("Phan tu " + number + " da ton tai !");
        }
    }
}
