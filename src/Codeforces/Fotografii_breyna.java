package Codeforces;

import java.util.Scanner;

public class Fotografii_breyna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = 0;
        for (int i = 0; i < n * m; i++) {
            String s = scanner.next();
            if (k == 0 && (s.equals("C") || s.equals("M") || s.equals("Y"))) {
                System.out.println("#Color");
                k++;
                break;
            }
        }
        if (k == 0) {
            System.out.println("#Black&White");
        }
    }
}