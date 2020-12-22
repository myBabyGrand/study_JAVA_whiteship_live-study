package week03_operator;

public class ShiftOperator {
    public static void main(String[] args) {
        int i =  100;
        System.out.println("2진수  :"+Integer.toBinaryString(i));
        System.out.println((i<<1)+" "+(i*2));
        System.out.println((i<<2)+" "+(i*4));
        System.out.println((i<<3)+" "+(i*8));
        System.out.println((i<<4)+" "+(i*16));
        System.out.println((i>>1)+" "+(i/2));
        System.out.println((i>>2)+" "+(i/4));
        System.out.println((i>>3)+" "+(i/8));
        System.out.println((i>>4)+" "+(i/16));
    }
}
