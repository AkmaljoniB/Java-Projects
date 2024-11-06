package Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]arr = new int[n];
        int[]arr1 = new int[0] ;
        for (int i = 0; i <arr.length; i++){
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i <arr.length; i++){
//            if (){
//                arr1 = arr[i];
//            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
