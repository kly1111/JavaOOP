abstract class Bike {
    abstract void Run();
}

public class Honda extends Bike {
    void Run(){
        System.out.println("running safely .....");
    }
    public void main (String args[]){
        Bike obj = new Honda();
        obj.Run();
    }
}
