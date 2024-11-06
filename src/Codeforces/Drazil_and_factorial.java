package Codeforces;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Drazil_and_factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        BigInteger a = BigInteger.ONE;
        for (int i = 0; i < s.length(); i++) {
            a = a.multiply(BigInteger.valueOf(fact(Integer.parseInt(s.substring(i, i + 1)))));
        }
        List<Integer> list = new LinkedList<>();
        while (!a.equals(BigInteger.ONE)) {
            BigInteger i = BigInteger.TWO;
            while (!i.equals(a.add(BigInteger.ONE))) {
                if (a.mod(i).equals(BigInteger.ZERO)) {
                    a = a.divide(i);
                    list.add(Integer.parseInt(String.valueOf(i)));
                    break;
                }
                i = i.add(BigInteger.ONE);
            }
        }
        int l = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 != 0) {
                System.out.print(list.get(i));
                for (int j = 2; j < list.get(i); j++) {
                    int p = j;
                    while (p != 1) {
                        int e =7;
                        if (p % 2 == 0) e= 2;
                        else if (p % 3 == 0) e = 3;
                        else if (p%5==0)e = 5;
                        Object ob =e;
                        list.remove(ob);
                        p/=e;
                        i--;
                    }
                }
                l++;
                i = list.size() - l;
            } else System.out.print(list.get(i));
        }
        System.out.println();
    }

    static int fact(int a) {
        if (a == 0 || a == 1) return 1;
        return a * fact(a - 1);
    }
}