package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Shaas_and_Oskol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            if (x - 2 >= 0) arr[x - 2] += y - 1;
            if (x < n) arr[x] += arr[x - 1] - y;
            arr[x - 1] = 0;
        }
        String s = Arrays.toString(arr).substring(1);
        s = s.substring(0, s.length() - 1).replace(",", "");
        System.out.println(s);
    }
}