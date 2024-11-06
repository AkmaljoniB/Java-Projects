package Codeforces;

import java.util.*;

public class Cube_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            String s = "NO";
            arr[0] = sc.nextInt();
            for (int i = 1; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i - 1] <= arr[i]) s = "YES";
            }
            System.out.println(s);
        }
    }
}