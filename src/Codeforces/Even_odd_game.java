package Codeforces;

import java.util.*;

public class Even_odd_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            long a = 0, b = 0;
            int l = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] % 2 == 0 && l == 0) a += arr[i];
                else if (arr[i] % 2 != 0 && l == 1) b += arr[i];
                l ^= 1;
            }
            if (a > b) System.out.println("Alice");
            else if (a < b) System.out.println("Bob");
            else System.out.println("Tie");
        }
    }
}
