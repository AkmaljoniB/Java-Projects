package Codeforces;

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                s = s.concat("I hate that");
            } else {
                s = s.concat(" I love that ");
            }
        }
        int a =4;
        if (n % 2 == 0) {
            a=5;
        }
        System.out.println(s.substring(0, s.length() - a).concat("it"));
    }
}