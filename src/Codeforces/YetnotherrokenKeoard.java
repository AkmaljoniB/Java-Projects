package Codeforces;

import java.util.Scanner;

public class YetnotherrokenKeoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int b = 0, B = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                if (c == 'b') b++;
                else if (c == 'B') B++;
                else if (c >= 'A' && c <= 'Z' && B > 0) B--;
                else if (c >= 'a' && c <= 'z' && b > 0) b--;
                else sb.append(c);
            }
            System.out.println(sb.reverse());
        }
    }
}
