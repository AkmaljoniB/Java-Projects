package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Chestniy_play_off {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int[] arr = new int[4];
            for (int j = 0; j < 4; j++) {
                arr[j] = scanner.nextInt();
            }
            int max1 = Math.max(arr[0], arr[1]);
            int max2 = Math.max(arr[2], arr[3]);
            Arrays.sort(arr);
            if ((max1 == arr[2] && max2 == arr[3]) || (max1 == arr[3] && max2 == arr[2])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}