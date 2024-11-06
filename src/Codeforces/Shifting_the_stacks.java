package Codeforces;

import java.util.Scanner;

public class Shifting_the_stacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long s = 0,l=0;
            String b="YES";
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                s += a;
                l+=i;
                if (s<l)b="NO";
            }
            System.out.println(b);
        }
    }
}
