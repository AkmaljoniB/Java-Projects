package Codeforces;

import java.util.Scanner;

public class Favorite_palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        System.out.println(s+sb);
    }
}