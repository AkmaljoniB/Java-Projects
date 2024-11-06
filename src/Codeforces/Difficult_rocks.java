package Codeforces;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Difficult_rocks {
    public static void main(String[] args) {
        PrintWriter pr = new PrintWriter(System.out);
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            int min = Integer.MAX_VALUE,l=0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] - arr[i] < min) {
                    min = arr[i + 1] - arr[i];
                    l = i;
                }
            }
            pr.print(arr[l] + " ");
            for (int i = l + 2; i < n; i++) pr.print(arr[i] + " ");
            for (int i = 0; i < l; i++) pr.print(arr[i] + " ");
            pr.println(arr[l+1]);
        }
        pr.close();
    }
}