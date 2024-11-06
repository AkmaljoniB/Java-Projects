package Codeforces;

import java.util.Scanner;

public class Mike_and_palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder sp = new StringBuilder(s);
        sp.reverse();
        if (s.length() == 1) System.out.println("YES");
        else if (s.equals(String.valueOf(sp)) && s.length() % 2 == 0) System.out.println("NO");
        else {
            String b = "NO";
            for (int i = 0; i < s.length() / 2; i++) {
                String p = s.substring(0, i) + s.substring(i + 1, s.length() - 1 - i) + s.substring(s.length() - i);
                StringBuilder sb = new StringBuilder(p);
                sb.reverse();
                if (p.equals(String.valueOf(sb))) {
                    b = "YES";
                    break;
                }
            }
            System.out.println(b);
        }
    }
}
