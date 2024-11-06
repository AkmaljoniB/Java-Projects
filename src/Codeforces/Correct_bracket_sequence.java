package Codeforces;

import java.util.Scanner;

public class Correct_bracket_sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int l = s.length()-s.replace("?","").length();
            if (l%2!=0|| s.charAt(0) == ')' || s.endsWith("(")){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}