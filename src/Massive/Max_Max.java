package Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Razmer Massive");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            count++;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[count-1]);
        System.out.println(arr[count-2]);
    }
}
