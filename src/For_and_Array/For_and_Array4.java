package For_and_Array;

import java.util.Arrays;
import java.util.Scanner;

public class For_and_Array4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Razmer Massive");
        int n = scanner.nextInt();
        int c = 0, b = 0;
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            c += arr[i];
            b = c - (min + max);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Cummai mobayni 'min' : 'max' = " + b);

    }
}