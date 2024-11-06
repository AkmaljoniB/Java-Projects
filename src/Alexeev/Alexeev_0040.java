package Alexeev;

import java.math.BigInteger;
import java.util.Scanner;

public class Alexeev_0040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        BigInteger b = BigInteger.valueOf(2);
        System.out.println(b.pow(a));
    }
}