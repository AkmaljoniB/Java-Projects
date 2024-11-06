package Codeforces;

import java.util.Scanner;

public class When_living_turn_of_lights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[][] ar = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt() % 2;
                ar[i][j] = Math.abs(ar[i][j]-1);
                if (arr[i][j] == 1) {
                    ar[i][j] ^= 1;
                    if (j != 2) ar[i][j + 1] ^= 1;
                    if (i != 2) ar[i + 1][j] ^= 1;
                    if (j != 0) ar[i][j - 1] ^= 1;
                    if (i != 0) ar[i - 1][j] ^= 1;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print(ar[i][j]);
            System.out.println();
        }
    }
}