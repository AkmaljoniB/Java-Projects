package Alexeev;

import java.util.Scanner;

public class Alexeev_0009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        int m = 0;
        int k = 1;
        int d = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                s = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                m = i;
            }
            if (arr[i]>0){
                d+=arr[i];
            }
        }
        if (s < m) {
            for (int i = s + 1; i < m; i++) {
                k *= arr[i];
            }
        } else {
            for (int i = m + 1; i < s; i++) {
                k *= arr[i];
            }
        }
        System.out.println(d);
        System.out.println(k);
    }
}