package Codeforces;

import java.util.Scanner;

public class Kefa_i_pervie_shagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        int max=0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                a++;
            } else {
                if (a > max){
                    max = a;
                }
                a=1;
            }
        }
        if (a > max){
            max = a;
        }
        System.out.println(max);
    }
}