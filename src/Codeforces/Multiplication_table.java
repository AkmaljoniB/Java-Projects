package Codeforces;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for (int i = 1; i < k; i++) {
            for (int j = 1; j < k; j++) {
                System.out.print(Integer.toString(i *j,k)+" ");
                if (i*j<10) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
