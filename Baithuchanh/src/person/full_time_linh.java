package person;

import java.util.*;

public class full_time_linh extends Employee{

    private int numbersOfOvertimeDays;

    public full_time_linh(String name){
        this.name = name;
    }

    public full_time_linh(String name, int numbersOfOvertimeDays){
        this.name = name;
        this.numbersOfOvertimeDays = numbersOfOvertimeDays;
    }

    public String typeOfEmp(){
        return "Full time";
    }

    public void calculateSalary(){
        salary = Configs.luong_nhan_vien_fulltime_linh + numbersOfOvertimeDays * Configs.luong_lam_them_moi_ngay;
    }
}