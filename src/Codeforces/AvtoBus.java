package Codeforces;

import java.util.Scanner;

public class AvtoBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            if (n % 2 != 0 || n<4) System.out.println(-1);
            else {
                long l = n/6;
                l = n%6!=0?l+1:l;
                System.out.println(l+" "+(n/4));
            }
        }
    }
}
