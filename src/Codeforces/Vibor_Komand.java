package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Vibor_Komand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int s=0;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0) {
                if (5-arr[i]>=k){
                    s++;
                } else {
                    break;
                }
            }
        }
        System.out.println(s);
    }
}
