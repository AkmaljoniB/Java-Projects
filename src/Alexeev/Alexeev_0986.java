package Alexeev;

import java.util.Scanner;

public class Alexeev_0986 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int x= scanner.nextInt();
        int y= scanner.nextInt();
        int l =scanner.nextInt();
        String s = "Yes";
        for (int i = 1; i <= n; i++) {
            int xi =scanner.nextInt();
            int yi =scanner.nextInt();
            if (s.equals("Yes") && Math.pow(xi-x, 2) + Math.pow(yi-y, 2)<=l*l)s= String.valueOf(i);
        }
        System.out.println(s);
    }
}
