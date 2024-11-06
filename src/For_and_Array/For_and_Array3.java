package For_and_Array;

import java.util.Arrays;
import java.util.Scanner;

public class For_and_Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Razmer Massive ");
        int n = scanner.nextInt();
        int d, v;
        int[] arr = new int[n];
        int Cymma = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            if ((arr[i] > 9)||(arr[i] < 10)) {
                d = arr[i] / 10;
                v = arr[i] % 10;
                Cymma += d + v;
            }
        }
        System.out.println(Cymma);
    }
}