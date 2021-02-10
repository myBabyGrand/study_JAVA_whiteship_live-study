package week09_exception;

public class ExceptionTest04 {
    public static void main(String[] args) {
        try{
            testMethod1();
        }catch(Exception e){
            System.out.println("main exception Occur!");
        }
        System.out.println("----");
        try{
            testMethod2();
        }catch(Exception e){
            System.out.println("main exception Occur!");
        }

    }
    public static void testMethod1() {
        try {
            int i=1;
            int j = i/0 ;
        }catch (Exception e){
            System.out.println("testMethod1 exception Occur!");
        }
    }
    public static void testMethod2() throws Exception {
        try {
            int i=1;
            int j = i/0 ;
        }catch (Exception e){
            System.out.println("testMethod2 exception Occur!");
            throw e;
        }
    }
}
