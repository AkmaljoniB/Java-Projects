package Alexeev;

import java.util.Scanner;

public class Alexeev_0196 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int i = 1, x = 0, y = -1;
        int length =  String.valueOf(n*n).length();
        int d_row = 0, d_colum = 1;
        while (i <= (n * n)) {
            if (x + d_row >= 0 && x + d_row < n && y + d_colum >= 0 && y + d_colum < n && arr[x + d_row][y + d_colum] == 0) {
                x += d_row;
                y += d_colum;
                arr[x][y] = i;
                i += 1;
            } else {
                if (d_colum == 1) {
                    d_colum = 0;
                    d_row = 1;
                } else if (d_row == 1) {
                    d_row = 0;
                    d_colum = -1;
                } else if (d_colum == -1) {
                    d_colum = 0;
                    d_row = -1;
                } else if (d_row == -1) {
                    d_row = 0;
                    d_colum = 1;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            for (int f = 0; f < n; f++) {
                System.out.print(arr[j][f]);
                if (arr[j][f]<10){
                    System.out.print("    ");
                } else if (arr[j][f]>=10 && arr[j][f]<100){
                    System.out.print("   ");
                } else if (arr[j][f]>=100 && arr[j][f]<=1000){
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}