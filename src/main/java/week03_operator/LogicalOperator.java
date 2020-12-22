package week03_operator;

public class LogicalOperator {
    public static void main(String[] args) {
        int i = 0;
        boolean b = false;
        System.out.println("===");
        if(b & (i++>0)) {
            System.out.println("AND Operation Passed");
        }else{
            System.out.println("AND Operation NOT Passed");
        }
        if(!b | (i++>0)) {
            System.out.println("OR Operation Passed");
        }else{
            System.out.println("OR Operation NOT Passed");
        }
        System.out.println("i : "+i);
        System.out.println("===");
        boolean b1 = true;
        boolean b2 = true;
        System.out.println(b1^b2);
        System.out.println(!b1^b2);
        System.out.println(b1^!b2);
        System.out.println(!b1^!b2);
    }
}
