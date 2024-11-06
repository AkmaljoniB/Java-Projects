package Codeforces;

import java.util.Scanner;

public class Palindromic_indices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int k = 1;
            for (int i = n / 2 + n % 2 - 1; i > 0; i--) {
                if (s.substring(i, i + 1).equals(s.substring(i - 1, i))) k++;
                else break;
            }
            k*=2;
            if (n%2!=0)k--;
            System.out.println(k);
        }
    }
}
