package week06_Inheritance;

class Parent6 {
    void display() { System.out.println("부모 클래스의 display() 메소드입니다."); }
}

class Child6 extends Parent6 {
    // 오버라이딩된 display() 메소드
    void display() { System.out.println("자식 클래스의 display() 메소드입니다."); }
    void display(String str) { System.out.println(str); } // 오버로딩된 display() 메소드
}

public class Inheritance06 {
    public static void main(String[] args) {
        Child6 ch = new Child6();
        ch.display();
        ch.display("오버로딩된 display() 메소드입니다.");
    }
}
