package Codeforces;

import java.util.Scanner;

public class Keanu_Reeves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if (s.length() - s.replace("0", "").length() == s.replace("0", "").length()) System.out.println("2\n" + s.charAt(0) + " " + s.substring(1));
        else System.out.println("1\n" + s);
    }
}
