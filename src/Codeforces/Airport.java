package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Airport {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[]arr=new int[m];
        int s=0;
        for (int i=0;i<m;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int[]ar=Arrays.copyOf(arr,m);
        for (int i=0;i<n;i++) {
            s+=ar[m-1];
            ar[m-1]--;
            Arrays.sort(ar);
        }
        System.out.println(s);
        s=0;
        for (int i=0;i<n;i++) {
            int j = 0;
            for (;j<m;j++) {
                if (arr[j] > 0) {
                    s += arr[j];
                    arr[j]--;
                    break;
                }
            }
            Arrays.sort(arr);
        }
        System.out.println(s);
    }
}