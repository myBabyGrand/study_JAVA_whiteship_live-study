package week09_exception;

public class ExceptionTest01 {
    public static void main(String[] args) {
        String name = "Ashe";
        System.out.println(name+" "+testMethod(name));
    }
    public static String testMethod(String str){
        try{
            System.out.println("try");
            return str;
        }catch(Exception e){
            System.out.println("exception");
            return "fail";
        }finally{
            System.out.println("finally");
            return "finally";
        }

    }
}
