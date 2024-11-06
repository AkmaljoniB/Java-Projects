package Alexeev;

import java.util.Scanner;

public class Alexeev_0008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        if ((a *b) == c){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}