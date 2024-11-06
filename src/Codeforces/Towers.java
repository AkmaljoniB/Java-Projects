package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Towers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int k = 1, l = 1, max = 1;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i +1]) k++;
            else {
                max = Math.max(max, k);
                l++;
                k=1;
            }
        }
        System.out.println(Math.max(max,k)+" "+l);
    }
}