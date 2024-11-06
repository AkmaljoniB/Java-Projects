package For_and_Array;

import java.util.Arrays;
import java.util.Scanner;

public class For_and_Array12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i1 = 0; i1 < n; i1++) {
            if ((arr[i1] < 10) && (arr[i1] > 3)) {

                System.out.println(arr[i1]);
            }
        }
    }
}