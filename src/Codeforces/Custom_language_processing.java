package Codeforces;

import java.util.Scanner;

public class Custom_language_processing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int p = 0;
            for (int i = 0; i < s.length() - 2; i++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e') {
                    if (s.charAt(i + 2) != 'a' && s.charAt(i + 2) != 'e') {
                        System.out.print(s.substring(i - 1, i + 2) + ".");
                        p = i + 2;
                    } else {
                        System.out.print(s.substring(i - 1, i + 1) + ".");
                        p=i+1;
                    }
                }
            }
            System.out.println(s.substring(p));
        }
    }
}