package For_and_Array;

import java.util.Arrays;
import java.util.Scanner;

public class For_and_Array6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i]<0)
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max = "+max);
    }
}