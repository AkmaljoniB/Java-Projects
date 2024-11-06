package Codeforces;

import java.util.Scanner;

public class I_hate_1111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            while (x > 110 && x % 11 != 0) x -= 111;
            System.out.println(x % 11 == 0 ? "YES" : "NO");
        }
    }
}
