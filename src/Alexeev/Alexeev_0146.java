package Alexeev;

import java.util.Scanner;

public class Alexeev_0146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long i = 1;
        while (i * i <= a) {
            i++;
        }
        System.out.println(i-1);
    }
}