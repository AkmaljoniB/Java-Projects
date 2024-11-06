package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Two_round_dances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger a = BigInteger.ONE;
        for (int i = 2; i < n; i++) {
            a = a.multiply(BigInteger.valueOf(i));
        }
        System.out.println(a.divide(BigInteger.valueOf(n/2)));
    }
}
