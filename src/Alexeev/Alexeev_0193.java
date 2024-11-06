package Alexeev;

import java.math.BigInteger;
import java.util.Scanner;

public class Alexeev_0193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger y;
        y = a.subtract(b);
        System.out.println(y);
    }
}
