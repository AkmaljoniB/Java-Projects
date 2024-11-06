package Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Hisob_Kardani_Musbi_Va_Manfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Razmer Massive");
        int n = scanner.nextInt();
        int s = 0 ;
        int d = 0 ;
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] > 0) {
                s += arr[i];
            }
            if (arr[i] < 0) {
                d -= arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(s);
        System.out.println(-d);
    }
}
