package main;

import java.util.*;

import person.full_time_linh;
import person.full_time_sep;
import person.part_time;
import shapes.HinhTron;
import shapes.HinhTru;

public class MainClass {
    public static void main(String[] args) {
        full_time_sep fts = new full_time_sep("Nguyen Dinh Linh");
        full_time_linh ftl1 = new full_time_linh("Nguyen Van A", 3);
        full_time_linh ftl2 = new full_time_linh("Nguyen Van B");
        part_time pt = new part_time("Nguyen Van C", 12);

        fts.calculateSalary();
        ftl1.calculateSalary();
        ftl2.calculateSalary();
        pt.calculateSalary();

        fts.in();
        ftl1.in();
        ftl2.in();
        pt.in();
    }
}