package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Noldbach_problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int p=5;
        String s = k==0?"YES":"NO";
        for (int i = 7; i <= n-p; i++) {
            BigInteger a = BigInteger.valueOf(i);
            if (a.isProbablePrime((int) Math.log(i))) {
                a=a.add(BigInteger.valueOf(p)).add(BigInteger.ONE);
                if (a.isProbablePrime((int) Math.log(i+p)))k--;
                p= i;
                if (k==0){
                    s="YES";
                    break;
                }
            }
        }
        System.out.println(s);
    }
}
