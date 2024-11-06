package Codeforces;

import java.util.Scanner;

public class Holidays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        int k = 0;
        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] == 0) k++;
            else {
                if (arr[i] == 1 && arr[i - 1] == 1) {
                    k++;
                    arr[i]=0;
                } else if (arr[i] == 2 && arr[i - 1] == 2) {
                    k++;
                    arr[i]=0;
                } else if (arr[i] == 3) {
                    if (arr[i - 1] == 1 && arr[i - 2] != 1) arr[i] = 2;
                    else if (arr[i - 1] == 2 && arr[i - 2] != 2) arr[i] = 1;
                }
            }
        }
        System.out.println(k);
    }
}
