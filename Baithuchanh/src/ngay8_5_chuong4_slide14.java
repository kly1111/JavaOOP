import java.util.ArrayList;

public class ngay8_5_chuong4_slide14 {
    public static void main(String[] args) {
        ArrayList<String> arrListsStrings = new ArrayList<>();
        arrListsStrings.add("java OOP");
        arrListsStrings.add("php");
        arrListsStrings.add("c#");
        arrListsStrings.add("c++");

        System.out.println("Cac phan tu co trong arraylist la : ");
        for(int i=0 ; i < arrListsStrings.size(); i++){
            System.out.println(arrListsStrings.get(i) + "\t");
        }

        ArrayList<Integer> arrListsInteger = new ArrayList<>();
        arrListsInteger.add(0);
        arrListsInteger.add(11);
        arrListsInteger.add(9);
        arrListsInteger.add(8);

        System.out.println("Cac phan tu co trong arraylist tiep la : ");
        for(int number : arrListsInteger ){
            System.out.println(number + "\t");
        }
    }
    
}
