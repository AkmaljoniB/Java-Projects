package Alexeev;

import java.math.BigInteger;
import java.util.Scanner;

public class Alexeev_0021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger c = scanner.nextBigInteger();
        BigInteger y, z, d, l, m;
        y = a.max(b);
        z = y.max(c);
        d = a.min(b);
        l = d.min(c);
        m = z.subtract(l);
        System.out.println(m);
    }
}