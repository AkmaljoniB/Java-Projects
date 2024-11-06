package Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Massive_1_do_9_chop_nakunad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > 9) {
                arr1[i] = arr[i] ;
            }
        }
        arr1 = Arrays.stream(arr1).filter(i -> i != 0).toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
