package Codeforces;

import java.util.Scanner;

public class Pochti_schastlivoe_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("4")) {
                k++;
            }
            if (s.substring(i, i + 1).equals("7")) {
                k++;
            }
        }
        if (k==4 || k==7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}