package person;

import java.util.*;

public class Person {
    protected String name, age, address;
    public Person(String name, String age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(){
        name = "kly";
        age = "18";
        address = "Ha noi";
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        // sc.nextLine();
        System.out.print("Nhap ten : ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi : ");
        age = sc.nextLine();
        System.out.print("Nhap dia chi : ");
        address = sc.nextLine();
    }

    public void inThongTin(){
        System.out.println("---------------------------------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
    }

    public static void main(String[] args){
        System.out.println("Nhap thong tin nhan vien part time : ");
        part_time pt = new part_time();
        pt.nhap();
        full_time ft = new full_time();
        ft.nhap();
        pt.in();
        ft.in();
    }
}