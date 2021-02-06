package week08_interface;

interface Animal {
    public abstract void cry();
}

class Cat implements Animal {
    public void cry() {
        System.out.println("냐옹냐옹!");
    }
}

class Dog implements Animal {
    public void cry() {
        System.out.println("멍멍!");
    }
}

public class Polymorphism03 {
    public static void main(String[] args) {
//        Cat c = new Cat();
//        Dog d = new Dog();
        Animal c = new Cat();
        Animal d = new Dog();

        c.cry();
        d.cry();
    }
}
