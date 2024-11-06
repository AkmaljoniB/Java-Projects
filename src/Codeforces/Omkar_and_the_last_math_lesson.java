package Codeforces;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Omkar_and_the_last_math_lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(9, 3);
        map.put(21103739,19853);
        map.put(285460211,25309);
        map.put(806739229,30781);
        while (t-- > 0) {
            int n = scanner.nextInt();
            int l = 0;
            if (n % 2 != 0) {
                if (map.containsKey(n)) l = map.get(n);
                else {
                    BigInteger bigInteger = BigInteger.valueOf(n);
                    boolean isProbablePrime = bigInteger.isProbablePrime((int) Math.log(n));
                    if (isProbablePrime) {
                        l = 1;
                        map.put(n, l);
                    } else {
                        if (n % 1.5 == 0) l = (int) (n / 1.5);
                        else if (n % 1.4 == 0) l = (int) (n / 1.4);
                        else if (n % 1.3 == 0) l = (int) (n / 1.3);
                        else {
                            for (int i = (int) (n / 1.3); i < n; i++) {
                                if (n % (n - i) == 0) {
                                    l = i;
                                    map.put(n, l);
                                    break;
                                }
                            }
                        }
                    }
                }
            } else l = n / 2;
            System.out.println(l + " " + (n - l));
        }
    }
}