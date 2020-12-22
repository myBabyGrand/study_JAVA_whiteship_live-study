package week02_dataType;

import java.util.Arrays;

import static java.util.Arrays.*;

public class ArrayTest {
    static int [] arr1;
    static int [][] arr2;
    public static void main(String[] args) {
        arr1 = new int[5];
        System.out.println("1차원 배열");
        for(int i=0;i<arr1.length;i++){
            arr1[i] = i;
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }


        System.out.println("\n"+"2차원 배열");
        arr2 = new int[5][5];
        int k=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j] = k++;
            }
        }
        for (int i=0;i<arr2.length;i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}