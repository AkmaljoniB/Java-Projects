package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Ihab_can_not_become_Thanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]arr = new int[n*2];
        for (int i =0;i<n*2;i++)arr[i]=scanner.nextInt();
        Arrays.sort(arr);
        if (arr[0]==arr[n*2-1]) System.out.println(-1);
        else {
            for (int i = 0;i<n*2;i++) System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}
