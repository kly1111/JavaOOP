package person;

public class full_time_sep extends Employee{
    public full_time_sep(String name){
        this.name = name;
    }

    public String typeOfEmp(){
        return "Boss";
    }

    public void calculateSalary(){
        salary = Configs.luong_nhan_vien_fulltime_sep;
    }
}