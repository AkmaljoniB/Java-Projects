package Alexeev;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Alexeev_0171 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        Map<Integer, Integer> map = new HashMap<>();
        while (a != 1) {
            for (int j = 2; j <= a; j++) {
                if (a % j == 0) {
                    BigInteger b = BigInteger.valueOf(j);
                    boolean p = b.isProbablePrime((int) Math.log(j));
                    if (p) map.put(j, map.getOrDefault(j, 0) + 1);
                    a /= j;
                    break;
                }
            }
        }
        int k = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) k *= (entry.getValue() + 1);
        System.out.println(k);
    }
}