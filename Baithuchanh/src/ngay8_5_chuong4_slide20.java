import java.util.ArrayList;
import java.util.ListIterator;

public class ngay8_5_chuong4_slide20 {
    public static void main(String[] args) {
        ArrayList<Character> arrListChar = new ArrayList<>();
        arrListChar.add('a');
        arrListChar.add('b');
        arrListChar.add('k');
        arrListChar.add('y');

        ListIterator<Character> listIterator = arrListChar.listIterator();
        System.out.println("Cac phan tu co trong arr la : ");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next() + "\t");
        }
    }
}
