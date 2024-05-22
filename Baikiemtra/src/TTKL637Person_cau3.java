import java.util.*;

class person{
    Scanner sc = new Scanner(System.in);
    public String name;
    public int age;
    public double gpa;
    LinkedList <person> linkedList = new LinkedList<>();

    public void nhapThongTin(){
        System.out.println("Nhap ten sinh vien :");
        name = sc.nextLine();
        System.out.println("Nhap tuoi sinh vien : ");
        age = sc.nextInt();
        System.out.println("Nhap diem he 4 cua sinh vien : ");
        gpa = sc.nextDouble();
    }
    public void xuatThongTin(){
        System.out.println("Ten Sinh Vien -- " + name);
        System.out.println("Tuoi Sinh Vien -- " + age);
        System.out.println("GPA -- " + gpa);
    }

    public void themMoi(person ps){
        linkedList.add(ps);
    }

    public void suaThongTin(){
        String ch ;
        System.out.println("Ban muon sua ten (yes / no) : ");
        ch = sc.nextLine();
        while (ch.equals("yes") | ch.equals("no")){
            System.out.println("Moi ban nhap lai : ");
            System.out.println("Ten sinh vien sua thanh : ");
        }
    }

    public void xoa(){
        System.out.println("Nhap vi tri ban muon xoa : ");
        int tmp;
        do{
            tmp = sc.nextInt();
        }while (tmp < 0 | tmp > linkedList.size());
        linkedList.remove(tmp);
    }

    public void hienThi(){
        for (person ps : linkedList){
            xuatThongTin();
        }
    }
}
public class TTKL637Person_cau3 {
    public static void main(String[] args) {
        person ps = new person();
        Scanner sc = new Scanner(System.in);
        System.out.println("So nguoi ban muon nhap : ");
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            ps.nhapThongTin();
            ps.linkedList.add(ps);
        }
        person.
    }
}
