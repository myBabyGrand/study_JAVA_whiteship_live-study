package week08_Interface;

interface Introduce{
    static void name (String name){
        System.out.println("Hi my name is "+name);
    }
}
public class Misfortune04{

    public static void main(String[] args) {
        Introduce.name("Misforune");
    }
}
