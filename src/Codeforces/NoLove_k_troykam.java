package Codeforces;

import java.util.Scanner;

public class NoLove_k_troykam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] arr = new int[1000];
        for (int i = 1; i <= 1666; i++) {
            if (i%3!=0 && i%10 !=3){
                for (int j = 0 ; j<1000;j++) {
                    if (arr[j]==0) {
                        arr[j] = i;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            System.out.println(arr[a-1]);
        }
    }
}