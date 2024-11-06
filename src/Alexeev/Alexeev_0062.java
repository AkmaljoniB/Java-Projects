package Alexeev;

import java.util.Scanner;

public class Alexeev_0062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int b = Integer.parseInt(s.substring(1, 2));
        int a = "ABCDEFGH".indexOf(s.substring(0, 1)) + 1;
        if ((a + b) % 2 == 0) System.out.println("BLACK");
        else System.out.println("WHITE");
    }
}
