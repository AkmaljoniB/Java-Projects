package Codeforces;

import java.util.Scanner;

public class Viigrat_v_lotereyu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        while (n > 0) {
            if (n >= 100) {
                k += n / 100;
                n = n % 100;
            } else if (n >= 20) {
                k += n / 20;
                n = n % 20;
            } else if (n >= 10) {
                k += n / 10;
                n = n % 10;
            } else if (n >= 5) {
                k += n / 5;
                n = n % 5;
            } else {
                k++;
                n--;
            }
        }
        System.out.println(k);
    }
}