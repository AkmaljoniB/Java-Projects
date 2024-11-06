package Codeforces;

import java.util.Scanner;

public class Politseyskie_rekruti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        int v = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a > 0) {
                k = k + a;
            } else {
                if ((k + a) >= 0) {
                    k--;
                } else {
                    v++;
                }
            }
        }
        System.out.println(v);
    }
}
