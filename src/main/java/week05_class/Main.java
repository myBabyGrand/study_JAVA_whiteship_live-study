package week05_class;

class Class {               // 클래스
    String constructor;
    String instanceVar;     // 인스턴스 변수
    static String classVar; // 클래스 변수

    static {                // 클래스 초기화 블록
        classVar = "Class Variable";
    }

    {                       // 인스턴스 초기화 블록
        instanceVar = "Instance Variable";
    }

    Class() {                // 생성자
        constructor = "Constructor";
    }

    void instanceMethod() {       // 인스턴스 메서드
        System.out.println(instanceVar);
    }

    static void classMethod() {   // 클래스 메서드
        System.out.println(classVar);
    }
}

public class Main{
    public static void main(String[] arg){
        Class myclass = new Class();
    }
}