package Codeforces;

import java.util.Scanner;

public class Volshebnie_palochki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            System.out.println((a / 2) + a % 2);
        }
    }
}
