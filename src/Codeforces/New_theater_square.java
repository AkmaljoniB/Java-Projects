package Codeforces;

import java.util.Scanner;

public class New_theater_square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                String s = scanner.next();
                if (x * 2 > y) {
                    sum += y * ((m - s.replace("..", "").length()) / 2);
                    s = s.replace("..", "");
                }
                sum += x * (s.length() - s.replace(".", "").length());
            }
            System.out.println(sum);
        }
    }
}