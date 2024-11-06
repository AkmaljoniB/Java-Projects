package Codeforces;

import java.util.Scanner;

public class Rudolph_and_the_cutting_of_the_rope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = 0;
            while (n-- > 0) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (b < a) k++;
            }
            System.out.println(k);
        }
    }
}
