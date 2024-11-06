package Codeforces;

import java.util.Scanner;

public class Da_da {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String full = "YesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYes";
        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            if (full.contains(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}