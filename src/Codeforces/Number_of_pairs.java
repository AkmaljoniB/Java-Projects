package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Number_of_pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            int i=0,j=n-1;long s=0;
            while (i<j){
                if (arr[i]+arr[j]<=r){
                    s+=(j-i);
                    i++;
                } else j--;
            }
            i=0;
            j=n-1;
            while (i<j){
                if (arr[i]+arr[j]<l){
                    s-=(j-i);
                    i++;
                } else j--;
            }
            System.out.println(s);
        }
    }
}
// 1 2 3 4 5