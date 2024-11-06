package Codeforces;

import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            long s = a + b + c;
            if (s%9==0 && Math.min(a,Math.min(b,c))>=s/9) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}