package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Next_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[]arr = new Integer[n];
        for (int i = 0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        int a = n+1;
        if (arr[0]==1) {
            for (int i = 1; i < n; i++) {
                if (arr[i] != i + 1) {
                    a = i + 1;
                    break;
                }
            }
        }else a=1;
        System.out.println(a);
    }
}
