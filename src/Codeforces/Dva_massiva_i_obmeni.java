package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Dva_massiva_i_obmeni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            int min1 = Integer.MAX_VALUE, max2 = 0;
            int s = 0;
            for (int i = 0; i < n; i++) {
                arr1[i] = scanner.nextInt();
                min1 = Math.min(min1, arr1[i]);
                s += arr1[i];
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = scanner.nextInt();
                max2 = Math.max(max2, arr2[i]);
            }
            if (min1 >= max2) {
                System.out.println(s);
            } else {
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                for (int i = 0; i < k; i++) {
                    int q = s;
                    s+=arr2[n-1-i]-arr1[i];
                    if (s<q){
                        s=q;
                        break;
                    }
                }
                System.out.println(s);
            }
        }
    }
}