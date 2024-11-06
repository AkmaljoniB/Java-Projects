package Codeforces;

import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine().replace(" ","");
        String s = "YES";
        for (int i = 0; i < s2.length(); i++) {
            if (s1.contains(s2.substring(i, i + 1))) s1 = s1.replaceFirst(s2.substring(i, i + 1), "");
            else {
                s = "NO";
                break;
            }
        }
        System.out.println(s);
    }
}
