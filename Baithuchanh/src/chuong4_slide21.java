import java.util.ArrayList;

public class chuong4_slide21 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(3);

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Yellow");

        System.out.println(colors.get(1));
        System.out.println(colors.contains("Pink"));
        System.out.println(colors);
    }
}
