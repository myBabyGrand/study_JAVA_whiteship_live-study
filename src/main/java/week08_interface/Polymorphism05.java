package week08_interface;

interface Bird {
    public abstract void cry();
}
interface Chicken extends Bird {
    public abstract void cry();
}
interface Sparrow extends Bird {
    public abstract void cry();
}

class MyBird implements Chicken, Sparrow {
    public void cry() {
        System.out.println("꼬끼오!");
        System.out.println("짹짹!");
    }
}

public class Polymorphism05 {
    public static void main(String[] args) {
        MyBird p = new MyBird();
        p.cry();
    }
}
