package Alexeev;

import java.math.BigInteger;
import java.util.Scanner;

public class Alexeev_0623 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger p = BigInteger.ONE, l = BigInteger.ZERO, h;
        for (int i = 1; i <= n%60; i++) {
            h = p;
            p = p.add(l);
            l = h;
        }
        System.out.println(p.mod(BigInteger.TEN));
    }
}
