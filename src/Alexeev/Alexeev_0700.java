package Alexeev;

import java.util.Scanner;

public class Alexeev_0700 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int v = scanner.nextInt();
        int k = scanner.nextInt();
        long s = v;
        String b = "YES";
        for (int i = 1; i < n; i++) {
            if (v - (k * i) <= 0) {
                b = "NO";
                break;
            }
            s += v - ((long) k * i);
        }
        System.out.println(b + " " + s);
    }
}
