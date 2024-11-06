package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Prazdnik_ravenstva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int s=0;
        for (int i = 0; i < n-1; i++) {
            s+=arr[n-1]-arr[i];
        }
        System.out.println(s);
    }
}