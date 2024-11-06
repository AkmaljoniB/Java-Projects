package Codeforces;

import java.util.Scanner;

public class Zauradniye_chisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            if (t < 10) {
                System.out.println(t);
            } else {
                String s = String.valueOf(t);
                int a = (s.length() - 1) * 9;
                if (Integer.parseInt(s.substring(0, 1)) < Integer.parseInt(s.substring(1, 2))) {
                    a = a + Integer.parseInt(s.substring(0, 1));
                } else {
                    int f = 1;
                    for (int j = 1; j < s.length(); j++) {
                        if (Integer.parseInt(s.substring(0, 1)) == Integer.parseInt(s.substring(j, j + 1))) {
                            f++;
                        } else if (Integer.parseInt(s.substring(0, 1)) < Integer.parseInt(s.substring(j, j + 1))) {
                            f = s.length();
                            break;
                        } else {
                            break;
                        }
                    }
                    if (f == s.length()) {
                        a = a + Integer.parseInt(s.substring(0, 1));
                    } else {
                        a = a + Integer.parseInt(s.substring(0, 1)) - 1;
                    }
                }
                System.out.println(a);
            }
        }
    }
}