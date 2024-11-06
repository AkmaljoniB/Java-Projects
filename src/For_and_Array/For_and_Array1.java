package For_and_Array;

import java.util.Arrays;
import java.util.Scanner;

public class For_and_Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Razmer Massive");
        int n = scanner.nextInt();
        int a = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] % 2 == 0 && arr[i] < 0) {
                a += arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(a);
    }
}
