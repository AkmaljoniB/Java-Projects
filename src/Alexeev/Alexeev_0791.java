package Alexeev;

import java.util.Scanner;

public class Alexeev_0791 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a>8) System.out.print((a-8)+" ");
        if ((a - 1) % 8 != 0) System.out.print((a - 1) + " ");
        if (a % 8 != 0) System.out.print((a + 1) + " ");
        if (a < 57) System.out.print(a + 8);
    }
}