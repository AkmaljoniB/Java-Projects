package Codeforces;

import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String a = "abcdefgh";
        while (t-- > 0) {
            String s = scanner.next();
            for (int i = 1; i <= 8; i++) {
                if (!s.substring(1, 2).equals(String.valueOf(i))) System.out.println(s.substring(0,1) + i);
            }
            for (int i = 0; i < 8; i++) {
                if (a.charAt(i) != s.charAt(0)) System.out.println(a.charAt(i) +""+ s.charAt(1));
            }
        }
    }
}
