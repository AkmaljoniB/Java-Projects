package Codeforces;

import java.util.Scanner;

public class Ten_words_of_wisdom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int max = 0, s = 0;
            for (int i = 1; i <= n; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (a <= 10 && max < b) {
                    max = b;
                    s = i;
                }
            }
            System.out.println(s);
        }
    }
}
