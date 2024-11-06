package Massive;


import java.util.Scanner;

public class Tok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Razmer Massive: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int a = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {

            if (i % 2 != 0 && arr[i] % 2 == 0) {
                a += arr[i];
            }
        }
        System.out.println(a);
    }
}
