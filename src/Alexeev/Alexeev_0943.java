package Alexeev;

import java.util.Scanner;

public class Alexeev_0943 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();
        int x = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i != 0) {
                    if (arr[i - 1][m - 1] % 2 != 0) {
                        arr[i][j] = ((arr[i - 1][m - 1] * 2) + 1) - arr[i - 1][j];
                    } else {
                        arr[i][j] = arr[i - 1][0] + (1 + j);
                    }
                } else {
                    arr[i][j] = j;
                }
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }
        System.out.println(arr[y-1][x-1]);
//        System.out.println(Arrays.deepToString(arr));
    }
}
