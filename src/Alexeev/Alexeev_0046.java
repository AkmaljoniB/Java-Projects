package Alexeev;

import java.util.Scanner;

public class Alexeev_0046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String s = "2.7182818284590452353602875";
        if (a == 0) System.out.println(3);
        else if (a == 25) System.out.println(s);
        else {
            System.out.print(s.substring(0, a + 1));
            int b = Integer.parseInt(s.substring(a + 1, a + 2));
            int c = Integer.parseInt(s.substring(a + 2, a + 3));
            if (c >= 5) System.out.print(b + 1);
            else System.out.print(b);
        }
    }
}