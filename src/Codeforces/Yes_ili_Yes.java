package Codeforces;

import java.util.Scanner;

public class Yes_ili_Yes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int a = 0;
        for (int i = 0; i < Integer.parseInt(n); i++) {
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("Yes")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}