package week06_Inheritance;

public class DynamicDispatch{

    public static void main(String[] args){
        Service svc = new MyService1();
        svc.run();//Dinamic Method Dispatch
    }

}

abstract class Service{
    abstract void run();
}

class MyService1 extends Service{
    @Override
    void run(){
        System.out.println(this.getClass().getName());
    }
}

class MyService2 extends Service{
    @Override
    void run(){
        System.out.println(this.getClass().getName());
    }
}
