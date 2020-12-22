package week03_operator;

public class InstanceOfTest {

    public static void main(String[] args) {
        System.out.println("str" instanceof String);
        System.out.println(null instanceof String);

        Object o = new int[]{1, 2, 3};
        System.out.println(o instanceof int[]);

        System.out.println("===");
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();

        System.out.println((class1 instanceof Interface1));
        System.out.println((class2 instanceof Interface1));
        System.out.println((class3 instanceof Interface1));
        System.out.println((class2 instanceof Class2));
    }
}
class Class1{}
class Class2 extends Class3{}
class Class3 implements Interface1{}
interface Interface1 {}