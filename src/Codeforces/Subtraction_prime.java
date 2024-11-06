package Codeforces;

import java.util.Scanner;

public class Subtraction_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            System.out.println(x-y==1?"NO":"YES");
        }
    }
}
