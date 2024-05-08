interface Animal {
    public void run();
}

public class Crocodile implements Animal{
    public void run(){
        System.out.println("con ca sau sau sau");
    }
    public static void main(String[] args) {
        Crocodile cro = new Crocodile();
        cro.run();
    }
}