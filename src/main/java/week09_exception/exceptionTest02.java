package week09_exception;

import java.util.LinkedList;

public class exceptionTest02 {
    public static void main(String[] args) {
        LinkedList<String> list;
        try{
            list = new LinkedList<>();
            System.out.println(list.get(0));
        }catch(IndexOutOfBoundsException e1){
            System.out.println("catch! IndexOutOfBoundsException");
        }catch(RuntimeException e2){
            System.out.println("catch! RuntimeException");
        }
    }
}
