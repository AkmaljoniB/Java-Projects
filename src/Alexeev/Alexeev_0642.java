package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

public class Alexeev_0642 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int p = 0, t = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (p + arr[i] <= s) {
                p = p + arr[i];
                t++;
            } else break;
        }
        System.out.println(t);
    }
}