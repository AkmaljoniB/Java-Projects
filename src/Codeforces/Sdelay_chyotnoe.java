package Codeforces;

import java.util.Scanner;

public class Sdelay_chyotnoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            int k = 0;
            if (Integer.parseInt(s.substring(s.length() - 1)) % 2 == 0) {
                System.out.println(0);
                k++;
            } else if (Integer.parseInt(s.substring(0, 1)) % 2 == 0) {
                System.out.println(1);
                k++;
            } else {
                for (int j = 0; j < s.length(); j++) {
                    if (Integer.parseInt(s.substring(j, j + 1)) % 2 == 0) {
                        System.out.println(2);
                        k++;
                        break;
                    }
                }
            }
            if (k == 0) {
                System.out.println(-1);
            }
        }
    }
}