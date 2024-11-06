package Alexeev;

import java.math.BigInteger;
import java.util.Scanner;

public class Alexeev_0079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        String s = String.valueOf(b);
        int c = Integer.parseInt(s);
        String p = String.valueOf(a.pow(c));
        System.out.println(p.substring(p.length()-1));
    }
}
