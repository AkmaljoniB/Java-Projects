package Codeforces;

import java.util.Scanner;

public class Kto_naprotiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int abs = Math.abs(a - b);
            if (abs * 2 >= a && abs * 2 >= b &&abs * 2 >= c) {
                if (c+abs<=abs*2){
                    System.out.println(c+abs);
                } else {
                    System.out.println(c-abs);
                }
            } else {
                System.out.println(-1);
            }
        }
    }
}