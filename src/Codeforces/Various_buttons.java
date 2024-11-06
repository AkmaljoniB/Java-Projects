package Codeforces;

import java.util.Scanner;

public class Various_buttons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int u = 0, r = 0, d = 0, l = 0;
            String s ="YES";
            int x = 0,y=0;
            int[][]arr=new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0]=scanner.nextInt();
                arr[i][1]=scanner.nextInt();
            }
            java.util.Arrays.sort(arr, new java.util.Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    return Double.compare(a[0], b[0]);
                }
            });
            for (int i = 0; i < n; i++) {
                if (arr[i][0] > x) r++;
                if (arr[i][0] < x) l++;
                if (arr[i][1] > y) u++;
                if (arr[i][1] < y) d++;
                if (r!=0 && l!=0&&d!=0&&u!=0){
                    s="NO";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
