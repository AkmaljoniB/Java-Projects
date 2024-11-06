package Codeforces;

import java.util.Scanner;

public class Bistriy_matematic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.substring(i, i + 1).equals("1") && s2.substring(i, i + 1).equals("1")) {
                s = s.concat("0");
            } else if (s1.substring(i, i + 1).equals("1") || s2.substring(i, i + 1).equals("1")) {
                s = s.concat("1");
            } else {
                s = s.concat("0");
            }
        }
        System.out.println(s);
    }
}