package Alexeev;

import java.util.Scanner;

public class Alexeev_0277 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && b == c && c == 0) System.out.println(0);
        else {
            String s = "";
            s = a != 0 ? String.valueOf(a) : s;
            if (b != 0) {
                if (b == 1 || b == -1) {
                    s = b == 1 ? s + "+x" : s + "-x";
                    if (s.length() == 2 && b==1) s = s.substring(1);
                } else if (s.length() == 0) s = b + "x";
                else s = b > 0 ? s + "+" + b + "x" : s + b + "x";
            }
            if (c != 0) {
                if (c == 1 || c == -1) {
                    s = c == 1 ? s + "+y" : s + "-y";
                    if (s.length() == 2 && c==1) s = s.substring(1);
                } else if (s.length() == 0) s = c + "y";
                else s = c > 0 ? s + "+" + c + "y" : s + c + "y";
            }
            System.out.println(s);
        }
    }
}