package Alexeev;

import java.util.Scanner;

public class Alexeev_0841 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        System.out.println(n==0?1:2+n*(n-1));
    }
}
