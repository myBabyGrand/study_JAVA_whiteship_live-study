package week06_Inheritance;

public class StaticDispatch{

    static class Service{
        void run(){
            System.out.println("run");
        }

        void run(String msg){
            System.out.println(msg);
        }
    }

    public static void main(String[] args){
        new Service().run();
    }
}