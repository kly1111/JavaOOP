import java.util.*;

public class treeMap {
    public static void main(String[] args) {
        TreeMap < Integer , Character > tree = new TreeMap<>();
        tree.put( 1 , 'A');
        tree.put( 2 , 'B');
        tree.put( 3 , 'c');
        tree.put( 4 , 'D');

        Set < Map.Entry< Integer , Character > > setTreeMap = tree.entrySet();
        System.out.println("Cac phan tu trong TRee Map la :");
        System.out.println(setTreeMap);
    }
}
