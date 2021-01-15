package week06_Inheritance;

public class DynamicDispatch2 {

    public static void main(String[] args) {
        Interface01 interface01 = new Class02();
        System.out.println(interface01.getString());//Dinamic Method Dispatch
    }
}

interface Interface01{
    String getString();
}

class Class01 implements Interface01{

    @Override
    public String getString() {
        return this.getClass().getName();
    }

}

class Class02 implements Interface01{

    @Override
    public String getString() {
        return this.getClass().getName();
    }

}
