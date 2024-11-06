package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

public class Alexeev_0925 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[3];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        Arrays.sort(arr);
        if (m == 2) System.out.println(arr[0]);
        else System.out.println(Math.max(arr[0] + arr[1] + arr[2] - 2 * n, 0));
    }
}