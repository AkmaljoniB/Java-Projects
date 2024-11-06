package Codeforces;

import java.util.Scanner;

public class Basil_in_Cacak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long x = scanner.nextLong();
            if ((n - k+1 + n) * k / 2 >= x && (1+k)*k/2<=x) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}