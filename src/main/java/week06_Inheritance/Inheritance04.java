package week06_Inheritance;

class Parent4 {
    int a;
    Parent4() { a = 10; }
    Parent4(int n) { a = n; }
}

class Child4 extends Parent4 {
    int b;

    Child4() {
        //super(40); //a <- 40 이 들어가게됨
        b = 20;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Inheritance04 {
    public static void main(String[] args) {
        Child4 ch = new Child4();
        ch.display();
    }
}
