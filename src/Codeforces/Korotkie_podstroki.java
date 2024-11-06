package Codeforces;

import java.util.Scanner;

public class Korotkie_podstroki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        for (int i = 0; i < Integer.parseInt(n); i++) {
            String s = scanner.nextLine();
            String str = "";
            for (int j = 0; j < s.length() - 1; j += 2) {
                if (str.length() >= 2 && str.substring(str.length() - 1).equals(s.substring(j, j + 1))) {
                    str = str.concat(s.substring(j + 1, j + 2));
                } else {
                    str = str.concat(s.substring(j, j + 2));
                }
            }
            System.out.println(str);
        }
    }
}