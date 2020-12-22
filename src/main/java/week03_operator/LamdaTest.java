package week03_operator;

interface ITest{
    int function(int a);
}

class CTest {
    public void function(ITest itest){
        int value = itest.function(3);
        System.out.println(value);
    }
}

class LamdaTest{
    public static void main(String[] args) {
        CTest cTest = new CTest ();
        // non lambda
        cTest.function(new ITest() {
            public int function(int a){
                return a + 2;
            }
        });
        // lambda expression
        cTest.function((a) ->{
            return a + 2;
        });
    }
}
