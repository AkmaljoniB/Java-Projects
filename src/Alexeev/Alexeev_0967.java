package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

public class Alexeev_0967 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            String s1 = Integer.toString(a, k1);
            String s2 = Integer.toString(a, k2);
            int sum1 = 0, sum2 = 0;
            for (int j = 0; j < s1.length(); j++) sum1 += Integer.parseInt(s1.substring(j, j + 1));
            for (int j = 0; j < s2.length(); j++) sum2 += Integer.parseInt(s2.substring(j, j + 1));
            arr[i]=sum1*sum2;
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
