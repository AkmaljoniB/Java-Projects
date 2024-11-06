package Codeforces;

import java.util.Scanner;

public class Krasivaya_Matritsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                    System.out.println(Math.abs(2 - i )+ Math.abs(2 - j));
                }
            }
        }
    }
}
//        0 0 0 0 0         4 3 2 3 4
//        0 0 0 0 0         3 2 1 2 3
//        0 0 1 0 0         2 1 0 1 2
//        0 0 0 0 0         3 2 1 2 3
//        0 0 0 0 0         4 3 2 3 4