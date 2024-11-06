package Codeforces;

import java.util.Scanner;

public class Treasure_chest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int k = scanner.nextInt();
            if (y <= x) System.out.println(x);
            else System.out.println((y - x) <= k? y : y + y - x-k);

        }
    }
}
