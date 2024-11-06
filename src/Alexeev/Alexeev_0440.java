package Alexeev;

import java.util.Scanner;

public class Alexeev_0440 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (Math.pow(x, 2) + Math.pow(y, 2) <= 100) arr[0] = 1;
            else if (Math.pow(x-25, 2) + Math.pow(y, 2) <= 100) arr[1] = 1;
            else if (Math.pow(x-50, 2) + Math.pow(y, 2) <= 100) arr[2] = 1;
            else if (Math.pow(x-75, 2) + Math.pow(y, 2) <= 100) arr[3] = 1;
            else if (Math.pow(x-100, 2) + Math.pow(y, 2) <= 100) arr[4] = 1;

        }
        System.out.println(arr[0] + arr[1] + arr[2] + arr[3] + arr[4]);
    }
}
