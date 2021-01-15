package week06_Inheritance;

class Parent3 {
    int a = 10;
}

class Child3 extends Parent3 {
    int a = 20;

    void display() {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}

public class Inheritance03 {
    public static void main(String[] args) {
        Child3 ch = new Child3();
        ch.display();
    }
}