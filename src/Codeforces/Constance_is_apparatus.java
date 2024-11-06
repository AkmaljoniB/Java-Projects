package Codeforces;

import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Constance_is_apparatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Map<Integer, Integer> map = new TreeMap<>();
        int k = 0, l = 0;
        if (s.contains("m") || s.contains("w")) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'u') k++;
            else if (k!=0){
                if (k > 1) map.put(k, map.getOrDefault(k, 0) + 1);
                k = 0;
            }
            if (s.charAt(i) == 'n') l++;
            else if (l!=0){
                if (l > 1) map.put(l, map.getOrDefault(l, 0) + 1);
                l = 0;
            }
        }
        if (l > 1) map.put(l, map.getOrDefault(l, 0) + 1);
        if (k > 1) map.put(k, map.getOrDefault(k, 0) + 1);
        BigInteger b = BigInteger.TWO;
        BigInteger c = BigInteger.ONE;
        BigInteger e = BigInteger.ONE;
        BigInteger f;
        int i = 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            for (int j = i; j < entry.getKey(); j++) {
                f = b;
                b = b.add(e);
                e = f;
            }
            BigInteger d = b;
            d = d.pow(entry.getValue());
            c = c.multiply(d);
            c = c.mod(BigInteger.valueOf(1000000007));
            i = entry.getKey();
        }
        System.out.println(c);
    }
}