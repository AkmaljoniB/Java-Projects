package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Two_dividers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if (b%a==0) System.out.println(b*b/a);
            else System.out.println(a*b/Integer.parseInt(String.valueOf(BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)))));
        }
    }
}