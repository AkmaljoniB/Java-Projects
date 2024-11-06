package For_and_Array;

import java.util.Arrays;
import java.util.Scanner;

public class For_and_Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Razmer Massive ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE, min1 = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        min1 = min;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            min1 = arr[i + 1];
            break;
        }

        System.out.println(min);
        System.out.println(min1);
    }
}