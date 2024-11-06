package Codeforces;

import java.util.Scanner;

public class Schastlivie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        for (int i = 0; i < Integer.parseInt(n); i++) {
            String a = scanner.nextLine();
            int s1 = Integer.parseInt(a.substring(0, 1)) + Integer.parseInt(a.substring(1, 2)) + Integer.parseInt(a.substring(2, 3));
            int s2 = Integer.parseInt(a.substring(3, 4)) + Integer.parseInt(a.substring(4, 5)) + Integer.parseInt(a.substring(5, 6));
            if (s1 == s2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}