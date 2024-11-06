package Codeforces;

import java.util.Scanner;

public class Napitki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double s =0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            s += a;
        }
        System.out.println(s/n);
    }
}
