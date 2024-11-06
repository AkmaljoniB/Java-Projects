package Alexeev;

import java.util.Scanner;

public class Alexeev_0577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[10];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                String s = String.valueOf((i * j));
                for (int k = 0; k < s.length(); k++) arr[Integer.parseInt(s.substring(k, k + 1))]++;
            }
        }
        for (int i = 0; i < 10; i++) System.out.println(arr[i]);
    }
}