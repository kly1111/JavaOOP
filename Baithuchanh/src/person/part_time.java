package person;
import java.util.*;
public class part_time extends Employee{
    private int totalOfTimeWorking;

    public part_time(String name, int totalOfTimeWorking){
        this.name = name;
        this.totalOfTimeWorking = totalOfTimeWorking;
    }
    @Override
    public String typeOfEmp(){
        return "Part time";
    }

    public void calculateSalary(){
        salary = Configs.luong_lam_them_moi_gio * totalOfTimeWorking;
    }
}