package Alexeev;

import java.util.Scanner;

public class Alexeev_0098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int f = 0, l = 0, k = 0;
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int i = 0, j = n - 1;
        while (i <= j) {
            if (arr[i] >= arr[j]) {
                if (k == 0) f += arr[i];
                else l += arr[i];
                i++;
            } else {
                if (k == 0) f += arr[j];
                else l += arr[j];
                j--;
            }
            k ^= 1;
        }
        System.out.println(f+":"+l);
    }
}
