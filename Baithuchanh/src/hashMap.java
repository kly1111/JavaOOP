import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String , String > hashMap = new HashMap<>();
        hashMap.put("CSLT" , "co so lap trinh");
        hashMap.put("CSDL" , "co so du lieu");
        hashMap.put("c#" , "c sharp");
        hashMap.put("java" , "java" );
        Set<Map.Entry<String , String>> setHashMap = hashMap.entrySet();
        System.out.println("Cac phan tu trong hashMap la : ");
        System.out.println(hashMap);
    }
}
