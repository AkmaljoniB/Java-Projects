package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

public class Alexeev_0648 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int s = 0, s1 = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            s += arr[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) s1 += arr[i];
        System.out.println(s-2*s1);
    }
}
