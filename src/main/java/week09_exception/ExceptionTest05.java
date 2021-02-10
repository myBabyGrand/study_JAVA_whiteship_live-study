package week09_exception;

import java.io.IOException;

public class ExceptionTest05 {
    public static void main(String[] args) {
        try{
            chinedExceptionTest(null);
        }catch (Exception e){
            System.out.println("exception occur!");
            e.printStackTrace();
        }
    }
    static void chinedExceptionTest(String fileNm){
        try{
            if(fileNm == null){
                throw new IOException("file name is null");
            }
        }catch(IOException e){
            RuntimeException runtimeException = new RuntimeException();
            runtimeException.initCause(e);
            throw runtimeException;
        }
    }
}
