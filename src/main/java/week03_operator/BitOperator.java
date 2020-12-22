package week03_operator;

public class BitOperator {
    public static void main(String[] args) {
        int a = 9;
        System.out.println(Integer.toBinaryString(a)); //바이너리로 변환
        System.out.println("~10진수 : " + ~a);
        System.out.println("~2진수 : " + Integer.toBinaryString(~a));

        System.out.println("==============");
        int binaryToDecimal = Integer.parseInt("1111111111111111111111111110110",2);
        System.out.println(binaryToDecimal);

        System.out.println("==============");
        System.out.println(Integer.MIN_VALUE+" ~ "+ Integer.MAX_VALUE);

        int b = -1;
        System.out.println(Integer.toBinaryString(b)); //바이너리로 변환
        System.out.println(Integer.parseInt("1111111111111111111111111111111",2));
//        System.out.println(Integer.parseInt("11111111111111111111111111111111",2));//NumberFormatException

        System.out.println("==============");
        int x = 9;
        int y = 11;

        System.out.println(Integer.toBinaryString(x)); //바이너리로 변환
        System.out.println(Integer.toBinaryString(y)); //바이너리로 변환
        System.out.println("AND 연산 10진수 : " + (x & y));
        System.out.println("AND 연산 2진수 : " + Integer.toBinaryString(x & y));
        System.out.println("OR  연산 10진수 : " + (x | y));
        System.out.println("OR  연산 2진수 : " + Integer.toBinaryString(x | y));
        System.out.println("XOR 연산 10진수 : " + (x ^ y));
        System.out.println("XOR 연산 2진수 : " + Integer.toBinaryString(x ^ y));

        System.out.println("====");
        int j = 16;

        System.out.println("2진수  :"+Integer.toBinaryString(j));
        System.out.println("2진수  :"+Integer.toBinaryString(-j));
        System.out.println(j >> 3);
        System.out.println(Integer.toBinaryString((j >> 3)));
        System.out.println(-j >>> 3);
        System.out.println(Integer.toBinaryString((-j >>> 3)));

        //일반적인 중간값 구하기
        int start = 0;
        int end = 10;
        int mid = (start+end) /2; //5

        //int 범위를 넘어선다면?
        start = 2_000_000_000;
        end = 2_100_000_000; //Integer.MAX_VALUE = 2147483647
        mid =  (start+end) /2; //-97483648

        //이렇게 해보자
        mid = start + (end - start) / 2; //2050000000

        //양수인 경우 아래와 같이 처리도 가능하다
        mid = (start+end)>>>1;//2050000000
    }
}
