package Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Massive_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (i % 2 == 0 ) {
                arr1[i] =arr[i] ;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}