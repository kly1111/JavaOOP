import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;

public class hashMapCity {
    public static void main(String[] args) {
        HashMap<String , String > hashMapCity = new HashMap<>();
        hashMapCity.put("TPHCM" , "Thanh Pho Ho Chi Minh");
        hashMapCity.put("H" , "Hue");
        hashMapCity.put("QN" , "Quy Nhon");
        hashMapCity.put("DN" , "Da Nang");
        System.out.println("Danh sach thanh pho trong hashMapCity la : ");
        Set<Map.Entry<String , String >> setCity = hashMapCity.entrySet();
        System.out.println(setCity);

        System.out.println("DN : " + hashMapCity.get("DN"));
        System.out.println("NT : " + hashMapCity.get("NT"));

        if(hashMapCity.containsValue("Thanh Pho Ho Chi Minh")){
            System.out.println("Co Thanh Pho Ho Chi Minh trong HashMapCity");
        }
    }
}
