package week08_interface;

interface Champion{
    void print();
}
interface AdCarry extends Champion{
    void dealing();
}
interface Supporter extends Champion{
    void crowdControlling();
}

public class Ashe implements AdCarry, Supporter{//다중 구현
    @Override
    public void print() {
        System.out.println("name : "+this.getClass().getSimpleName());
    }

    @Override
    public void dealing() {
        System.out.println(this.getClass().getSimpleName()+" can deal");
    }

    @Override
    public void crowdControlling() {
        System.out.println(this.getClass().getSimpleName()+" can CC");
    }

    public static void main(String[] args) {
        Ashe ashe = new Ashe();
        ashe.print();
        ashe.dealing();
        ashe.crowdControlling();
    }
}
