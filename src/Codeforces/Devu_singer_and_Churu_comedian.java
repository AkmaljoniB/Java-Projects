package Codeforces;

import java.util.Scanner;

public class Devu_singer_and_Churu_comedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int k = (n - 1) * 2;
        for (int i = 0; i < n; i++) d -= scanner.nextInt();
        d -= (n - 1) * 10;
        if (d >= 0) k += d / 5;
        else k = -1;
        System.out.println(k);
    }
}
