package Alexeev;

import java.math.BigInteger;
import java.util.Scanner;

public class Alexeev_0085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger e = new BigInteger(String.valueOf(scanner.nextInt()));
        BigInteger f = new BigInteger(String.valueOf(scanner.nextInt()));
        e=e.gcd(f);
        for (int i = 0; i < Integer.parseInt(String.valueOf(e)); i++) System.out.print("1");
    }
}
