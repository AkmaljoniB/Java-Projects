package Codeforces;

import java.util.Scanner;

public class Perevod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = scanner.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if (s1.contentEquals(sb)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}