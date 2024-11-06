package For_and_Array;

import java.util.Arrays;
import java.util.Scanner;

public class For_and_Array13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Razmer Massive ");

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        n=n-1;
        for (int i=n; i>=0; i--){
            arr1[n-i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}