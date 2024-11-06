package Codeforces;

import java.util.Scanner;

public class Thermostat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == b) System.out.println(0);
            else if (Math.abs(b - a )>= x) System.out.println(1);
            else if (a + x <= r || a - x >= l) {
                if (b + x <= r || b - x >= l) {
                    if ((Math.abs(l-a)>=x && Math.abs(l-b)>=x)||(Math.abs(r-a)>=x && Math.abs(r-b)>=x)) System.out.println(2);
                    else System.out.println(3);
                }else System.out.println(-1);
            } else System.out.println(-1);
        }
    }
}
