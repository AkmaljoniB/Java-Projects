package Codeforces;

import java.util.Scanner;

public class Restoring_small_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String a = "abcdefghijklmnopqrstuvwxyz";
        while (t-- > 0) {
            int k = sc.nextInt();
            if (k < 29) {
                System.out.println("aa" + (a.charAt(k - 3)));
            } else if (k <= 53) {
                System.out.println("a" + (a.charAt(k - 28)) + "z");
            } else {
                System.out.println((a.charAt(k - 53)) + "zz");
            }
        }
    }
}

