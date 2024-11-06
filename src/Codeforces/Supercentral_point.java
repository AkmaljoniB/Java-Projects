package Codeforces;

import java.util.Scanner;

public class Supercentral_point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int l1=0,l2=0,l3=0,l4=0;
            for (int j = 0; j < n; j++) {
                if (arr[i][0] > arr[j][0]&&arr[i][1]==arr[j][1])l1=1;
                if (arr[i][0] < arr[j][0]&&arr[i][1]==arr[j][1])l2=1;
                if (arr[i][0] ==arr[j][0]&&arr[i][1] >arr[j][1])l3=1;
                if (arr[i][0] ==arr[j][0]&&arr[i][1] <arr[j][1])l4=1;
            }
            if (l1+l2+l3+l4==4)k++;
        }
        System.out.println(k);
    }
}
