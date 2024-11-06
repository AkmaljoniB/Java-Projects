package Codeforces;

import java.util.Scanner;

public class Summa_2050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long t = scanner.nextLong();
            if (t % 2050 != 0) {
                System.out.println(-1);
            } else {
                String s = String.valueOf(t / 2050);
                int sum = 0;
                for (int j = 0; j < s.length(); j++) {
                    sum += Integer.parseInt(s.substring(j, j + 1));
                }
                System.out.println(sum);
            }
        }
    }
}