package Codeforces;

import java.util.*;

public class Robin_Hood_in_the_city {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n];
            long s=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                s+=arr[i];
            }
            if(n>2){
                Arrays.sort(arr);
                if(arr[n/2]*(n*2L)<s)System.out.println(0);
                else System.out.println(arr[n/2]*(n*2L)-s+1);
            }else System.out.println(-1);
        }
    }
}