package Codeforces;

import java.util.Scanner;

public class Kapitalizatsiya_Slova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.substring(0,1).toUpperCase().concat(s.substring(1));
        System.out.println(s);
    }
}