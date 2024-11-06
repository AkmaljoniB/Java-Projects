package Codeforces;

import java.util.Scanner;

public class Palindrome_game_simple_version {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            if (s.contains("0")) {
                if (s.replace("1", "").length() % 2 == 0||s.replace("1", "").length() == 1) System.out.println("BOB");
                else System.out.println("ALICE");
            } else System.out.println("DRAW");
        }
    }
}
