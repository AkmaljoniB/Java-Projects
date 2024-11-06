package Codeforces;

import java.util.Scanner;

public class Mishka_i_igra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lm = 0, lk = 0;
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            if (k > m) {
                lk++;
            } else if (k < m) {
                lm++;
            }
        }
        if (lk>lm){
            System.out.println("Chris");
        } else if (lm>lk){
            System.out.println("Mishka");
        } else {
            System.out.println("Friendship is magic!^^");
        }
    }
}
