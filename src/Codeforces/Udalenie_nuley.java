package Codeforces;

import java.util.Scanner;

public class Udalenie_nuley {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            for (int j = 0; j < s.length(); j++) {
                if (s.substring(j, j + 1).equals("1")) {
                    s = s.substring(j);
                    break;
                }
            }
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.substring(j, j + 1).equals("1")) {
                    s = s.substring(0, j + 1);
                    break;
                }
            }
            int l = s.length();
            s = s.replace("0", "");
            if (s.length() == 0) {
                System.out.println(0);
            } else {
                System.out.println(l - s.length());
            }
        }
    }
}