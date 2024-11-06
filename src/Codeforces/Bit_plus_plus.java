package Codeforces;

import java.util.Scanner;

public class Bit_plus_plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int a = 0;
        String s;
        for (int i = 0; i <= b; i++) {
            s = scanner.nextLine();
            if (s.equals("X++") || s.equals("++X")) {
                a++;
            } else if (s.equals("X--") || s.equals("--X")) {
                a--;
            }
        }
        System.out.println(a);
    }
}