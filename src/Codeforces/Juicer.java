package Codeforces;

import java.util.Scanner;

public class Juicer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        int s = 0, k = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a <= b) s += a;
            if (s > d) {
                k++;
                s = 0;
            }
        }
        System.out.println(k);
    }
}
