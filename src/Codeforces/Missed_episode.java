package Codeforces;

import java.util.*;

public class Missed_episode{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=new int[n][2];
        for(int i=1;i<=n;i++)arr[i-1][1]=i;
        for(int i=1;i<n;i++){
            int a=sc.nextInt()-1;
            arr[a][0]++;
        }
        Arrays.sort(arr, Comparator.comparingInt(a->a[0]));
        System.out.println(arr[0][1]);
    }
}