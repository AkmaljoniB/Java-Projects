package Alexeev;

import java.util.Scanner;

public class Alexeev_0893 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 3) System.out.println(n);
        else System.out.println((long) n * (n-1)*(n-2));
    }
}
