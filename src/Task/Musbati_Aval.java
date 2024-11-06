package Task;

import java.util.Arrays;
import java.util.Scanner;

public class Musbati_Aval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Razmer Massive: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int a = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                a = arr[i];
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(a);
    }
}
