package Codeforces;

import java.util.Scanner;

public class Odyssey_of_Hamon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            int s = arr[0], k = 0;
            for (int i = 0; i < n; i++) {
                s = s & arr[i];
                if (s == 0) {
                    k++;
                    s = i + 1 < n ? arr[i + 1] : 0;
                }
            }
            System.out.println(k == 0 ? 1 : k);
        }
    }
}