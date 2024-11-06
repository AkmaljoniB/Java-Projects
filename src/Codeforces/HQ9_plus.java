package Codeforces;

import java.util.Scanner;

public class HQ9_plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("H") || s.substring(i, i + 1).equals("Q") || s.substring(i, i + 1).equals("9")) {
                System.out.println("YES");
                a++;
                break;
            }
        }
        if (a == 0) {
            System.out.println("NO");
        }
    }
}