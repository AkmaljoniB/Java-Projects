package Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Musbii_toq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr1;
        int d=0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 != 0 && arr[i] > 0) {
                d++;
            }
        }
        arr1 = new int[d];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0 && arr[i] > 0) {
                for (int j = 0; j<d; j++) {
                    if (arr1[j]==0) {
                        arr1[j] = arr[i];
                        break;
                    }
                }
            }
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
