package Codeforces;

import java.util.Scanner;

public class Make_it_ascending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            int k=0;
            for (int i = n-1; i >0 ; i--) {
                while (arr[i-1]>arr[i]){
                    arr[i-1]/=2;
                    k++;
                }
                if (arr[i-1]==arr[i]) {
                    if (arr[i - 1] != 0) {
                        arr[i - 1] /= 2;
                        k++;
                    } else {
                        k = -1;
                        break;
                    }
                }
            }
            System.out.println(k);
        }
    }
}
