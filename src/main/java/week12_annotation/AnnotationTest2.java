package week12_annotation;

import java.lang.annotation.Annotation;

public class AnnotationTest2 {
    public static void main(String[] args) {
        TestClass_source testClassSource = new TestClass_source();
        for ( Annotation annotation : testClassSource.getClass().getAnnotations()){
            System.out.println(annotation.toString());
        }
        TestClass_Class testClassClass = new TestClass_Class();
        for ( Annotation annotation : testClassClass.getClass().getAnnotations()){
            System.out.println(annotation.toString());
        }
        TestClass_RUNTIME testClassRuntime = new TestClass_RUNTIME();
        for ( Annotation annotation : testClassRuntime.getClass().getAnnotations()){
            System.out.println(annotation.toString());
        }
    }
}

@TestAnnotation_SOURCE(name = "Annotation1 SOURCE")
class TestClass_source{ }
@TestAnnotation_CLASS(name = "Annotation2 CLASS")
class TestClass_Class{ }
@TestAnnotation_RUMTIME(name = "Annotation3 RUNTIME")
class TestClass_RUNTIME{ }