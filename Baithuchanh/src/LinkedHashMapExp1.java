import java.util.Set;
import java.util.LinkedHashMap;

public class LinkedHashMapExp1 {
    public static void main(String[] args) {
        LinkedHashMap< Integer , String > linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put( 1 , "Java");
        linkedHashMap.put( 2 , "C");
        linkedHashMap.put( 3 , "C++");
        linkedHashMap.put( 4 , "Python");
        System.out.println("Before remove : ");
        System.out.println(linkedHashMap);
        linkedHashMap.remove(2);
        System.out.println("Afte remove : ");
        System.out.println(linkedHashMap);
    }
}
