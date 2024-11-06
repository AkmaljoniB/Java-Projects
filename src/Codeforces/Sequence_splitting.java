package Codeforces;

import java.util.Scanner;

public class Sequence_splitting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        if ((n%2==0 && n/2%2==0)||((n+1)/2%2==0)) System.out.println(0);
        else System.out.println(1);
    }
}