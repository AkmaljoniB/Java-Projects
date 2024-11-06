package Massive;

import java.util.Scanner;

public class Massive_Soda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long[] arr = new long[(int) a];
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextLong();
        }
        for (int i = 0; i < a; i++) {
            if (arr[i] == 13) {
                System.out.println("YES");
            } else if (arr[i] == 3) {
                System.out.println("YES");
            } else if (arr[i] == 5) {
                System.out.println("YES");
            } else if (arr[i] % 2 != 0 && arr[i] % 3 != 0 && arr[i] % 5 != 0 && arr[i] % 13 != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                
            }
        }
    }
}