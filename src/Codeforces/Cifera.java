package Codeforces;

import java.util.Scanner;

public class Cifera {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        long k = scanner.nextLong();
        long l = scanner.nextLong();
        long p =0,o = k;
        while (o<l&&o>0){
            o*=k;
            p++;
        }
        if (o==l) {
            System.out.println("YES");
            System.out.println(p);
        } else {
            System.out.println("NO");
        }
    }
}
