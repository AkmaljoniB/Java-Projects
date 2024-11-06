package Codeforces;

import java.util.Scanner;

public class Filling_in_forms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        if (n%2==0) System.out.println((int)Math.pow(2,n/2));
        else System.out.println(0);
    }
}
