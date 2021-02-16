package week12_annotation;


import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationTest {
    public static void main(String[] args) {
        Method[] methods = TestClass.class.getMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(TestAnnotation.class)){
                System.out.println(method.getName());
                TestAnnotation annotation = method.getDeclaredAnnotation(TestAnnotation.class);
                System.out.println(annotation.name());
                System.out.println(annotation.ver());
                System.out.println(Arrays.toString(annotation.arr()));
                System.out.println(annotation.solarSystem());
            }
        }
    }
}

class TestClass{
    @TestAnnotation(name = "majorTom", arr = {"KAKAO", "NAVER", "WOOAH"}, ver = 0)
    public void TestMethod(){    }
}
