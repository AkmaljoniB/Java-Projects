package Codeforces;

import java.util.Scanner;

public class Palindromic_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            if (s.charAt(0) != '9') {
                for (int i = 0; i < s.length(); i++) {
                    System.out.print(9 - Integer.parseInt(s.substring(i, i + 1)));
                }
                System.out.println();
            } else {
                int p = 0;
                StringBuilder q = new StringBuilder();
                for (int i = s.length()-1; i >=0; i--) {
                    int a = Integer.parseInt(s.substring(i, i + 1)) + p;
                    if (a < 2) {
                        q.append(1 - a);
                        p = 0;
                    } else {
                        p = 1;
                        q.append(11 - a);
                    }
                }
                q.reverse();
                System.out.println(q);
            }
        }
    }
}
