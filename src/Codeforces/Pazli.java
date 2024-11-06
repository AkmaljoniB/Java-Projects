package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Pazli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <m-n+1; i++) {
            if (arr[i+n-1]-arr[i]<min){
                min = arr[i+n-1]-arr[i];
            }
        }
        System.out.println(min);
    }
}