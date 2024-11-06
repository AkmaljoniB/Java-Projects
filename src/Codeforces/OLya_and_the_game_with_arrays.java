package Codeforces;

import java.util.*;

public class OLya_and_the_game_with_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int t=sc.nextInt();t-->0;){
            int n=sc.nextInt(),min=Integer.MAX_VALUE;
            int[]arr=new int[n];
            for (int i=0;i<n;i++){
                int m=sc.nextInt();
                int[]a=new int[m];
                for (int j=0;j<m;j++)a[j]=sc.nextInt();
                Arrays.sort(a);
                arr[i]=a[1];
                min=Math.min(min,a[0]);
            }
            long s=0;
            Arrays.sort(arr);
            for(int i=1;i<n;i++)s+=arr[i];
            System.out.println(s+min);
        }
    }
}
