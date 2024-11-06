package Alexeev;

import java.util.Scanner;

public class Alexeev_0579 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int k = 0, l = 0,s1=0,s2=0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > 0) {
                k ++;
                s1+=arr[i];
            } else if (arr[i] < 0) {
                l ++;
                s2+=arr[i];
            }
        }
        int max = Math.max(s1, Math.abs(s2));
        System.out.println(max==s1?k:l);
        for (int i = 0; i < n; i++) {
            if (max == s1) {
                if (arr[i] > 0) System.out.print((i + 1) + " ");
            } else if (arr[i] < 0) System.out.println((i + 1) + " ");
        }
    }
}
