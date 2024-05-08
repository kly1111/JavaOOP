import java.util.Iterator;
import java.util.ArrayList;

public class ngay8_5_chuong4_slide19 {
    public static void main(String[] args) {
        ArrayList<Float> arrListFloat = new ArrayList<>();
        arrListFloat.add(0.2f);
        arrListFloat.add(7.26f);
        arrListFloat.add(9.11f);
        arrListFloat.add(8.27f);

        Iterator<Float> iterator = arrListFloat.iterator();
        System.out.println("Cac phan tu co trong arrListFloat la : ");
        while(iterator.hasNext()){
            System.out.println(iterator.next() + "\t");
        }
    }
}

