package Task;

import java.util.Arrays;
import java.util.Scanner;

public class Okhir_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int a = 0;

        for (int i = 0; i < n-1; i++) {
            arr[i] = scanner.nextInt();

            System.out.print(arr[i] + " ");
        }
        System.out.println(a);
        System.out.println(Arrays.toString(arr));
    }
}
