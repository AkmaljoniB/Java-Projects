package Alexeev;

import java.util.Scanner;

public class Alexeev_0843 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long f = scanner.nextLong();
        long l = scanner.nextLong();
        System.out.println(n-l-(n-l-f)-(n-l-m));
        System.out.println(n-l-f);
        System.out.println(n-l-m);
    }
}
