package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Less_than_or_equal_to {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        if (n == k) System.out.println(arr[n - 1]);
        else if (k == 0) System.out.println(arr[0] == 1 ? -1 : 1);
        else if (n == 1) System.out.println(arr[0]);
        else if (arr[k - 1].equals(arr[k])) System.out.println(-1);
        else System.out.println(arr[k - 1]);
    }
}