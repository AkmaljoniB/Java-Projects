package Codeforces;

import java.util.Scanner;

public class Target_shooting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int k = 0;
            for (int i = 1; i <= 10; i++) {
                String s = scanner.next();
                if (i == 1 || i == 10) {
                    k += s.length() - s.replace("X", "").length();
                    continue;
                } else {
                    String p = s.substring(0, 1) + s.substring(9);
                    k += p.length() - p.replace("X", "").length();
                }
                if (i == 2 || i == 9) {
                    s = s.substring(1, 9);
                    k += (s.length() - s.replace("X", "").length()) * 2;
                    continue;
                } else {
                    String p = s.substring(1, 2) + s.substring(8, 9);
                    k += (p.length() - p.replace("X", "").length()) * 2;
                }
                if (i == 3 || i == 8) {
                    s = s.substring(2, 8);
                    k += (s.length() - s.replace("X", "").length()) * 3;
                    continue;
                } else {
                    String p = s.substring(2, 3) + s.substring(7, 8);
                    k += (p.length() - p.replace("X", "").length()) * 3;
                }
                if (i == 4 || i == 7) {
                    s = s.substring(3, 7);
                    k += (s.length() - s.replace("X", "").length()) * 4;
                    continue;
                } else {
                    String p = s.substring(3, 4) + s.substring(6, 7);
                    k += (p.length() - p.replace("X", "").length()) * 4;
                }
                    s = s.substring(4, 6);
                    k += (s.length() - s.replace("X", "").length()) * 5;
            }
            System.out.println(k);
        }
    }
}