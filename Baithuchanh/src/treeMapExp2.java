import java.util.*;

public class treeMapExp2 {
    public static void main(String[] args) {
        TreeMap < Integer , Double > treeMap = new TreeMap<>();
        treeMap.put( 1 , 9d);
        treeMap.put( 2 , 10.1d);
        treeMap.put( 3 , 11.11d);
        treeMap.put( 4 , 27.11d);
        Set<Map.Entry< Integer , Double >> setTreMapExp2 = treeMap.entrySet();
        System.out.println("Cac phan tu cua Tree Map la : ");
        System.out.println(setTreMapExp2);

        treeMap.replace( 4 , 9.11d);
        treeMap.replace( 2 ,10.1d , 11.1d );
        System.out.println("Cap nhat lai cac phan tu : ");
        System.out.println(setTreMapExp2);
    }
}
