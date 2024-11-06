package Codeforces;

import java.util.*;
public class Balanced_team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),max=1,j=1;
        int[]arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for (int i=0;j<n&&i<n;i++){
            while (j<n&&arr[j]-arr[i]<6)j++;
            max=Math.max(max,j-i);
        }
        System.out.println(max);
    }
}