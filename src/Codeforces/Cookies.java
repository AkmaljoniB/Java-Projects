package Codeforces;

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = 0;
        for (int i = 0; i < n; i++) if (scanner.nextInt() % 2 != 0) t++;
        System.out.println(t % 2 == 0 ? n - t : t);
    }
}
