package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Treugolnik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        arr[3] = scanner.nextInt();
        Arrays.sort(arr);
        if (arr[2] + arr[1] < arr[3] && arr[0] + arr[1] < arr[2]) {
            System.out.println("IMPOSSIBLE");
        } else if ((arr[2] + arr[1] == arr[3] && arr[0]+arr[1]<=arr[2]) || (arr[0] + arr[1] == arr[2] && arr[1]+arr[2]<=arr[3])) {
            System.out.println("SEGMENT");
        } else {
            System.out.println("TRIANGLE");
        }
    }
}