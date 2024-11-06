package Codeforces;

import java.util.Scanner;

public class Gazirovkopitie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int k =scanner.nextInt();
        int l =scanner.nextInt();
        int c =scanner.nextInt();
        int d =scanner.nextInt();
        int p =scanner.nextInt();
        int nl =scanner.nextInt();
        int np =scanner.nextInt();
        int min = Math.min(k*l/nl,Math.min(c*d,p/np));
        System.out.println(min/n);
    }
}