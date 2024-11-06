package Alexeev;

import java.util.Scanner;

public class Alexeev_0051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String s = scanner.next();
        int l = s.length();
        long sum = 1;
        while (k>1) {
            sum *= k;
            k -= l;
        }
        System.out.println(sum);
    }
}