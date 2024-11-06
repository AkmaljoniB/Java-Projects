package Codeforces;

import java.util.Scanner;

public class Virashivaem_bakterii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int i = x;
        int k = 0;
        while (i != 1) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i--;
                i = i / 2;
                k++;
            }
        }
        System.out.println(k + 1);
    }
}
