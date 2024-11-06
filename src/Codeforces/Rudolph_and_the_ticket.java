package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Rudolph_and_the_ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            Integer[] arr = new Integer[n];
            Integer[] num = new Integer[m];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = 0; i < m; i++) num[i] = sc.nextInt();
            Arrays.sort(arr);
            Arrays.sort(num);
            int l = 0;
            for (Integer integer : arr) {
                for (int j = 0; j < m; j++) {
                    if (integer + num[j] <= k) l++;
                    else break;
                }
            }
            System.out.println(l);
        }
    }
}
