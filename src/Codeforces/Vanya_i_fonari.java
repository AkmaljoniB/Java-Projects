package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Vanya_i_fonari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        double max = 0;
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i] - arr[i-1]);
        }
        max = Math.max(max/2,Math.max(arr[0],l-arr[n-1]));
        String s = String.format("%.10f",max);
        s = s.replace(",", ".");
        System.out.println(s);
    }
}