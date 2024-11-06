package Alexeev;

import java.util.Scanner;

public class Alexeev_0122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] max = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for (int i = n - 1; i >= 0; i--) {
            int maxNextLen = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i] &&max[j] > maxNextLen) maxNextLen = max[j];
            }
            max[i] = maxNextLen + 1;
        }
        int max1 = 0;
        for (int i = 0; i < n; i++) max1 = Math.max(max1,max[i]);
        System.out.println(max1);
    }
}
