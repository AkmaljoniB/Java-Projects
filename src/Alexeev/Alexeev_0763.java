package Alexeev;

import java.util.Scanner;

public class Alexeev_0763 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x == y && x == 1) System.out.println(0);
        else System.out.println(x==y?2:1);
    }
}