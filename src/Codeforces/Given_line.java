package Codeforces;

import java.util.Scanner;

public class Given_line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int max = 0, k = 2;
        out:
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < k + i; j++) {
                if (s.substring(j - i).contains(s.substring(j - 1 - i, s.length() - i + j - k))) {
                    max = Math.max(max, s.length()-k+1);
                    break out;
                }
            }
            k++;
        }
        System.out.println(max);
    }
}
