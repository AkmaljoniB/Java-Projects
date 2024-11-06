package For_and_Array;

import java.util.Arrays;
import java.util.Scanner;

public class For_and_Array8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Razmer Massive ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println("max= " + max);
        System.out.println("min= " + min);

        for (int i = 0; i < n; i++) {

            if (arr[i] == max) {
                arr[i] = min;
            }
        }

        for (int i = 0; i < n; i++) {

            if (arr[i] == min) {
                arr[i] = max;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}