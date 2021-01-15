package week06_Inheritance;

class Parent01 { }
class Child01 extends Parent01 { }
class Brother01 extends Parent01 { }

public class Polymorphism01 {
    public static void main(String[] args) {
        Parent01 p = new Parent01();
        System.out.println(p instanceof Object); // true
        System.out.println(p instanceof Parent01); // true
        System.out.println(p instanceof Child01);  // false
        System.out.println();

        Parent01 c = new Child01();
        System.out.println(c instanceof Object); // true
        System.out.println(c instanceof Parent01); // true
        System.out.println(c instanceof Child01);  // true
    }
}